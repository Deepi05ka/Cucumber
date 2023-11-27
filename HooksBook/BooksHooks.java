package com.HooksBook;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Base_Task;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BooksHooks extends Base_Task{
   
	@Before()
	public void beforescenario(Scenario sc) {
	System.out.println(sc.getName());	
	}
 
    @After()
    public void isfailed(Scenario sc) throws Exception {
      boolean isfailed=sc.isFailed();
      System.out.println("isfailed:"+isfailed);
    
      TakesScreenshot shots=(TakesScreenshot) driver;
     byte[] bytes= shots.getScreenshotAs(OutputType.BYTES);
      
       sc.attach(bytes, "image/png","Snap");
			
    }
}
