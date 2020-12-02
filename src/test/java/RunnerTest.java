import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features = "src/test/resources/features",
    tags = {"@api"}, snippets = CucumberOptions.SnippetType.CAMELCASE, monochrome = false, strict = true, dryRun=false,
    plugin = {"pretty","json:target/cucumber-report-html/cucumber.json"})
public class RunnerTest {

}
