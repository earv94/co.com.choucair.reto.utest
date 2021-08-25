package co.com.choucair.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestStepFourPage {

    public static final Target INPUT_PASSWORD = Target.the("where do we write our password").located(By.id("password"));

    public static final Target INPUT_PASSWORD_CONFIRMATION = Target.the("where do we write again our password")
            .located(By.id("confirmPassword"));

    public static final Target TERMS_CHECK = Target.the("button that shows us next page of the signup form")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target POLICY_CHECK = Target.the("button that shows us next page of the signup form")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target COMPLETE_BUTTON = Target.the("button that shows us next page of the signup form")
            .located(By.id("laddaBtn"));

    public static final Target STRING_WELCOME = Target.the("Extrae el nombre del curso")
            .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));

}
