package skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/*
 * Main Test Class
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" }, tags = {
		"@Bundle, @BareMinimum" }, monochrome = true, glue = "com.bundles.automation.steps", features = {
				"src/test/resources/skeleton" })
public class RunCukesTest {
}
