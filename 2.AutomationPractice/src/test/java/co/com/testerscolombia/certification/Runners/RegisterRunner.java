package co.com.testerscolombia.certification.Runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith( CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register.feature",
        glue = "co.com.testerscolombia.certification.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
public class RegisterRunner {
}
