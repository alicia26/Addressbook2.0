package com.telRan.trello.tests;

import com.telRan.trello.model.Board;
import org.testng.annotations.Test;

public class BoardCreationTests extends  TestBase {
  @Test
  public  void boardCreationTestUsingButtonPlus(){
    app.getBoardHelper().initBoardCreation();
    app.getBoardHelper().fillBoardForm(new Board().setTitle("new board plus button"));

  }
}
