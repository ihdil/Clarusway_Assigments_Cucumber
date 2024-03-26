package assignmentsOfScenarioOutline;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StepDefinitions {
    private WebDriver driver;

    @Given("user goes to the {string}")
    public void user_goes_to_the(String page_url) {
        driver = new ChromeDriver();
        driver.get(page_url);
        System.out.println("opening: " + page_url);
    }

    @Then("user waits for {int} seconds")
    public void user_waits_for_seconds(Integer init1) {
        new WebDriverWait(driver, Duration.ofSeconds(init1));
    }

    @Then("verifies that the page title contains the word {string}")
    public void verifies_that_the_page_title_contains_the_word(String title) {
        Assertions.assertEquals(title, driver.getTitle());
        System.out.println("Page title contains: " + title);
    }
    @Then("closes the page")
    public void closes_the_page() {
        driver.quit();
    }
}
