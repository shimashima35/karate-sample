package jp.dip.prog;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "classpath:jp/dip/prog/sample.feature")
public class SampleRunner extends TestBase {
}
