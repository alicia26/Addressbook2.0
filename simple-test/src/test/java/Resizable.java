import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Resizable extends TestBase {
  @Test
  public void resizeTest(){
    wd.get("http://localhost/tests/resize.html");

    WebElement resizeButton =
            wd.findElement(By.cssSelector(".ui-icon"));

    new Actions(wd)
            .clickAndHold(resizeButton)
            .moveByOffset(0,300)
            .release()
            .perform();
  }
}
