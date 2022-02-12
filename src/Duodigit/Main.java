package Duodigit;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /**
         * duodigit if it decimal rep uses no more than two different digits. 12, 110, -33333, 1, 2020 are,
         * but 102, -2021 not.
         *  Return y or n
         * *
         **/
        isDuoDigit(-33333);
        isDuoDigit(-2021);
        isDuoDigit(1);
        isDuoDigit(102);
        isDuoDigit(12121);
        isDuoDigit(121);


    }
    public static String isDuoDigit(int number) {
        Math.abs(number);

        Set<Character> set = new HashSet<>();

        String num = Integer.toString(number);
        for (char arr : num.toCharArray()) {
            set.add(arr);
        }

        for (int i = 0; i < num.length(); i++) {
           if (set.size() > 2) {
               System.out.println("n");
               return "n";
           }
        }
        System.out.println("y");
        return "y";
    }
}
