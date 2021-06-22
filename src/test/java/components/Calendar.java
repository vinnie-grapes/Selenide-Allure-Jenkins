package components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


public class Calendar {
    private SelenideElement openCalendar = $("#dateOfBirthInput"),
            setMonth = $(".react-datepicker__month-select"),
            setYear = $(".react-datepicker__year-select");


    public void setDate(String dayOfBirth, String monthOfBirth, String yearOfBirth) {
        openCalendar.click();
        setMonth.selectOption(monthOfBirth);
        setYear.selectOption(yearOfBirth);
        $(String.format(".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)",
                dayOfBirth)).click();
    }
}



