package src.test.java;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "json:target/json"},
                 features = {"src/test/resources"}
                )
public class RunCucumberTests {


}
