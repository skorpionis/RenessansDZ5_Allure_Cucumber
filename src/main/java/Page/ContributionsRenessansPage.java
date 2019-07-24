package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Ariec on 24.07.2019.
 */
public class ContributionsRenessansPage extends BaseRenPage {


    @FindBy(xpath = "//input[@name='amount']")
    private WebElement sumVklada;
    @FindBy(xpath = "//select[@class='calculator__slide-input js-slide-value']")
    private WebElement srok;
    @FindBy(xpath = "//input[@name='replenish']")
    private WebElement mesiachnoePopolnenie;
    @FindBy(xpath = "//span[@class='calculator__currency-field-btn']")
    private List<WebElement> curr;
    @FindBy(xpath = "//input[@name='capitalization']/..")
    private WebElement capitalizacia;
    @FindBy(xpath = "//input[@name='partial_out']/..")
    private WebElement chastichnoeSniatie;
    @FindBy(xpath = "//div[@class='calculator__result-block']/*")
    private WebElement blockResult;
    @FindBy(xpath = "//span[@class='js-deposit-name']")
    private WebElement itogTarifaShapka;

    public void ojidalkaNadpisiTarifaDr(){
        new WebDriverWait(driver, 5).until(ExpectedConditions.
                textToBePresentInElement(itogTarifaShapka, "Без границ"));
    }
    public void ojidalkaNadpisiTarifa(){
        new WebDriverWait(driver, 5).until(ExpectedConditions.
                textToBePresentInElement(itogTarifaShapka, "Ренессанс Накопительный"));
    }

    public List<WebElement> getCurr() {
        return curr;
    }

    public WebElement getSumVklada() {
        return sumVklada;
    }

    public WebElement getSrok() {
        return srok;
    }

    public WebElement getMesiachnoePopolnenie() {
        return mesiachnoePopolnenie;
    }

    public WebElement getCapitalizacia() {
        return capitalizacia;
    }

    public WebElement getChastichnoeSniatie() {
        return chastichnoeSniatie;
    }

    public WebElement getBlockResult() {
        return blockResult;
    }

    public WebElement getItogTarifaShapka() {
        return itogTarifaShapka;
    }
}
