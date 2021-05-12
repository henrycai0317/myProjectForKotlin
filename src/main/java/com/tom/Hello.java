package com.tom;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World !");
        Person p = new Person("Henry",66.5f,1.7f);
        p.hello();

        String s="abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(3));
        System.out.println(s.substring(1,4));
        p.weight=66.5f;
        p.height=1.7f;
        System.out.println(p.bmi());
        /*int age = 19;
        Integer age2 = 19;
        char c = '我';
        Character c2 = 'A';
        byte b =120;
        float weight =66.5f;//快捷鍵command+d 游標所在行複製到下一行
        float weight2 =66.5f;//快捷鍵command+delete 游標所在行刪除
        float height = 1.7f;
        boolean adult = true;
        boolean entrol=false;
        String name = "Tom";*/

        int score = 88;
        System.out.println(score<80 || score>90);
        char c = 'A';
        System.out.println(c>'a');

    }

}
