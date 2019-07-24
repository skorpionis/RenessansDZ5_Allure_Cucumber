package Steps;


import Page.AnotherRenessansVarPage;
import Page.ContributionsRenessansPage;
import Page.MainRenessansPage;
import Page.MyDriverClass;
import cucumber.api.java.After;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Тогда;
import org.junit.AfterClass;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class CucumberSteps {



    @Допустим("Ссылка")
    public void goToUrl() throws IOException {
        MyDriverClass.StartDriver();
    }
    @Допустим("Вклады")
    public void Vklad(){
        MainRenessansPage mainPage = new MainRenessansPage();
        mainPage.ClickableElement(mainPage.getVklad());
    }
    @Допустим("Выбрать {string}")
    public void Choose(String s){
        ContributionsRenessansPage contrPage = new ContributionsRenessansPage();
        WebElement el = contrPage.PoiskElementa(contrPage.getCurr(),s);
        contrPage.ClickableElement(el);
    }
    @Допустим("Сумма {string}")
    public void Sum(String s){
        ContributionsRenessansPage contrPage = new ContributionsRenessansPage();
        contrPage.ZapolneniePoley(contrPage.getSumVklada(), s);
    }
    @Допустим("На срок {string}")
    public void Srok(String s){
        ContributionsRenessansPage contrPage = new ContributionsRenessansPage();
        contrPage.ViborElementaa(contrPage.getSrok(),s);
    }
    @Допустим("Пополнение {string}")
    public void Gettin(String s){
        ContributionsRenessansPage contrPage = new ContributionsRenessansPage();
        contrPage.ZapolneniePoley(contrPage.getMesiachnoePopolnenie(), s);
    }
    @Допустим("Капитализация")
    public void Capitalizacia(){
        ContributionsRenessansPage contrPage = new ContributionsRenessansPage();
        contrPage.ClickableElement(contrPage.getCapitalizacia());
        contrPage.ojidalkaNadpisiTarifa();
    }
    @Допустим("Частичное снятие")
    public void Removing(){
        ContributionsRenessansPage contrPage = new ContributionsRenessansPage();
        contrPage.ClickableElement(contrPage.getChastichnoeSniatie());
        contrPage.ojidalkaNadpisiTarifaDr();
    }
    @Тогда("Расчеты по вкладу")
    public void Raschet(List<String> arrToCheck){
        AnotherRenessansVarPage anotherRenessansVarPage = new AnotherRenessansVarPage();
        List<WebElement> arr = anotherRenessansVarPage.elementStr();
        for (int i = 0; i < arrToCheck.size(); i++) {
            anotherRenessansVarPage.Proverka(arr.get(i),arrToCheck.get(i));
        }
    }
    @After
    public void Zavershenie(){
        MyDriverClass.ZavershenieDriver();
    }
}
