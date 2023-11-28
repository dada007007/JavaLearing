import com.itheima.UserService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
@DisplayName("测测你们码")
public class UserServiceTest {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("开始测码");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("测完你们的码了，一群牛码");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("你码也不咋地");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("瞅瞅你码怎么样");
    }
    @Test
    public void testGetGender(){
        String gender =new UserService().getGender("210202199806112719");
        System.out.println(gender);
    }
    @Test
    public void testGetAge(){
        int age = new UserService().getAge("210202199806112719");
        System.out.println(age);
    }

    @DisplayName("测性别")
    @ValueSource(strings = {"21qwe199063612719","210202119823142742"})
    @ParameterizedTest
    public void testGender2(String s){
        String gender =new UserService().getGender(s);
        System.out.println(gender);
    }

/*    @Test
    public void testGetGender1(){
        String gender =new UserService().getGender1("210202199806112719");
        Assertions.assertEquals("男",gender,"性别判断有误");
    }
*/

}
