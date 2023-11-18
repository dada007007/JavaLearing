package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        File f = new File("D:\\code\\Javaee\\day06-io-thread\\src\\csb.txt");
        Reader r = new FileReader(f);
        BufferedReader br = new BufferedReader(r);
        String s;
        List<String> list = new ArrayList<>();
        while ((s = br.readLine()) != null) {
            String s1 = s;
            list.add(s1);
        }
        System.out.println(list);
        list.sort(((o1, o2) -> {
            return Integer.valueOf(o1.substring(0,1))-Integer.valueOf(o2.substring(0,1));
        }));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

