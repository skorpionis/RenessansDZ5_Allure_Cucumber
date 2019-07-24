package Page;

import cucumber.api.java.After;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;


public class BaseRenPage {
    WebDriver driver = MyDriverClass.getDriver();

    public BaseRenPage() {
        PageFactory.initElements(driver, this);
    }

    @After
    public void Vihod(){
        MyDriverClass.ZavershenieDriver();
    }

    public void ClickableElement(WebElement element) {
        new WebDriverWait(driver, 20)
                .until(ExpectedConditions.elementToBeClickable(element)).click();
    }


    public void ZapolneniePoley(WebElement element, String text) {
        ClickableElement(element);
        element.sendKeys(text);
    }


    public WebElement PoiskElementa(List<WebElement> arr, String s) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getText().equalsIgnoreCase(s)) {
                ClickableElement(arr.get(i));
                return arr.get(i);
            }
        }Assert.fail("Net elementa na stranice " + s); return null;
    }

    public void ViborElementaa(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByValue(text);
    }
    public void Proverka(WebElement element, String text){
        Assert.assertEquals(text, element.getText());
    }

}
