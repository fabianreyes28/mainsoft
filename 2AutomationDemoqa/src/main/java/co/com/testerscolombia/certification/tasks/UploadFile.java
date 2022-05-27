package co.com.testerscolombia.certification.tasks;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;

import static co.com.testerscolombia.certification.userInterfaces.FillInformation.BTN_UPLOAD_PICTURE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class UploadFile extends PageObject implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        File file = new File("C:\\Users\\Administrador\\Desktop\\AutoMainsoft\\Selenium_Logo.png");
        actor.attemptsTo(
                Ensure.that(file.exists()).isTrue(),
                WaitUntil.the(BTN_UPLOAD_PICTURE, isVisible()),
                Scroll.to(BTN_UPLOAD_PICTURE)
        );
        actor.attemptsTo(
                Click.on(BTN_UPLOAD_PICTURE)
        );

        try{
            Thread.sleep(1000);
            Robot robot = new Robot();
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection((file.getAbsolutePath())), null);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

        } catch (InterruptedException | AWTException e) {
            e.printStackTrace();
        }

    }

    public static Performable uploadFile(){
        return instrumented(UploadFile.class);
    }

}
