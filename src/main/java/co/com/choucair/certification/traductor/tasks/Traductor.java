package co.com.choucair.certification.traductor.tasks;

import co.com.choucair.certification.traductor.model.GoogleTraductorData;
import co.com.choucair.certification.traductor.userinterface.traductorGoogleText;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;


public class Traductor implements Task {
    List<GoogleTraductorData> GoogleTraductorData;
    public Traductor(List<GoogleTraductorData> googleTraductorData) {
        this.GoogleTraductorData = googleTraductorData;
    }

    public static Traductor FromEnglishToSpanish(List<GoogleTraductorData> googleTraductorData) {
        return Tasks.instrumented(Traductor.class, googleTraductorData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(GoogleTraductorData.get(0).getPalabrai()).into(traductorGoogleText.INPUT_TEXT));
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
