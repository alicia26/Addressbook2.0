import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSimpleTest  extends  TestBase{

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
  public void searchTestWithEnterVar1(){
    openSite("https://jqueryui.com");
    typeOnSearchField("Button");
  proceedToSearchClickEnter();

    String actualText = getElementsText(By.cssSelector("h1 span"));
    System.out.println(actualText);

    Assert.assertEquals(actualText, "button");

  }
  @Test
  public void searchTestWithEnterVar2(){
    openSite("https://jqueryui.com");
    typeOnSearchField("Button"+ Keys.ENTER);


    String actualText = getElementsText(By.cssSelector("h1 span"));
    System.out.println(actualText);

    Assert.assertEquals(actualText, "button");

  }


}
