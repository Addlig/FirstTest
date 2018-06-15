package Pages;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

import static Pages.BaseTest.*;
import static org.junit.Assert.assertTrue;

public class BaseSteps {

     HomePage homePage;
     public BaseSteps(WebDriver driver){
         this.homePage= new HomePage(driver);
     }

    @Step("Нажимается кнопка <Поиск>")
    public void clickSearch() {
        homePage.clickSearch();
    }
    @Step
    public void searchFieldEnabled() {
        System.out.println("Trump2");
        assertTrue("Поле ввода поиска не доступно",
                homePage.isSearchFieldEnabled());
    }
    @Step("Кнопка <Поиск> должна быть доступна")
    public void searchButtonEnabled() {
        assertTrue("Кнопка <Поиск> не доступна",
                homePage.isSearchButtonEnabled());
    }
    @Step("Вводятся Трамп")
    public void printText(String text) {
        homePage.printText(text);
    }

    @Step("Кнопка поиск")
    public void buttonSearch() {
        homePage.buttonSearch();
    }
    @Step("Первая ссылка")
    public void clickFirstLink() {
        homePage.clickFirstLink();
    }


    @Step("Проверка на Трамп")
    public void containsText() {
        assertTrue(homePage.getTextTitle().contains("Trump"));
        System.out.println("Trump");
    }
   /** @Step
    public void init() {
        homePage.init(BaseTest.getDriver());

    }**/
    @Step
    public void open() {
        BaseTest.getDriver().get("https://bbc.com");
    }
    @Step
    public void prepare() {
        BaseTest.prepareDriver();
    }
}
