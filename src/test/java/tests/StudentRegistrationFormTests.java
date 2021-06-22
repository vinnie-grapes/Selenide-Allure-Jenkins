package tests;

import com.github.javafaker.Faker;
import components.CheckResults;
import org.junit.jupiter.api.Test;
import pageObjects.RegistrationPage;

import static io.qameta.allure.Allure.step;
import static util.RandomUtils.*;

public class StudentRegistrationFormTests extends TestBase {

    Faker faker = new Faker();

    String header = "Student Registration Form",
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = getRandomGender(),
            phone = faker.phoneNumber().subscriberNumber(10),
            monthOfBirth = getRandomMonth(),
            yearOfBirth = "2000",
            dayOfBirth = getRandomDay(),
            subject = "Art",
            hobby = getRandomHobby(),
            picture = "test.jpeg",
            currentAddress = faker.address().fullAddress(),
            state = "NCR",
            city = "Noida",
            tableTitle = "Thanks for submitting the form";

    RegistrationPage registrationPage = new RegistrationPage();
    CheckResults checkResults = new CheckResults();

    @Test
    void successfulSubmitFormTest() {
        log.info("@Test");
        step("Open students registration form", () -> {
            registrationPage.openPage();
            registrationPage.checkHeader(header);
        });

        step("Fill students registration form", () -> {
            step("Fill common data", () -> {
                registrationPage.typeFirstName(firstName);
                registrationPage.typeLastName(lastName);
                registrationPage.typeUserEmail(userEmail);
                registrationPage.typeGender(gender);
                registrationPage.typeUserNumber(phone);
            });
            step("Set date", () -> {
                registrationPage.setDate(dayOfBirth, monthOfBirth, yearOfBirth);
            });
            step("Set subjects", () -> {
                registrationPage.typeSubjects(subject);
            });
            step("Set hobbies", () -> {
                registrationPage.typeHobbies(hobby);
            });
            step("Upload image", () -> {
                registrationPage.typePicture(picture);
            });
            step("Set address", () -> {
                registrationPage.typeAddress(currentAddress);
                registrationPage.typeState(state);
                registrationPage.typeCity(city);
            });
            step("Submit form", () ->
                    registrationPage.submitButton());
        });

        step("Verify successful form submit", () -> {
            checkResults.checkTitle(tableTitle);
            checkResults.checkName(firstName, lastName);
            checkResults.checkEmail(userEmail);
            checkResults.checkGender(gender);
            checkResults.checkPhone(phone);
            checkResults.checkDateOfBirth(dayOfBirth, monthOfBirth, yearOfBirth);
            checkResults.checkSubjects(subject);
            checkResults.checkHobbies(hobby);
            checkResults.checkPicture(picture);
            checkResults.checkAddress(currentAddress);
            checkResults.checkCity(state, city);
        });
    }
}
