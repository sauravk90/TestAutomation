package pageObjects;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import java.util.*;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-analytics='Top stories_list-hierarchical-xs_article_']")
    List<WebElement> headlineTexts;

    public List<String> getHeadlines(){
        List<String> result = new ArrayList<>();

        for (WebElement temp : headlineTexts) {
            result.add(temp.getText());
        }
        return result;
    }
}
