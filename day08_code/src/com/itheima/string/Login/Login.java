package com.itheima.string.Login;

public class Login {
    String username = new Username_Password().getName();
    String password = new Username_Password().getPassword();

    public void check(String username, String password){
        if(this.username.equals(username)&&this.password.equals(password)){
            System.out.println("恭喜您登陆成功！");
        }else if(this.username.equals(username)&&this.password.equals(password)) {
            System.out.println("登录失败");
        }
    }

}
