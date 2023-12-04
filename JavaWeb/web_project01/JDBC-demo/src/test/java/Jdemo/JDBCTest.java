package Jdemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
    @ParameterizedTest
    @CsvSource({"daqiao,12345678"})
    public void upDate(String _username, String _password) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itheima02", "root", "yjd697398");
        Statement statement = connection.createStatement();

            /*int i = statement.executeUpdate("update user set password='12345678' where id=1");
            System.out.println(i);*/
        ResultSet resultSet = statement.executeQuery("select * from user where username='" + _username + "'and password='" + _password + "'");

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            User user = new User(id, username, password, name, age);
            System.out.println(user);
        }
        statement.close();
        connection.close();
    }

}
