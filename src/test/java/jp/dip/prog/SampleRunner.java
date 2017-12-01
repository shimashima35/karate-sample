package jp.dip.prog;

import com.intuit.karate.junit4.Karate;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = "classpath:jp/dip/prog/sample.feature")
@RunWith(Karate.class)
public class SampleRunner extends TestBase {
}
