package Duodigit;

public class Main {
    public static void main(String[] args) {
        /**
         * duodigit if it decimal rep uses no more than two different digits. 12, 110, -33333, 1, 2020 are,
         * but 102, -2021 not.
         *  Return y or n
         * *
         **/
//        isDuoDigit(102);
//        isDuoDigit(-33333);
//        isDuoDigit(-2021);
        isDuoDigit(1);
        isDuoDigit(102);
        isDuoDigit(-2021);


    }
    public static String isDuoDigit(int number) {
        //boolean duoDigit = false;
        Math.abs(number);
        int counter = 1;
        String num = Integer.toString(number);
        for (int i = 0; i < num.length()-1; i++) {
            if (num.charAt(i) != num.charAt(i+1)){
                counter++;
                if (counter > 2) {
                    System.out.println("n");
                    return "n";
                }
            }
        }
        System.out.println("y");
        return "y";
    }
}
