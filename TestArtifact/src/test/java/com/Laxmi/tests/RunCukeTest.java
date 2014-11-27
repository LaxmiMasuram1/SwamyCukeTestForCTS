package com.Laxmi.tests;
 
import static org.junit.Assert.fail;
import jdk.nashorn.internal.objects.annotations.Setter;

import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty", "html:target/cucumber"})
public class RunCukeTest {

	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	


}
