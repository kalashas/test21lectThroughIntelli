package pages;


import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CatsPage {

    private final By minPrice = By.xpath("//*[@id=\"f_o_8_min\"]");
    private final By maxPrice = By.id("f_o_8_max");
    private final By minAge = By.id("f_o_1276_min");
    private final By maxAge = By.id("f_o_1276_max");
    private final By searchButton = By.xpath("//input[@class='b s12']");
    private final By rajons = By.id("region_select");


    public void fillMinPriceAndMaxPrice(String min, String max) {
        $(minPrice).sendKeys(min);
        $(maxPrice).sendKeys(max);
    }

    public void fillMinAgeAndMaxAge(String min, String max) {
        $(minAge).sendKeys(min);
        $(maxAge).sendKeys(max);
    }

    public void pressSearchButton(){
        $(searchButton).click();
    }

    public void changeRegion(String region) {
        if ("Riga".equals(region)) {
            $(rajons).selectOptionByValue("riga_f");
        } else if ("Jurmala".equals(region)) {
            $(rajons).selectOptionByValue("yurmala_f");
        }
    }



}
