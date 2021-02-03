package automation;


import org.openqa.selenium.By;

public class Elements {

    public By css(String expression) {
        return By.cssSelector(expression);
    }

    public By xpath(String expression) {
        return By.xpath(expression);
    }

    public By id(String value) {
        return By.id(value);
    }

    public By name(String value) {
        return By.name(value);
    }

    public By classAttr(String value) {
        return By.className(value);
    }

    public By link(String text) {
        return By.linkText(text);
    }

    public By linkContains(String text) {
        return By.partialLinkText(text);
    }

    public By tag(String tagname) {
        return By.tagName(tagname);
    }
}
