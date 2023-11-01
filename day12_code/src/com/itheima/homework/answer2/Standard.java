package com.itheima.homework.answer2;

public class Standard extends Teacher implements SpeakJapanese {
    @Override
    public void teach() {
        System.out.println("基础班老师教基础内容");
    }

    @Override
    public void Japanese() {
        System.out.println("部分基础班老师会说日语");
    }
}
