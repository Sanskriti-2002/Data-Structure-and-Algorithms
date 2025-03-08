import java.util.*;

public class Recursion3 {
    public static void allPermutations(String permutation, String result) {
        if (permutation.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int j = 0; j < permutation.length(); j++) {
            String first = permutation.substring(0, j);
            char c = permutation.charAt(j);
            String last = permutation.substring(j + 1, permutation.length());
            allPermutations(first + last, result + c);
        }
    }

    public static void main(String[] args) {
        // Print all permutation of java
        String str = "abc";
        allPermutations(str, "");
    }
}
