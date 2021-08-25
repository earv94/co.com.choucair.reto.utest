package co.com.choucair.reto.utest.tasks;

import co.com.choucair.reto.utest.model.UtestData;
import co.com.choucair.reto.utest.userinterface.UtestStepFourPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillStepFourSignupForm implements Task {

    private UtestData fill;

    public FillStepFourSignupForm(UtestData fill){
        this.fill = fill;
    }

    public static FillStepFourSignupForm onThePage(UtestData fill) {
        return Tasks.instrumented(FillStepFourSignupForm.class, fill);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(fill.getStrPassword()).into(UtestStepFourPage.INPUT_PASSWORD),
                Enter.theValue(fill.getStrConfirmPass()).into(UtestStepFourPage.INPUT_PASSWORD_CONFIRMATION),
                Click.on(UtestStepFourPage.TERMS_CHECK),
                Click.on(UtestStepFourPage.POLICY_CHECK),
                Click.on(UtestStepFourPage.COMPLETE_BUTTON));
    }
}
