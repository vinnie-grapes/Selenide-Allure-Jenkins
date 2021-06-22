package pageObjects;

import com.codeborne.selenide.SelenideElement;
import components.Calendar;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    private SelenideElement header = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            setGender = $("#genterWrapper"),
            userPhoneInput = $("#userNumber"),
            setSubjects = $("#subjectsInput"),
            setHobby = $("#hobbiesWrapper"),
            pictureUpload = $("#uploadPicture"),
            addressInput = $("#currentAddress"),
            setState = $("#react-select-3-input"),
            setCity = $("#react-select-4-input"),
            submit = $("#submit");

    public void openPage () {
        open("https://demoqa.com/automation-practice-form");
    }

    public void checkHeader(String value) {
        header.shouldHave(text(value));
    }

    public void typeFirstName(String value) {
        firstNameInput.val(value);
    }

    public void typeLastName(String value) {
        lastNameInput.val(value);
    }

    public void typeUserEmail(String value) {
        userEmailInput.val(value);
    }

    public void typeGender(String value) {
        setGender.$(byText(value)).click();
    }

    public void typeUserNumber(String value) {
        userPhoneInput.val(value);
    }

    public void setDate(String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        new Calendar().setDate(dayOfBirth, monthOfBirth, yearOfBirth);
    }

    public void typeSubjects(String value) {
        setSubjects.val(value).pressEnter();
    }

    public void typeHobbies(String value) {
        setHobby.$(byText(value)).click();
    }

    public void typePicture(String value) {
        pictureUpload.uploadFromClasspath("img/" + value);
    }

    public void typeAddress(String value) {
        addressInput.val(value);
    }

    public void typeState(String value) {
        setState.val(value).pressEnter();
    }

    public void typeCity(String value) {
        setCity.val(value).pressEnter();
    }

    public void submitButton() {
        submit.click();
    }
}