package d6_object_serialize;

import java.io.Serializable;

// 注意：如果对象要实现序列化，对象的类必须实现序列化接口。
public class User implements Serializable {
    private String loginName;
    private String userName;
    // transient :修饰的成员变量将自动不参与序列化
    private transient String passWord;
    private int age;
    private static final long serialVersionUID = 2; // 序列化的版本号：序列化和反序列的版本号必须一致否则报错！

    public User() {
    }

    public User(String loginName, String userName, String passWord, int age) {
        this.loginName = loginName;
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
    }

    /**
     * 获取
     * @return loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginName='" + loginName + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                '}';
    }
}
