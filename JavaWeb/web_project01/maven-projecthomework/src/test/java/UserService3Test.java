
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("断言测试")
public class UserService3Test  {

    @DisplayName("是不是北京户口")
    @Test
    public void testIsBeijing(){
        boolean beijing = new UserService().isBeijing(" 610110201909091231");
        boolean beijing1 = new UserService().isBeijing("110110201509091109");
        boolean beijing2 = new UserService().isBeijing(" 510310198812120931");
        Assertions.assertFalse(beijing);
        Assertions.assertTrue(beijing1);
        Assertions.assertFalse(beijing2);
    }

    @DisplayName("年龄")
    @Test
    public void testGetAge(){
        Integer age = new UserService().getAge("610110201909091231");
        Integer age1 = new UserService().getAge("110110201509091109");
        Integer age2 = new UserService().getAge("510310198812120931");
        Assertions.assertEquals(age,4);
        Assertions.assertEquals(age1,8);
        Assertions.assertEquals(age2,34);
    }

    @DisplayName("性别")
    @Test
    public void testGetGender(){
        String gender = new UserService().getGender("610110201909091231");
        String gender1 = new UserService().getGender("110110201509091109");
        String gender2 = new UserService().getGender("510310198812120931");
        Assertions.assertEquals(gender,"男");
        Assertions.assertEquals(gender1,"女");
        Assertions.assertEquals(gender2,"男");
    }

    @DisplayName("出生年份")
    @Test
    public void testGetYear(){
        String year = new UserService().getYear("610110201909091231");
        String year1 = new UserService().getYear("110110201509091109");
        String year2 = new UserService().getYear("510310198812120931");
        Assertions.assertEquals(year,"2019");
        Assertions.assertEquals(year1,"2015");
        Assertions.assertEquals(year2,"1988");
    }

    @DisplayName("出生月份")
    @Test
    public void testGetMonth(){
        String month = new UserService().getMonth("610110201909091231");
        String month1 = new UserService().getMonth("110110201509091109");
        String month2 = new UserService().getMonth("510310198812120931");
        Assertions.assertEquals(month,"09");
        Assertions.assertEquals(month1,"09");
        Assertions.assertEquals(month2,"12");
    }
}
