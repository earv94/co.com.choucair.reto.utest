package co.com.choucair.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestStepTwoPage {

    public static final Target INPUT_CITY = Target.the("where do we write our city").located(By.id("city"));

    public static final Target INPUT_ZIP = Target.the("where do we write our zip code").located(By.id("zip"));

    public static final Target NEXT_BUTTON = Target.the("button that shows us next page of the signup form")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
