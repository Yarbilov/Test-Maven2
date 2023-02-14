import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {


    public static void main(String [] args){


        WebDriver driver = new ChromeDriver();
        // Navigate to Google.com
         driver.get("https://www.google.com/");
         // Locate the element
        WebElement searchBox = driver.findElement(By.name("q"));

        // Enter Search term
        String searchTerm = "chatGPT";
        searchBox.sendKeys(searchTerm, Keys.ENTER);
// In the results page, verify the title contains search term
        String currentTitle = driver.getTitle();// returns the title of the current page

        if(currentTitle.contains(searchTerm)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed. The current title is " + currentTitle);
        }

    }


}
