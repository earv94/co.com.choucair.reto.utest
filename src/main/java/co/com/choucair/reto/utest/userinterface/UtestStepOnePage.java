package co.com.choucair.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestStepOnePage {

    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target INPUT_BIRTH_MONTH = Target.the("where do we select the month of birth")
            .located(By.name("birthMonth"));
    public static final Target INPUT_BIRTH_DAY = Target.the("where do we select the day of birth")
            .located(By.name("birthDay"));
    public static final Target INPUT_BIRTH_YEAR = Target.the("where do we select the year of birth")
            .located(By.name("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("where do we write the spoken languages")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXT_BUTTON = Target.the("button that shows us next page of the signup form")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
