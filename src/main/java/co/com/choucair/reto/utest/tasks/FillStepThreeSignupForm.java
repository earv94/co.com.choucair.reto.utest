package co.com.choucair.reto.utest.tasks;

import co.com.choucair.reto.utest.model.UtestData;
import co.com.choucair.reto.utest.userinterface.UtestStepThreePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class FillStepThreeSignupForm implements Task {

    private UtestData fill;

    public FillStepThreeSignupForm(UtestData fill){
        this.fill= fill;
    }

    public static FillStepThreeSignupForm onThePage(UtestData fill) {
        return Tasks.instrumented(FillStepThreeSignupForm.class, fill);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(UtestStepThreePage.DEVICE_BUTTON),
                Enter.theValue(fill.getStrDevice()).into(UtestStepThreePage.INPUT_DEVICE).thenHit(Keys.ENTER),
                Click.on(UtestStepThreePage.MODEL_BUTTON),
                Enter.theValue(fill.getStrModel()).into(UtestStepThreePage.INPUT_MODEL).thenHit(Keys.ENTER),
                Click.on(UtestStepThreePage.OS_BUTTON),
                Enter.theValue(fill.getStrOS()).into(UtestStepThreePage.INPUT_OS).thenHit(Keys.ENTER),
                Click.on(UtestStepThreePage.NEXT_BUTTON));
    }
}
