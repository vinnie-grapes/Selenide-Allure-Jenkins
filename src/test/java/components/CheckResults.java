package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CheckResults {
    private SelenideElement tableTitle = $("#example-modal-sizes-title-lg"),
            tableName = $x("//td[text()='Student Name']").parent(),
            tableEmail = $x("//td[text()='Student Email']").parent(),
            tableGender = $x("//td[text()='Gender']").parent(),
            tablePhone = $x("//td[text()='Mobile']").parent(),
            tableDateOfBirth = $x("//td[text()='Date of Birth']").parent(),
            tableSubjects = $x("//td[text()='Subjects']").parent(),
            tableHobby = $x("//td[text()='Hobbies']").parent(),
            tablePicture = $x("//td[text()='Picture']").parent(),
            tableAddress = $x("//td[text()='Address']").parent(),
            tableCity = $x("//td[text()='State and City']").parent();

    public void checkTitle(String title) {
        tableTitle.shouldHave(text(title));
    }

    public void checkName(String firstName, String lastName) {
        tableName.shouldHave(text(firstName + " " + lastName));
    }

    public void checkEmail(String userEmail) {
        tableEmail.shouldHave(text(userEmail));
    }

    public void checkGender(String gender) {
        tableGender.shouldHave(text(gender));
    }

    public void checkPhone(String phone) {
        tablePhone.shouldHave(text(phone));
    }

    public void checkDateOfBirth(String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        tableDateOfBirth.shouldHave(text(dayOfBirth + " " + monthOfBirth + "," + yearOfBirth));
    }

    public void checkSubjects(String subject) {
        tableSubjects.shouldHave(text(subject));
    }

    public void checkHobbies(String hobby) {
        tableHobby.shouldHave(text(hobby));
    }

    public void checkPicture(String picture) {
        tablePicture.shouldHave(text(picture));
    }

    public void checkAddress(String currentAddress) {
        tableAddress.shouldHave(text(currentAddress));
    }

    public void checkCity(String state, String city) {
        tableCity.shouldHave(text(state + " " + city));
    }
}