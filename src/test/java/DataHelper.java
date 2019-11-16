public class DataHelper {
    private DataHelper() {
    }

    public static class AuthInfo {
        private static String login = "vasya";
        private static String password = "qwerty123";

        public static String getLogin() {
            return login;
        }

        public static String getPassword() {
            return password;
        }

        public AuthInfo(String login, String password) {
        }
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static class VerificationCode {
        private String code = "12345";

        public String getCode() {
            return code;
        }

        public VerificationCode(String code) {
        }
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }
}
