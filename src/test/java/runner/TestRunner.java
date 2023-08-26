package runner;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.*;

@CucumberOptions(features="src/test/java/features",glue="stepDefination", tags= ("@Sanity or @Regression"),monochrome=true,
plugin= {"pretty","json:target/json-report/cucumber.json","html:target/html-report/cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests{
		
	}

