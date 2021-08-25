package co.com.choucair.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpPage {

    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to signup")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
