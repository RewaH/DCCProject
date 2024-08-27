package com.testground.testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features="src\\test\\resources\\Features\\login.feature",
glue= {"com.testground.stepsdefinition"},
tags="@smoke",
monochrome= true,
plugin= {"pretty","html:target/HtmlReports/report.html",
		"json:target/JsonReports/report.json"}
)
//plugin= {"pretty","json:target/JsonReports/report.json"}
//plugin= {"pretty","junit:target/JUnitReports/report.junit"})


public class TestRunner {

}
