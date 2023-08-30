import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLeumi {

    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.leumi.co.il/");
    }

    @Test
    public void testCSS(){
        String text = wd.findElement(By.linkText("פרטי")).getText();
        Assert.assertEquals(text, "פרטי");
        System.out.println(text);
    }
}

