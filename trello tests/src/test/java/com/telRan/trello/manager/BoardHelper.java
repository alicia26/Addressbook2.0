package com.telRan.trello.manager;


import com.telRan.trello.model.Board;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends HelperBase{

  public BoardHelper(WebDriver wd) {
    super(wd);
  }

  public void confirmBoardCreation() {
    click(By.cssSelector("button[type=submit]"));
  }

  public void fillBoardForm(Board board) {
    type(By.cssSelector("input.subtle-input"), board.getTitle());
  }

  public void createBoard() throws InterruptedException {
    initBoardCreation();
    fillBoardForm(new Board().setTitle("new Board"));
    confirmBoardCreation();
  }

  public void initBoardCreation() throws InterruptedException {
    Thread.sleep(3000);
    click(By.cssSelector("a.js-open-add-menu"));
    click(By.cssSelector("a.js-new-board"));
  }


  public int getBoardsCount() {
    return wd.findElements(By.cssSelector("ul.boards-page-board-section-list")).size();
  }
}
