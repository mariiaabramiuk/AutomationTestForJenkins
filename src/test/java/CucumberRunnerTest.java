import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= {"html:target/cucumber.html", "json:target/report.json"},
        features = "/Users/mariiazatylna/Desktop/projects/AutomationTest/src/test/resources/features",
        glue = "steps",
        tags = "@smoke",
        dryRun = false
)
public class CucumberRunnerTest {
}
