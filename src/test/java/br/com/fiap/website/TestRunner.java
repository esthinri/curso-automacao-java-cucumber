package br.com.fiap.website;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberHtmlReport"},
        features = "classpath:features",
        glue = {"br.com.fiap.website.steps_definitions"}
)
public class TestRunner {
}
