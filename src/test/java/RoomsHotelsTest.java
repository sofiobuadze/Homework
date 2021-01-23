import com.codeborne.selenide.Condition;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RoomsHotelsTest extends ChromeRuner{
    @Test
    public void TestCrome() {

        $(byText("Tbilisi")).shouldBe(Condition.visible);
        $(byText("Kazbegi")).shouldBe(Condition.visible);
        $(byText("Kokhta")).shouldBe(Condition.visible);

        $(".module-intro__headline").shouldHave(Condition.text("Old City. New City. "));
        $(byText("#Tbilisi")).shouldBe(Condition.visible);

        $(byText("Kazbegi")).click();
        $(".module-intro__headline").shouldHave(Condition.text("I woke up like this"));
        $(".module-intro__text-container").$(By.tagName("h3")).shouldHave(Condition.text("#Kazbegi"));

        String str=$(".module-intro__text-container").$(By.tagName("h3")).getText();
        Assert.assertEquals("#Kazbegi", str);


    }


}


