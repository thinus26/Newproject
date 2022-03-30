package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Login.feature"},glue= {"org.stepdef"},
monochrome=true,dryRun=false,
plugin= {"html:pretty","C:\\Users\\thinusd\\Desktop\\Cucumber\\target",
		"json:C:\\Users\\thinusd\\Desktop\\Cucumber\\target\\sam.json",
		"junit:C:\\Users\\thinusd\\Desktop\\Cucumber\\target\\sam2.xml"})
public class TestRunner{
	

}
