package automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AutomationFunTest {

    @Test
    public void goToTestSite() {
        // Automation Prep
        UIAction i = new UIAction();
        Elements e = new Elements();

        // Automation activity
        i.openBrowser();
        i.gotoSite("https://trello.com");
        i.waitFor(5);

        i.closeBrowser();
    }


    @Test
    public void enterEmailClickSignUp() {
        // Automation Prep
        UIAction i = new UIAction();
        Elements e = new Elements();

        // Automation activity
        i.openBrowser();
        i.gotoSite("https://trello.com");
        i.waitFor(3);

        By email_input = e.css("input");
        i.write(email_input, "nijat yay!");
        i.waitFor(3);

        By signup_itsfree = e.css("[class='btn btn-wrap btn-success btn-lg px-4']");
        i.click(signup_itsfree);
        i.waitFor(3);

        i.closeBrowser();
    }


    @Test
    public void getFirstProductTitle() {
        // Automation Prep
        UIAction i = new UIAction();
        Elements e = new Elements();

        // Automation activity
        i.openBrowser();
        i.gotoSite("https://www.saucedemo.com/inventory.html");
        i.waitFor(3);

        By first_product_link = e.css(".inventory_list .inventory_item:nth-of-type(1) .inventory_item_name");
        i.click(first_product_link);
        i.waitFor(3);

        By inventory_description = e.css(".inventory_details_desc");
        WebElement inventoryDescriptionElem = i.findElement(inventory_description);
        String paragrah = inventoryDescriptionElem.getText();
        System.out.println(paragrah);

        By inventory_price = e.css(".inventory_details_price");  // location of price element
        WebElement invetoryPriceElem = i.findElement(inventory_price);     // go to the location, grab it as webelement
        String priceText = invetoryPriceElem.getText();
        System.out.println(priceText);

        i.closeBrowser();
    }


    @Test
    public void checkOutAndGetConfused() {
        // Automation Prep
        UIAction i = new UIAction();
        Elements e = new Elements();

        // Automation activity
        i.openBrowser();
        i.gotoSite("https://www.saucedemo.com/inventory.html");
        i.waitFor(3);

        By third_product = e.css(".inventory_list .inventory_item:nth-of-type(5) .inventory_item_name");
        i.click(third_product);
        i.waitFor(2);
        i.goBack();

        i.waitFor(2);
        By third_product_add_cart = e.css("div:nth-of-type(5) > .pricebar > .btn_inventory.btn_primary");
        i.highlight(third_product_add_cart);
        i.click(third_product_add_cart);
        i.waitFor(2);

        By cart_icon = e.css(".shopping_cart_badge");
        i.click(cart_icon);
        i.waitFor(2);

        By checkout_bttn = e.css(".checkout_button");
        i.highlight(checkout_bttn);
        i.click(checkout_bttn);
        i.waitFor(2);

        i.closeBrowser();

    }



}











