package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ariec on 24.07.2019.
 */
public class AnotherRenessansVarPage extends BaseRenPage {

    public List<WebElement> elementStr(){
        List<WebElement> arrElValues = new ArrayList<>();
        arrElValues.add(stavka);
        arrElValues.add(sniatie);
        arrElValues.add(popolnenie);
        arrElValues.add(nachislenie);
        return arrElValues;
    }

    private WebElement element = new ContributionsRenessansPage().getBlockResult();
    private WebElement stavka = element.findElement(By.xpath("//SPAN[@class='js-calc-rate']"));
    private WebElement nachislenie = element.findElement(By.xpath("//SPAN[@class='js-calc-earned']"));
    private WebElement popolnenie = element.findElement(By.xpath("//SPAN[@class='js-calc-replenish']"));
    private WebElement sniatie = element.findElement(By.xpath("//SPAN[@class='js-calc-result']"));



    public WebElement getElement() {
        return element;
    }

    public WebElement getStavka() {
        return stavka;
    }

    public WebElement getSniatie() {
        return sniatie;
    }

    public WebElement getPopolnenie() {
        return popolnenie;
    }

    public WebElement getNachislenie() {
        return nachislenie;
    }

}
