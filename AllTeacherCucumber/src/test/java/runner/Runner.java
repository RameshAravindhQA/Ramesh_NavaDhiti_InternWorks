package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features="src/test/java/Feature/Login.feature", glue="stepDefinitionPackage", monochrome = true, publish = true)
public class Runner extends AbstractTestNGCucumberTests{

}