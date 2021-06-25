package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class PracticeFormElelemets {
    private SelenideElement firstNameInput = $("[id=firstName]"),
            lastNameInput = $("[id=lastName]"),
            userEmailInput = $("[id=userEmail]"),
            genderInput = $("[for='gender-radio-1']"),
            userNumberInput = $("[id=userNumber]"),
            currentAddressInput = $("[id=currentAddress]"),
            stateInput = $("[id=react-select-3-input]"),
            cityInput = $("[id=react-select-4-input]"),
            submitButton = $("#submit"),
    // Элементы проверки
            studentName = $x("//td[text()='Student Name']"),
            stundetEmail = $x("//td[text()='Student Email']"),
            gender = $x("//td[text()='Gender']"),
            userMobile = $x("//td[text()='Mobile']"),
            dateOfBirthday = $x("//td[text()='Date of Birth']"),
            address = $x("//td[text()='Address']"),
            stateAndCity = $x("//td[text()='State and City']");

    public void typeFirstName(String value) {
        firstNameInput.val(value);
    }

    public void typeLastName(String value) {
        lastNameInput.val(value);
    }

    public void typeUserEmail(String value) {
        userEmailInput.val(value);
    }

    public void typeGender() {
        genderInput.click();
    }

    public void typeUserNumber(String value) {
        userNumberInput.val(value);
    }

    public void typeCurrentAddress(String value) {
        currentAddressInput.val(value);
    }

    public void typeState(String value) {
        stateInput.val(value).pressEnter();
    }

    public void typeCity(String value) {
        cityInput.val(value).pressEnter();
    }

    public void clickSubmit() {
        submitButton.click();
    }

    // Методы проверки
    public void studentNameApprove(String firstName,
                                   String lastName,
                                   String userEmail,
                                   String userNumber,
                                   String dayOfBithday,
                                   String monthOfBithday,
                                   String yearOfBithday,
                                   String currentAddress,
                                   String state,
                                   String city) {
        studentName.parent().shouldHave(text(firstName + " " + lastName));
        stundetEmail.parent().shouldHave(text(userEmail));
        gender.parent().shouldHave(text("Male"));
        userMobile.parent().shouldHave(text(userNumber));
        dateOfBirthday.parent().shouldHave(text(dayOfBithday + " " + monthOfBithday + "," + yearOfBithday));
        address.parent().shouldHave(text(currentAddress));
        stateAndCity.parent().shouldHave(text(state + " " + city));
    }
}



