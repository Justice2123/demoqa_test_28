package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {

    private SelenideElement userName = $("#userName"),
            userEmail = $("#userEmail"),
            currentAddress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            scrollForm = $(".body-height"),
            submitForm = $("#submit");


    public static void openPage() {
        open("/text-box");
        $(".text-center").shouldHave(text("Text Box"));
    }

    public TextBoxPage setUserName(String value) {
        userName.setValue(value);

        return this;
    }

    public TextBoxPage setUserEmail(String value) {
        userEmail.setValue(value);

        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddress.setValue(value);

        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddress.setValue(value);

        return this;
    }

    public TextBoxPage setScrollForm() {
        scrollForm.scrollTo();

        return this;
    }

    public TextBoxPage setSubmitForm() {
        submitForm.click();

        return this;
    }

}
