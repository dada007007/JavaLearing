package string_02;

public class StringMethodDemo03 {
    public static void main(String[] args) {
        // boolean contains(小串) 判断大串中是否出现了小串
        String str = "原神毁了我的生活";
        System.out.println(str.contains("原神"));

        // boolean startswith endswith 字符串是否以"  "开头，结尾
        String bigStr = "怎么不说话了，是不是偷偷地在玩原神.avi";
        System.out.println(bigStr.startsWith("怎么不"));
        System.out.println(bigStr.endsWith(".mp4"));
        System.out.println(bigStr.endsWith(".avi"));
        // split() 切割，括号中是切割遵守的规则
        String date = "2023/10/28 14:55:00";
        String[] split = date.split("/+(\\d+):+");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
