package tests;

import components.Calendar;
import org.junit.jupiter.api.Test;
import pages.PracticeFormElelemets;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
    String firstName = "Ivan",
            lastName = "Ivanov",
            userEmail = "test@test.ru",
            userNumber = "8800535335",
            dayOfBithday = "10",
            monthOfBithday = "May",
            yearOfBithday = "2004",
            currentAddress = "Moscow Lubynka 38",
            state = "NCR",
            city = "Delphi";


    PracticeFormElelemets practiceFormElelemets = new PracticeFormElelemets();
    Calendar calendar = new Calendar();

    @Test
    void PractiveFormTest() {
        open("https://demoqa.com/automation-practice-form");
        practiceFormElelemets.typeFirstName(firstName);
        practiceFormElelemets.typeLastName(lastName);
        practiceFormElelemets.typeUserEmail(userEmail);
        practiceFormElelemets.typeGender();
        practiceFormElelemets.typeUserNumber(userNumber);
        calendar.setDate(dayOfBithday, monthOfBithday, yearOfBithday);
        practiceFormElelemets.typeCurrentAddress(currentAddress);
        practiceFormElelemets.typeState(state);
        practiceFormElelemets.typeCity(city);
        practiceFormElelemets.clickSubmit();

        practiceFormElelemets.studentNameApprove(firstName,lastName,userEmail,userNumber,dayOfBithday,monthOfBithday,yearOfBithday,currentAddress,state,city);

    }
}
