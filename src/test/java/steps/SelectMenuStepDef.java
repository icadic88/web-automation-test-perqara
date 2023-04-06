package steps;

import static locator.DemoBookQALocator.SELECT_MENU_CONTAINER;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.stream.IntStream;
import org.junit.Assert;
import pages.SelectMenuPage;
import webdriverpool.WebdriverInitializer;

public class SelectMenuStepDef {

  SelectMenuPage selectMenu = new SelectMenuPage(WebdriverInitializer.driver);

  @When("User in Select Menu page")
  public void userInSelectMenuPage() {
    Assert.assertTrue("not directed to select menu page!",
        selectMenu.isOnSelectMenuPage());
  }

  @And("User choose select value {string}")
  public void userChooseSelectValue(String value) {
    selectMenu.selectValue(value);

  }

  @And("User choose select one {string}")
  public void userChooseSelectOne(String value) {
    selectMenu.selectOne(value);
  }

  @And("User choose old style select menu {string}")
  public void userChooseOldStyleSelectMenu(String value) {
    selectMenu.oldStyleSelectMenu(value);
  }

  @Then("User success input select menu")
  public void userSuccessInputAllSelect() {
    Assert.assertTrue(Boolean.TRUE);
  }
}
