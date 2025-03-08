import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Recursion2 {

    public static void towerofHanoi(int n, String src, String dest, String helper) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerofHanoi(n - 1, src, helper, dest);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerofHanoi(n - 1, helper, dest, src);
    }

    // public static StringBuilder printReverse(String str) {
    // StringBuilder sb = new StringBuilder();
    // for (int i = str.length() - 1; i >= 0; i--) {
    // char c = str.charAt(i);
    // sb.append(c);
    // }
    // return sb;
    // }

    public static void printreverseRecursion(String str, int i) {
        if (i < 0) {
            System.out.println();
            return;
        }
        System.out.print(str.charAt(i));
        printreverseRecursion(str, i - 1);
    }

    public static void printreverseRec(String str, int i) {
        if (i >= str.length()) {
            return;
        }
        printreverseRec(str, i + 1);
        System.out.print(str.charAt(i));
    }

    // class variables
    static int first = -1;
    static int last = -1;

    public static void printOccurance(String str, int i, char c) {
        if (i == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        // har iteration mein i ki value nayi nhi chahiye.
        // I want the last iteration value
        if (str.charAt(i) == c) {
            if (first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        printOccurance(str, i + 1, c);

    }

    public static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] >= arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);

    }

    // public static int count = 0;
    // static StringBuilder sb = new StringBuilder();

    // public static void moveX(String str, int i) {
    // if (i == str.length()) {
    // for (int j = 0; j < count; j++) {
    // sb.append('x');
    // }
    // System.out.println(sb);
    // return;
    // }

    // if (str.charAt(i) == 'x') {
    // count++;
    // } else {
    // sb.append(str.charAt(i));
    // }
    // moveX(str, i + 1);
    // }

    static StringBuilder sb = new StringBuilder();
    static int[] buffer = new int[26];

    public static boolean isUpperCase(char a) {
        if (a - 'A' > 25) {
            return false;
        }
        return true;
    }

    public static void removeDuplicates(String str, int i) {
        if (i == str.length()) {
            System.out.println(sb);
            return;
        }
        if (isUpperCase(str.charAt(i))) {
            if (buffer[str.charAt(i) - 'A'] == 0) {
                buffer[str.charAt(i) - 'A']++;
                sb.append(str.charAt(i));
            }
        } else {
            if (buffer[str.charAt(i) - 'a'] == 0) {
                buffer[str.charAt(i) - 'a']++;
                sb.append(str.charAt(i));
            }
        }
        removeDuplicates(str, i + 1);

    }

    // public static void subsequences(String str, int i, String newString) {
    // if (i == str.length()) {
    // System.out.println(newString);
    // return;
    // }
    // char c = str.charAt(i);

    // subsequences(str, i + 1, newString + c);

    // subsequences(str, i + 1, newString);
    // }

    // public static void uniqueSubsequences(String str, int i, String newString,
    // HashSet<String> set) {
    // if (i == str.length()) {
    // if (set.contains(newString)) {
    // return;
    // } else {
    // set.add(newString);
    // System.out.println(newString);
    // return;
    // }

    // }
    // char c = str.charAt(i);
    // uniqueSubsequences(str, i + 1, newString + c, set);
    // uniqueSubsequences(str, i + 1, newString, set);
    // }

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombinations(String str, int i, String combination) {
        if (i == str.length()) {
            System.out.println(combination);
            return;
        }
        /*
         * int a = str.charAt(i);
         * System.out.println(a);
         * Here, str.charAt(i) returns a char, and when assigned to int a, it gets
         * converted to its ASCII value.
         */
        int a = str.charAt(i);
        String mapping = keypad[a - '0'];
        System.out.println(mapping);
        for (int j = 0; j < mapping.length(); j++) {
            printCombinations(str, i + 1, combination + mapping.charAt(j));
        }

    }

    public static void main(String[] args) {
        int n = 3;
        // Time complexity = O(2^n - 1)
        // towerofHanoi(n, "S", "D", "H");

        // String str = "Sanskriti";
        // StringBuilder result = printReverse(str);
        // System.out.println(result);

        // printreverseRecursion(str, str.length() - 1);
        // printreverseRec(str, 0);

        // Print first and last occurance index of a charcter in a string
        // char c = 'i';
        // printOccurance(str, 0, c);

        // Check if an array is strictly increasing
        // int arr[] = { 1, 7, 13, 14, 45 };
        // boolean flag = isSorted(arr, 0);
        // System.out.println(flag);

        // Move all 'x' to the end of the string
        // String str = "xSanxskrxiti";
        // moveX(str, 0);

        // Remove duplicates
        // String str = "Sanskriti";
        // removeDuplicates(str, 0);

        // String str = "abc";
        // Time complexity = O(2^n)
        // subsequences(str, 0, "");

        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // uniqueSubsequences(str, 0, "", set);

        // Print all keypad choices
        // 0->.
        // 1->abc
        // 2->def
        // 3->ghi
        // 4->jkl
        // 5->mno
        // 6->pqrs
        // 7->tu
        // 8->vwx
        // 9->yz
        // Suppose

        String str = "36";
        printCombinations(str, 0, "");

    }
}
