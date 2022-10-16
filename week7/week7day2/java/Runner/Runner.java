package Runner;

import Steps.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/features/Login.feature"},
				glue= {"Steps"},
				monochrome = true,
				publish = true)
//				tags = "@Smoke")
//				tags = "not @Smoke")
//				tags = "@Smoke and @sanity") // all the scenarios having both @Smoke and @Sanity
//				tags = "@Smoke or @Sanity") // all the scenarios with either @Smoke or @Sanity
public class Runner extends BaseClass{

}
