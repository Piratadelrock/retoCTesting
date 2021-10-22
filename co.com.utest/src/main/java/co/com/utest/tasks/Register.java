package co.com.utest.tasks;

import co.com.utest.model.UTestData;
import co.com.utest.userinterface.UTestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;


public class Register implements Task {

    private UTestData utestData;

    public Register(UTestData utestData) {
        this.utestData = utestData;

    }

    public static Register onThePage(UTestData utestData) {
        return Tasks.instrumented(Register.class,utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestRegisterPage.REGISTER_BUTTON),
                Enter.theValue(utestData.getStrNombre()).into(UTestRegisterPage.INPUT_NOMBRE),
                Enter.theValue(utestData.getStrApellido()).into(UTestRegisterPage.INPUT_APELLIDO),
                Enter.theValue(utestData.getStrCorreo()).into(UTestRegisterPage.INPUT_CORREO),

                SelectFromOptions.byVisibleText(utestData.getStrMes()).from(UTestRegisterPage.SELECT_MES),
                SelectFromOptions.byVisibleText(utestData.getStrDia()).from(UTestRegisterPage.SELECT_DIA),
                SelectFromOptions.byVisibleText(utestData.getStrAno()).from(UTestRegisterPage.SELECT_ANIO),

                Click.on(UTestRegisterPage.NEXT_BUTTON),

                //location
                Enter.theValue(utestData.getStrCiudad()).into(UTestRegisterPage.INPUT_CIUDAD),
                Hit.the(Keys.ARROW_DOWN).into(UTestRegisterPage.INPUT_CIUDAD),
                Hit.the(Keys.ENTER).into(UTestRegisterPage.INPUT_CIUDAD),

                Enter.theValue(utestData.getStrPostal()).into(UTestRegisterPage.INPUT_ZIP),
                Click.on(UTestRegisterPage.NEXT_BUTTON),

                //devices
                Click.on(UTestRegisterPage.NEXT_BUTTON),
                //last step
                Enter.theValue(utestData.getStrClave()).into(UTestRegisterPage.INPUT_CLAVE),
                Enter.theValue(utestData.getStrConfirmarClave()).into(UTestRegisterPage.INPUT_CONFIRMAR_CLAVE),
                Click.on(UTestRegisterPage.CHECK_TERMINOS),
                Click.on(UTestRegisterPage.CHECK_POLITICAS),
                Click.on(UTestRegisterPage.NEXT_BUTTON)

                );
    }
}
