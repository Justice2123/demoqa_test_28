package components;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;




public class ChekSimpleTest {

    private SelenideElement exampleModalSizes = $("#example-modal-sizes-title-lg"),
            tableResponsive = $(".table-responsive"),
            modalWindow = $(".modal-dialog");


    public ChekSimpleTest chekModalSizes(String value) {
    exampleModalSizes.shouldHave(exactText(value));

    return this;
    }

    public ChekSimpleTest chekTableResponsive(String key, String value) {
        tableResponsive.$(byText(key)).sibling(0).shouldHave(text(value));

        return this;
    }

    public ChekSimpleTest chekModalWindow() {
        modalWindow.shouldNotBe(exist);

        return this;
    }

}

