package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage{

    BaseTest basetest = new BaseTest();
    @FindBy(id = "orb-search-q") private WebElement searchField;
    @FindBy(css ="[data-result-number='1'] [itemprop='headline'] a") private WebElement firstTitle;
    @FindBy(id = "orb-search-button") private WebElement button;
    @FindBy(css =".island [property='name'].no-margin") private WebElement linkTitle;


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
   /** public void init(WebDriver driver) {
        init(BaseTest.getDriver());
        System.out.println("Trump");
    }**/


    public boolean isSearchFieldEnabled() {
        System.out.println("Trump3");
        return searchField.isEnabled();
    }

    public void clickSearch() {
        searchField.click();
    }

    public boolean isSearchButtonEnabled() {
        return button.isEnabled();
    }

    public void buttonSearch() {
       button.click();
    }

    public void printText(String text) {
        searchField.sendKeys(text);
    }

    public String getTextTitle() {
        return linkTitle.getText();
    }
    public void clickFirstLink() {
        firstTitle.click();
    }

   /** public boolean isSearchFieldEnabled() {
        init(BaseTest.getDriver());
        return searchField.isEnabled();
    }**/

}

