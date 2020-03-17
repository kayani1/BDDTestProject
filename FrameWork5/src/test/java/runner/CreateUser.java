package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\kkayani\\git\\BDDTestProject\\FrameWork5\\src\\test\\java\\Feature\\SignUp.Feature",glue= {"stepdefination"})

public class CreateUser {

}
