package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Ariec on 24.07.2019.
 */
public class MainRenessansPage extends BaseRenPage{

    @FindBy(xpath = "//div[@class='service__title']/a[@href='/contributions/']")
    WebElement vklad ;

    public WebElement getVklad(){
        return vklad;
    }

}

