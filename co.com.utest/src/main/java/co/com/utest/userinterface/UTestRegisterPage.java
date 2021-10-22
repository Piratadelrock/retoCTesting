package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegisterPage {

    public static final Target REGISTER_BUTTON = Target.the("boton registro")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_NOMBRE = Target.the("donde escribimos el nombre")
            .located(By.id("firstName"));
    public static final Target INPUT_APELLIDO = Target.the("donde escribimos el apellido")
            .located(By.id("lastName"));
    public static final Target INPUT_CORREO = Target.the("donde escribimos el correo")
            .located(By.id("email"));
    public static final Target SELECT_MES = Target.the("donde seleccionamos el mes")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DIA = Target.the("donde seleccionamos el dia")
            .located(By.id("birthDay"));
    public static final Target SELECT_ANIO = Target.the("donde seleccionamos el año")
            .located(By.id("birthYear"));

    //next, complete
    public static final Target NEXT_BUTTON = Target.the("boton siguiente y completado")
            .located(By.xpath("//span[contains(text(),'Next')] | //a[@id='laddaBtn']"));

//solo rellena informacion pero no se valida
    public static final Target INPUT_CIUDAD = Target.the("donde escribimos la ciudad")
            .located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("donde escribimos codico postal")
            .located(By.id("zip"));


//continua el proceso despues de que se solucione lo anterior
    public static final Target INPUT_CLAVE = Target.the("ingresar clave")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMAR_CLAVE = Target.the("confirmar clave")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERMINOS = Target.the("Acepta los terminos")
            .located(By.xpath("//*[contains(@ng-class,'{error: userForm.termOfUse.$error.required}')]"));
    public static final Target CHECK_POLITICAS = Target.the("Acepta las politicas")
            .located(By.xpath("//*[contains(@ng-class,'{error: userForm.privacySetting.$error.required}')]"));

}

