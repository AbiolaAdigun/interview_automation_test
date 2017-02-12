import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"prett", "html:target/html/"},
		features = "src/test/resource",
		tags = ("@LogIn")
)




public class RunnerTest {

	}
