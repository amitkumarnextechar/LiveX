package com.nextechar.page.livex.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/com.nextechar.page.livex.features",glue={"com/nextechar/page/livex/testRunner"}, 
monochrome=true, plugin={"pretty","html:target/reports-testOutput"})

//We can get JUnit & JSON reports by using below Plugins

//For JSON:- plugin={"pretty","json:target/reports-testOutput/cucumber.json"}
//For JUnit:- plugin={"pretty","html:target/reports-testOutput/cucumber.xml"}

//To run any Test we have to add below parameter into the @cucumberOptions @name can be any
//tags="@smoketest" and same @name into the feature file before Feature or Scenerios

public class TestRunner {

}
