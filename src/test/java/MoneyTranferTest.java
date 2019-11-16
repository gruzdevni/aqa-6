import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class MoneyTranferTest {
    private LoginPage loginPage;
    private DataHelper.AuthInfo authInfo;
    private VerificationPage verificationPage;
    private DataHelper.VerificationCode verificationCode;
    private TransferPage transferPage;

    @Test
    void shouldTransferMoneyBetweenOwnCardsV1() {
        open("http://localhost:9999");
        loginPage = new LoginPage();
        authInfo = DataHelper.getAuthInfo();
        verificationPage = loginPage.validLogin(authInfo);
        verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        transferPage = new TransferPage();
        transferPage.validTransfer();
    }

}
