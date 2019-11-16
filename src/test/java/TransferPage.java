import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class TransferPage {

    private SelenideElement addFundButton = $("[data-test-id=action-deposit]");
    private SelenideElement amount = $("[data-test-id=amount] input");
    private SelenideElement sourceAccountField = $("[data-test-id=from] input");
    private SelenideElement confirmFundingButton = $("[data-test-id=action-transfer]");

    public DashboardPage validTransfer() {
        addFundButton.click();
        amount.setValue("500");
        sourceAccountField.setValue("5559000000000002");
        confirmFundingButton.click();
        $("li:first-of-type").shouldHave(Condition.matchText("10500"));
        $("li:last-of-type").shouldHave(Condition.matchText("9500"));
        return new DashboardPage();
    }
}