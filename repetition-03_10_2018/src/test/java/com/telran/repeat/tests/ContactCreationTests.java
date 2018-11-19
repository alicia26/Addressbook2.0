package com.telran.repeat.tests;

import com.telran.repeat.model.Contact;
import com.telran.repeat.provider.StaticProvider;
import org.testng.annotations.Test;

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
}
