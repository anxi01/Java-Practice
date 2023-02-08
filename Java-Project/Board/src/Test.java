import java.util.Arrays;

public enum Test {
    SIGNUP_TYPE(1, "회원가입"),
    LOGIN_TYPE(2, "로그인"),
    LOGOUT_TYPE(3, "로그아웃"),
    DEFAULT(4, "디폴트");

    private int code;
    private String messages;

    Test(int code, String messages) {
        this.code = code;
        this.messages = messages;
    }

    public static Test from(int code) { // code 2
        // values() Test.SIGNUP_TYPE, Test.LOGIN_TYPE, Test.LOGOUT_TYPE, Test.DEFAULT
        for (Test test : values()) {
            if (test.code == code) {
                return test;
            }
        }
        return DEFAULT;
    }

    public static Test fromStream(int code) { // code 2
        return Arrays.stream(values())
                .filter(test -> test.code == code)
                .findAny()
                .orElse(DEFAULT);
    }

    public int getCode() {
        return code;
    }

}
