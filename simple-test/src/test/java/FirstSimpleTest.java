import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSimpleTest {
  WebDriver wd;

  @BeforeMethod
  public  void setUp(){
    wd = new ChromeDriver();
  }

  @Test
  public void searchTestWithLoupe(){
    openSite("https://jqueryui.com");
    typeOnSearchField("Button");
    proceedToSearch();

    String actualText = getElementsText(By.cssSelector("h1 span"));
    System.out.println(actualText);

    Assert.assertEquals(actualText, "button");

  }

  @Test
  public void searchTestWithLoupe(){
    openSite("https://jqueryui.com");
    typeOnSearchField("Button");
    proceedToSearch();

    String actualText = getElementsText(By.cssSelector("h1 span"));
    System.out.println(actualText);

    Assert.assertEquals(actualText, "button");

  }


  public String getElementsText(By locator) {
    return wd.findElement(locator)
            .getText().toLowerCase();
  }

  public void proceedToSearch() {
    wd.findElement(By.cssSelector(".icon-search")).click();
  }

  public void typeOnSearchField(String text) {
    wd.findElement(By.name("s")).click();
    wd.findElement(By.name("s")).clear();
    wd.findElement(By.name("s")).sendKeys(text);
  }

  public void openSite(String url) {
    wd.get(url);
  }

  @AfterMethod
  public void tearDown(){
    wd.quit();
  }
}
