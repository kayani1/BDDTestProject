package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Intel\\FrameWork5\\src\\test\\java\\Feature\\SignUp.Feature",glue= {"Stepdefination1"})

public class Test1 {

}
