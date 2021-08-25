package co.com.choucair.reto.utest.tasks;

import co.com.choucair.reto.utest.model.UtestData;
import co.com.choucair.reto.utest.userinterface.UtestStepTwoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;

public class FillStepTwoSignupForm implements Task {

    private UtestData fill;

    public FillStepTwoSignupForm(UtestData fill){
        this.fill= fill;
    }

    public static FillStepTwoSignupForm onThePage(UtestData fill) {
        return Tasks.instrumented(FillStepTwoSignupForm.class, fill);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(fill.getStrCity()).into(UtestStepTwoPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestStepTwoPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UtestStepTwoPage.INPUT_CITY),
                Enter.theValue(fill.getStrZip()).into(UtestStepTwoPage.INPUT_ZIP),
                Click.on(UtestStepTwoPage.NEXT_BUTTON)
        );
    }
}
