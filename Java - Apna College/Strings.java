import java.util.*;

import javax.annotation.processing.SupportedSourceVersion;

public class Strings {
    public static void main(String[] args) {
        // String declaration
        // String name = "Tony";
        // String fullName = "Tony Satrk";
        // String sentence = "My name is Tony Stark";

        // Scanner sc = new Scanner(System.in);
        // // Single word
        // // String name = sc.next();

        // // Complete sentence
        // String name = sc.nextLine();
        // System.out.println("Your name is : " + name);

        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullname = firstName + "@" + lastName;
        // System.out.println(fullname);

        // System.out.println(fullname.length());

        // for (int i = 0; i < fullname.length(); i++) {
        // System.out.println(fullname.charAt(i));
        // }

        // System.out.println(fullname.charAt(0));

        String name1 = "Tony";
        String name2 = "Tony";

        // 1. s1 > s2 : +ve value
        // 2. s1 == s2 : 0
        // 3. s1 < s2 : -ve value

        // Hello < Wello
        // ASCII of H < ASCII of W

        // Always use compareTo function while comparing the Strings.
        // if (name1.compareTo(name2) == 0) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // if (name1 == name2) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // if (new String("Tony") == new String("Tony")) {
        // System.out.println("Strings are equal");
        // } else {
        // System.out.println("Strings are not equal");
        // }

        // String sentence = "TonyStark";
        // String name = sentence.substring(3, sentence.length());
        // String name = sentence.substring(0, 4);
        // String name = sentence.substring(3);
        // System.out.println(name);

        // Strings are immutable - we can't modify the string inside the memory
        // When we do operations on a string add, modify delete, it takes time
        // Stringbuilder - more optimised String class
        // 2 types of memory in java - Stack memory & heap memory

        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // // char at index 0
        // System.out.println(sb.charAt(0));

        // // set char at index 0
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // sb.insert(4, 'y'); // Tonyy
        // System.out.println(sb);
        // sb.insert(0, 'S'); // STonyy
        // System.out.println(sb);
        // sb.insert(3, 'i'); // SToinyy
        // System.out.println(sb);

        // sb.delete(3, 4); // STonyy
        // System.out.println(sb);
        // sb.delete(0, 1); // Tonyy
        // System.out.println(sb);
        // sb.delete(3, 5); // Ton
        // System.out.println(sb);

        // StringBuilder sb = new StringBuilder();
        // sb.append('h');
        // sb.append('e');
        // sb.append('l');
        // sb.append('l');
        // sb.append('o');// changes are being made to same stringbuilder
        // System.out.println(sb);
        // System.out.println(sb.length());

        // reverse a String
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        int n = sb.length();
        for (int i = 0; i < sb.length() / 2; i++) {
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(n - 1 - i);
            sb.setCharAt(i, backChar);
            sb.setCharAt(n - 1 - i, frontChar);
        }
        System.out.println(sb);
    }
}
