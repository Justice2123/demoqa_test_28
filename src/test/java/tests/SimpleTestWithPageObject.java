package tests;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.ModalWindow;


public class SimpleTestWithPageObject extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    ModalWindow modalWindow = new ModalWindow();

    @Test
    void fillFormTests() {

        registrationPage.openPage();

        registrationPage
                .setFirstName("Ivan")
                .setLastName("Ivanov")
                .setEmailInput("ivanov@yahoo.com")
                .setGenderWrapper("Male")
                .setUserNumberInput("7958473526")
                .setDateOfBirth("10", "October", "1990")
                .setSubjectInput("Biology")
                .setHobbiesWrapper("Reading")
                .setUploadPicture("src/test/resources/img/2.png")
                .setCurrentAddress("Lala street 44")
                .setState("NCR")
                .setCity("Noida")
                .submit();


        modalWindow
                .checkModalHeader("Thanks for submitting the form")
                .checkResultTable("Student Name", "Ivan Ivanov")
                .checkResultTable("Student Email", "ivanov@yahoo.com")
                .checkResultTable("Gender", "Male")
                .checkResultTable("Mobile", "7958473526")
                .checkResultTable("Date of Birth", "10 October,1990")
                .checkResultTable("Subjects", "Biology")
                .checkResultTable("Hobbies", "Reading")
                .checkResultTable("Picture", "2.png")
                .checkResultTable("Address", "Lala street 44")
                .checkResultTable("State and City", "NCR Noida");

    }

    @Test
    void minFormTest() {
        registrationPage.openPage();

        registrationPage
                .setFirstName("Ivan")
                .setLastName("Ivanov")
                .setGenderWrapper("Male")
                .setUserNumberInput("7958473526")
                .submit();


        modalWindow
                .checkModalHeader("Thanks for submitting the form")
                .checkResultTable("Student Name", "Ivan Ivanov")
                .checkResultTable("Gender", "Male")
                .checkResultTable("Mobile", "7958473526");

    }

    @Test
    void negativeFormTest() {
        registrationPage.openPage();

        registrationPage
                .setFirstName("Ivan")
                .setLastName("Ivanov")
                .setGenderWrapper("Male")
                .setUserNumberInput("ghjkl;hjk.")
                .submit();

        modalWindow.modalWindowNotExist();

    }


}