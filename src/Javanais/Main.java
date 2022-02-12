package Javanais;

public class Main {
    public static void main(String[] args) {
        /**
         * Before each of the vowels a, e, i, o, u insert the parasitic syllable "av";
         * Unless the vowel is preceded by another vowel.
         **/
        System.out.println(translate("This is an example for your employee"));

    }

    public static boolean isVowel(char c) {
        return "aeiou".contains(String.valueOf(c).toLowerCase());
    }

    public static String translate(String text) {
      boolean isPreviousVowel = false;
      String result = "";
      for (int i =0; i < text.length(); i++) {
          if (isVowel(text.charAt(i)) && !isPreviousVowel )
              result += "av";
          result += text.charAt(i);
          isPreviousVowel = isVowel(text.charAt(i));
      }
      return result;
    }
}
