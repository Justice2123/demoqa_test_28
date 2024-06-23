package components;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ChekTextBox {

    private SelenideElement chekName =  $("#output #name"),
            chekEmailInput =  $("#output #email"),
            currentAddress = $("#output #currentAddress"),
            permanentAddress = $("#output #permanentAddress");


    public ChekTextBox chekName(String value) {
        chekName.shouldHave(text(value));

        return this;
    }

    public ChekTextBox chekEmail(String value) {
        chekEmailInput.shouldHave(text(value));

       return this;
    }

    public ChekTextBox chekCurrentAddress(String value) {
        currentAddress.shouldHave(text(value));

        return this;
    }

    public ChekTextBox chekPermanentAddress(String value) {
        permanentAddress.shouldHave(text(value));

        return this;
    }

}
