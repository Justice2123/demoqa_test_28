package tests;


import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import components.ChekSimpleTest;


public class SimpleTestWithPageObject extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    ChekSimpleTest chekSimpleTest = new ChekSimpleTest();
    @Test
    void fillFormTests() {
        RegistrationPage.openPage();

        registrationPage
            .setFirstName ("Ivan")
            .setLastName("Ivanov")
            .setEmailInput("ivanov@yahoo.com")
            .setGenderWrapper("Male")
            .setUserNumberInput("7958473526")
            .setDateOfBirth("10", "October", "1990")
            .setSubjectInput("Biology")
            .setHobbiesWrapper("Reading")
            .setUploadPicture("src/test/resources/img/2.png")
            .setCurrentAddress("Lala street 44")
            .setDiv()
            .setState("NCR")
            .setCity("Noida")
            .setSubmit();



        chekSimpleTest
                .chekModalSizes("Thanks for submitting the form")
                .chekTableResponsive("Student Name", "Ivan Ivanov")
                .chekTableResponsive("Student Email", "ivanov@yahoo.com")
                .chekTableResponsive("Gender", "Male")
                .chekTableResponsive("Mobile", "7958473526")
                .chekTableResponsive("Date of Birth", "10 October,1990")
                .chekTableResponsive("Subjects", "Biology")
                .chekTableResponsive("Hobbies", "Reading")
                .chekTableResponsive("Picture", "2.png")
                .chekTableResponsive("Address", "Lala street 44")
                .chekTableResponsive("State and City", "NCR Noida");

    }

    @Test
    void minFormTest () {
        RegistrationPage.openPage();

        registrationPage
                .setFirstName ("Ivan")
                .setLastName("Ivanov")
                .setGenderWrapper("Male")
                .setUserNumberInput("7958473526")
                .setDiv()
                .setSubmit();


        chekSimpleTest
                .chekModalSizes("Thanks for submitting the form")
                .chekTableResponsive("Student Name", "Ivan Ivanov")
                .chekTableResponsive("Gender", "Male")
                .chekTableResponsive("Mobile", "7958473526");

    }

    @Test
    void negativeFormTest () {
        RegistrationPage.openPage();

        registrationPage
                .setFirstName ("Ivan")
                .setLastName("Ivanov")
                .setGenderWrapper("Male")
                .setUserNumberInput("ghjkl;hjk.")
                .setDiv()
                .setSubmit();

        chekSimpleTest.chekModalWindow();

    }


}