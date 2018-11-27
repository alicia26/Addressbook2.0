import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestWithList extends TestBase{
  @Test
  public void listleftMenuTest() throws InterruptedException {
    openSite("https://jqueryui.com");
    List<WebElement> menu =
            wd.findElements(By.cssSelector("#sidebar li"));
    int size = menu.size();
    System.out.println(size);
    for (int i = 0; i <= size - 1; i++) {
      Thread.sleep(2000);
      WebElement menu1 = wd.findElement(
              By.cssSelector("#sidebar"));
      WebElement item = menu1.findElement(
              By.cssSelector("li:nth-child(" + (i + 1) + ")"));
      String itemText = item.getText();

      item.click();


//      item.click();
      String pageTitle = wd.findElement(By.cssSelector("h1")).getText();
      System.out.println(itemText + " -> " + pageTitle);
    }
  }

    @Test
    public void listleftMenuTestBysubMenu() throws InterruptedException {
      openSite("https://jqueryui.com");

      List<WebElement> subMenu =
              wd.findElements(By.xpath("//aside[@class='widget']//h3")) ;
    //  int size = subMenu.size();
  //    String subMenuName =
  //  System.out.println(size);

    for(WebElement title: subMenu){
      String menu= title.getText();
      System.out.println(menu);
      title.click();
      //WebElement pageTitle
    }



          //    wd.findElement(By.xpath("//aside[@class='widget']")).getText();

      //WebElement itemsList = subMenu.
    }

//      }
//      System.out.println(size);
//      {
//        Thread.sleep(2000);
//        WebElement menu1 = wd.findElement(
//                By.cssSelector("#sidebar"));
//        WebElement item = menu1.findElement(
//                By.cssSelector("li:nth-child("+(i+1)+")"));
//        String itemText = item.getText();
//
//        item.click();
//
//
////      item.click();
//        String pageTitle = wd.findElement(By.cssSelector("h1")).getText();
//        System.out.println(itemText + " -> " + pageTitle);





  @Test
  public void listleftMenuTestVar2(){
    openSite("https://jqueryui.com");


    List<WebElement> items = wd.findElements(By.cssSelector("#sidebar li")) ;

    Iterator<WebElement>itr = items.iterator();
    while (itr.hasNext()){
//      WebElement menu;
//      menu = wd.findElement(By.cssSelector("#sidebar"));
//      WebElement item = menu.findElement(By.cssSelector("li:nth-child("+(i+1)+")"));
   //   String itemText = item.getText();
      System.out.println(itr.next().getText());


      //item.click();




//      item.click();
//      String pageTitle = wd.findElement(By.cssSelector("h1")).getText();
//      System.out.println(itemText + " -> " + pageTitle);
    }



  }
  }


