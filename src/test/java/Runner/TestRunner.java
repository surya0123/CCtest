package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/Login.feature",
        glue = "src/test/java/org/example/stepdef/Logintest.java"
)
public class TestRunner {

}
