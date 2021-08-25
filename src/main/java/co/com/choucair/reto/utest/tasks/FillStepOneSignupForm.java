package co.com.choucair.reto.utest.tasks;

import co.com.choucair.reto.utest.model.UtestData;
import co.com.choucair.reto.utest.userinterface.UtestStepOnePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;

public class FillStepOneSignupForm implements Task {

    private UtestData fill;

    public FillStepOneSignupForm(UtestData fill){
        this.fill= fill;
    }

    public static FillStepOneSignupForm onThePage(UtestData fill) {
        return Tasks.instrumented(FillStepOneSignupForm.class, fill);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(fill.getStrFirstName()).into(UtestStepOnePage.INPUT_FIRST_NAME),
                Enter.theValue(fill.getStrLastName()).into(UtestStepOnePage.INPUT_LAST_NAME),
                Enter.theValue(fill.getStrEmail()).into(UtestStepOnePage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(fill.getStrBirthMonth()).from(UtestStepOnePage.INPUT_BIRTH_MONTH),
                SelectFromOptions.byVisibleText(fill.getStrBirthDay()).from(UtestStepOnePage.INPUT_BIRTH_DAY),
                SelectFromOptions.byVisibleText(fill.getStrBirthYear()).from(UtestStepOnePage.INPUT_BIRTH_YEAR),
                Type.theValue(fill.getStrlanguage()).into(UtestStepOnePage.INPUT_LANGUAGES).thenHit(Keys.ENTER),
                Click.on(UtestStepOnePage.NEXT_BUTTON)
        );
    }

}
