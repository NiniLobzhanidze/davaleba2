package org.example;

public class Main {
    public static void main(String[] args) {


        String str = "skajdnjazjksn";
        int i = 2;
        while (i < str.length()) {
            char s = str.charAt(i);
            System.out.println(str.charAt(i));
            if (s=='z'){
                break;
            }
            i+=3;
        }

    }
}