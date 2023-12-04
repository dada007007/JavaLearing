package Jdemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.sql.*;

public class JDBCHomework04 {
    @ParameterizedTest
    @CsvSource({"20,4"})
    public void upDate(Integer _age, Integer _id) throws Exception {
        //1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. 获取链接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itheima02", "root", "yjd697398");

        //3. 获取数据库执行对象 Statement
        PreparedStatement preparedStatement = connection.prepareStatement("select id,username,password,name,age from user where age >= ? and id <= ? ");

        preparedStatement.setInt(1, _age);
        preparedStatement.setInt(2, _id);
        //4. 执行SQL
        preparedStatement.executeQuery();

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            User user = new User(id, username, password, name, age);
            System.out.println(user);
        }

        preparedStatement.close();
        connection.close();
    }

}
