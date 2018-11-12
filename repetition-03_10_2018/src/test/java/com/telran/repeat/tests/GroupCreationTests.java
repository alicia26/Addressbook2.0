package com.telran.repeat.tests;

import com.telran.repeat.model.Group;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupCreationTests extends TestBase {
  @DataProvider
  public Iterator<Object[]> validGroups() throws IOException {
    List<Object[]>list = new ArrayList<>();
    BufferedReader reader  = new BufferedReader(new FileReader(new File("src/test/resources/groups.csv")));
    String line = reader.readLine();
    while (line != null){
      String[] split = line.split(";");
      list.add(new Object[] {new Group().withGroupName(split[0])
              .withGroupHeader(split[1]).withGroupFooter(split[2])});
      line = reader.readLine();
    }
    return list.iterator();
  }
@Test (dataProvider = "validGroups")
  public void testGroupCreation(Group group){
  app.getNavigationHelper().openGroupsPage();
  int before = app.getGroupHelper().getGroupsCount();

  app.getGroupHelper().initGroupCreation();

  app.getGroupHelper().fillGroupForm(group);


//          .withGroupName("").withGroupHeader()
//          .withGroupName("new"), "new 1", "new"));
  app.getGroupHelper().confirmGroupCreation();
  app.getGroupHelper().returnToGroupsPage();

  int after = app.getGroupHelper().getGroupsCount();

 // System.out.println("count before is: " + before + " and count after is: " + after);
  Assert.assertEquals(after, before+1);

}
}
