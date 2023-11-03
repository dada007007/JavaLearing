package com.itheima.innerclass_01;

public class Test {
    public static void main(String[] args) {
//        ZhiZunBao zzb = new ZhiZunBao();
//        ZhiZunBao.Heart heart = zzb.new Heart();
//        heart.speak();

        ZhiZunBao.Heart heart = new ZhiZunBao().new Heart();
        heart.speak();
    }
}
