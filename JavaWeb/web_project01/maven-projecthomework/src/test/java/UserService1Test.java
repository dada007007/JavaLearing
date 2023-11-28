
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test注解测试")
public class UserService1Test {

    @DisplayName("是不是北京户口")
    @Test
    public void testIsBeijing(){
        boolean beijing = new UserService().isBeijing(" 610110201909091231");
        boolean beijing1 = new UserService().isBeijing(" 110110201509091109");
        boolean beijing2 = new UserService().isBeijing(" 510310198812120931");
        System.out.println(beijing);
        System.out.println(beijing1);
        System.out.println(beijing2);
    }


    @Test
    @DisplayName("年龄")
    public void testGetAge(){
        Integer age = new UserService().getAge("610110201909091231");
        Integer age1 = new UserService().getAge("110110201509091109");
        Integer age2 = new UserService().getAge("510310198812120931");
        System.out.println(age);
        System.out.println(age1);
        System.out.println(age2);
    }

    @DisplayName("性别")
    @Test
    public void testGetGender(){
        String gender = new UserService().getGender("610110201909091231");
        String gender1 = new UserService().getGender("110110201509091109");
        String gender2 = new UserService().getGender("510310198812120931");
        System.out.println(gender);
        System.out.println(gender1);
        System.out.println(gender2);
    }

    @DisplayName("出生年份")
    @Test
    public void testGetYear(){
        String year = new UserService().getYear("610110201909091231");
        String year1 = new UserService().getYear("110110201509091109");
        String year2 = new UserService().getYear("510310198812120931");
        System.out.println(year);
        System.out.println(year1);
        System.out.println(year2);
    }


    @Test
    @DisplayName("出生月份")
    public void testGetMonth(){
        String month = new UserService().getMonth("610110201909091231");
        String month1 = new UserService().getMonth("110110201509091109");
        String month2 = new UserService().getMonth("510310198812120931");
        System.out.println(month);
        System.out.println(month1);
        System.out.println(month2);

    }

}
