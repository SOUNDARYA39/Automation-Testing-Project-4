package sikuliproject;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliNotepad {

	public static void main(String[] args) throws Throwable {
		
   // WebDriverManager.chromedriver().setup();
   // WebDriver driver= new ChromeDriver();
   // driver.get("http://localhost:8888/index.php?action=index&module=Home");
		
		Screen sc = new Screen();
		Pattern minibar = new Pattern("D:\\selenium notes\\Selenium QCO-JSAJAD-M\\sikuliproject\\minibar.png.PNG");
		sc.click(minibar);
		Pattern search = new Pattern("D:\\selenium notes\\Selenium QCO-JSAJAD-M\\sikuliproject\\sear.png");
		sc.click(search);
		
		sc.type(search, "notepad");
		Thread.sleep(1000);
		Robot rob= new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		
		Pattern write = new Pattern("D:\\selenium notes\\Selenium QCO-JSAJAD-M\\sikuliproject\\write.png");
	    sc.type(write, "standalone app automation");
	    
	    Pattern file = new Pattern("D:\\selenium notes\\Selenium QCO-JSAJAD-M\\sikuliproject\\file.png");
	   sc.click(file);
	    
	    rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
	    
	    rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
	    
	    rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
	    
	    rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
	    
	    rob.keyPress(KeyEvent.VK_ENTER);
	    rob.keyRelease(KeyEvent.VK_ENTER);
	    
	    Pattern type = new Pattern("D:\\selenium notes\\Selenium QCO-JSAJAD-M\\sikuliproject\\type.png");
	   sc.click(type);
	   
	   rob.keyPress(KeyEvent.VK_DOWN);
	   rob.keyRelease(KeyEvent.VK_DOWN);
	   
	   rob.keyPress(KeyEvent.VK_DOWN);
	    rob.keyRelease(KeyEvent.VK_DOWN);
	    
	    rob.keyPress(KeyEvent.VK_ENTER);
	    rob.keyRelease(KeyEvent.VK_ENTER);
	    
	   
	    Pattern savetext = new Pattern("D:\\selenium notes\\Selenium QCO-JSAJAD-M\\sikuliproject\\savetext.png");
	    sc.type(savetext, "autoStandaloneAppUsingSnippet1");
	
	   Pattern save = new Pattern("D:\\selenium notes\\Selenium QCO-JSAJAD-M\\sikuliproject\\save.png");
	sc.click(save);
	
	Pattern close = new Pattern("D:\\selenium notes\\Selenium QCO-JSAJAD-M\\sikuliproject\\close1.png");
	
	sc.click(close);
	
	}

}
