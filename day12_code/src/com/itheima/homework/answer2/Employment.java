package com.itheima.homework.answer2;

public class Employment extends Teacher implements SpeakJapanese{
    @Override
    public void teach() {
        System.out.println("就业班老师教进阶内容");
    }

    @Override
    public void Japanese() {
        System.out.println("部分就业班老师会说日语");
    }
}
