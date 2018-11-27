package com.telran.repeat.tests;

import com.telran.repeat.model.Contact;
import com.telran.repeat.provider.StaticProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ContactCreationTests extends TestBase {
  @Test(dataProvider = "validContacts", dataProviderClass = StaticProvider.class)
  public void createContactTest(Contact contact) {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().confirmContactCreation();
  }

  @Test
  public void createContactTest2() {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new Contact()
            .setfName("1John")
            .setlName("Smith")
            .setGroup("test5")
            .setPhoto(new File("src/test/resources/cat.jpg")));
    app.getContactHelper().confirmContactCreation();

  }
}
