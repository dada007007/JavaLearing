package Jdemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.sql.*;

public class JDBCHomework03 {
    @ParameterizedTest
    @CsvSource({"关羽,666888,32,4"})
    public void upDate(String _username, String _password, Integer _age, Integer _id) throws Exception {
        //1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");

        //2. 获取链接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/itheima02", "root", "yjd697398");

        //3. 获取数据库执行对象 Statement
        PreparedStatement preparedStatement = connection.prepareStatement("update user set password = ? , name = ?, age = ? where id = ? ");
        preparedStatement.setString(1, _password);
        preparedStatement.setString(2, _username);
        preparedStatement.setInt(3, _age);
        preparedStatement.setInt(4, _id);

        //4. 执行SQL
         preparedStatement.executeUpdate();


        preparedStatement.close();
        connection.close();
    }

}
