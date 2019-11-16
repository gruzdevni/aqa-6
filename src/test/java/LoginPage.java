import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        $("[data-test-id=login] input").setValue(DataHelper.AuthInfo.getLogin());
        $("[data-test-id=password] input").setValue(DataHelper.AuthInfo.getPassword());
        $("[data-test-id=action-login]").click();
        return new VerificationPage();
    }
}
