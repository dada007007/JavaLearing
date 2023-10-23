package com.itheima.homework3.operator;

public class question1 {
    public static void main(String[] args) {
/*      需求:
        身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
        儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
        女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
        现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？*/
        int father_height = 177;
        int mother_height = 165;
        double son_height1 ;
        double daughter_height1 ;
        son_height1 = (father_height + mother_height) * 1.08 / 2 ;
        int son_height = (int)son_height1;
        daughter_height1 = (father_height * 0.923 + mother_height) / 2;
        int daughter_height = (int)daughter_height1;
        System.out.println("儿子身高是： " + son_height + "女儿身高是： " + daughter_height);

    }
}
