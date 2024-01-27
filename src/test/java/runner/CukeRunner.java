package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {"src/test/resources/tests"},
        glue = {"steps", "utils"},
        plugin = {"pretty", "html:target/cucumber.html"}
)
public class CukeRunner {}
