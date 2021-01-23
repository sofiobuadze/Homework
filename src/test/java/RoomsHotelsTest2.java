import com.codeborne.selenide.Condition;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RoomsHotelsTest2 extends ChromeRuner{
    @Test
    public void TestCrome() {

        $(byText("Kokhta")).hover();
        //$(byText("Tbilisi")).shouldBe(Condition.visible);
        $(".header__top__submenu", 2).shouldHave(Condition.text("Rooms Overview"));

        $(".menu-toggler__icon").click();
        $(byText("Events Calendar")).click();
        $("#from").click();
        $(".ui-datepicker-next").click();
        $(byLinkText("7")).click();
        $(".ui-datepicker-div").shouldNotBe(Condition.visible);
        String date =  $("#from").getValue();
        Assert.assertEquals("07/02/21", date);
    }

}
