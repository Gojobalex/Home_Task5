package tests;

import com.github.javafaker.Faker;
import components.Calendar;
import org.junit.jupiter.api.Test;
import pages.PracticeFormElelemets;

import static com.codeborne.selenide.Selenide.open;

public class PracticeFormJavaFaker {
    Faker faker = new Faker();
    String firstName = faker.name().firstName(),
            lastName = faker.name().firstName(),
            userEmail = faker.internet().emailAddress(),
            userNumber = faker.phoneNumber().cellPhone(),
            dayOfBithday = "10",
            monthOfBithday = "May",
            yearOfBithday = "2004",
            currentAddress = faker.address().fullAddress(),
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

        practiceFormElelemets.StudentNameApprove(firstName,lastName,userEmail,userNumber,dayOfBithday,monthOfBithday,yearOfBithday,currentAddress,state,city);

    }
}
