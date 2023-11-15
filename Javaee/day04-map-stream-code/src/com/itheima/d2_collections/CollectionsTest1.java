package com.itheima.d2_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest1 {
    public static void main(String[] args) {
        // 1、public static <T> boolean addAll(Collection<? super T> c, T...elements)：为集合批量添加数据
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "木婉清", "木婉清", "王语嫣", "赵凯", "梅超风");
        System.out.println(names);

        // 2、public static void shuffle(List<?> list)：只能打乱List集合中的元素顺序。
        Collections.shuffle(names);
        System.out.println(names);

        // 3、 public static <T> void sort(List<T> list)：对List集合中的元素进行升序排序。
        List<Integer> ages = new ArrayList<>();
        Collections.addAll(ages, 11, 9, 2,23,18);
        Collections.sort(ages); // 默认是升序排序！
        System.out.println(ages);

        // 4、public static <T extends Comparable<? super T>> void sort(List<T> list)
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("赵敏", 19, 169.5);
        Student s2 = new Student("周芷若", 18, 171.5);
        Student s3 = new Student("周芷若", 18, 171.5);
        Student s4 = new Student("小昭", 17, 165.5);
        Collections.addAll(students, s1, s2, s3, s4);
        // 方式一：让对象的类实现Comparable接口，从写compareTo方法，指定大小比较规则
        Collections.sort(students);
        System.out.println(students);

        // 5、public static <T> void sort(List<T> list， Comparator<? super T> c):
        // 对List集合中元素，按照比较器对象指定的规则进行排序
        // 方式二：指定Comparator比较器对象，再指定比较规则。
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getHeight(), o1.getHeight()); // 身高降序
            }
        });
        System.out.println(students);
    }
}
