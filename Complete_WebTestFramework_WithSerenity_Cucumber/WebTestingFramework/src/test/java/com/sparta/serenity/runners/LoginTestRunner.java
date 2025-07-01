package com.sparta.serenity.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = "com.sparta.serenity.steps",
        plugin = {
                "pretty",
                "html:target/testReport.html",
                "json:target/jsonReport.json"
        },
        publish = true
) class LoginTestRunner {
}