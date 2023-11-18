package homework.answer4_3;

import java.io.Serializable;

public class User implements Serializable {
    private String Name;
    private int age;
    // transient 这个成员变量将不参与序列化。
    private transient String passWord;
    // static 修饰的成员变量也无法被序列化
    private static String country;
    // 以下set/get/构造方法省略...

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", passWord='" + passWord + '\'' +
                country+
                '}';
    }

    public User() {
    }

    public User(String name, int age, String passWord) {
        Name = name;
        this.age = age;
        this.passWord = passWord;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        User.country = country;
    }
}
