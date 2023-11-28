import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
@DisplayName("参数化测试")
public class UserService2Test {
    private UserService userService = new UserService();
    @DisplayName("是不是北京户口")
    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110110201509091109", "510310198812120931"})
    public void testIsBeijing(String idcard) {
        boolean isBeijing = userService.isBeijing(idcard);
        System.out.println(isBeijing);
    }
    @DisplayName("年龄")
    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110110201509091109", "510310198812120931"})
    public void testGetAge(String idcard) {
        int age = userService.getAge(idcard);
        System.out.println(age);
    }

    @DisplayName("性别")
    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110110201509091109", "510310198812120931"})
    public void testGetGender(String idcard) {
        String gender = userService.getGender(idcard);
        System.out.println(gender);
    }

    @DisplayName("出生年份")
    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110110201509091109", "510310198812120931"})
    public void testGetYear(String idcard) {
        String year = userService.getYear(idcard);
        System.out.println(year);
    }

    @DisplayName("出生月份")
    @ParameterizedTest
    @ValueSource(strings = {"610110201909091231", "110110201509091109", "510310198812120931"})
    public void testGetMonth(String idcard) {
        String month = userService.getMonth(idcard);
        System.out.println(month);
    }
}