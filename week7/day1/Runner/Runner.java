package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
				glue="Steps",
				monochrome = true,
				publish = true)
public class Runner extends AbstractTestNGCucumberTests{

}
