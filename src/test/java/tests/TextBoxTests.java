package tests;

import components.ChekTextBox;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTests extends TestBase {


    @Test
    void fillFormTest() {

        TextBoxPage textBoxPage = new TextBoxPage();
        ChekTextBox chekTextBox = new ChekTextBox();


        TextBoxPage.openPage();
        textBoxPage
                .setUserName("Alex")
                .setUserEmail("alex@egorov.com")
                .setCurrentAddress("Some street 1")
                .setPermanentAddress("Another street 1")
                .setScrollForm()
                .setSubmitForm();


        chekTextBox
                .chekName("Alex")
                .chekEmail("alex@egorov.com")
                .chekCurrentAddress("Some street 1")
                .chekPermanentAddress("Another street 1");


    }

}
