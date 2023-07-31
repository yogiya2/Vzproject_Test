package options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\feature",glue="stepDefinition",tags="@ServiceTest")

public class testRunner {

}
//@EnterpriseTest,@OrderConTest,@CatalogTest@EnterpriseOrdersTest@ServiceTest