package Javanais;

public class Main {
    public static void main(String[] args) {
        /**
         * Before each of the vowels a, e, i, o, u insert the parasitic syllable "av";
         * Unless the vowel is preceded by another vowel.
         **/
        translate("This is an example for you");
    }

    public static String translate(String text) {
        char[] vowels= new char[] {'a', 'e', 'i', 'o', 'u'};
        String parasitic = "av";
        String a= "a";
        for (int i = 0; i < text.length();i++) {
            for (int j = i; j < vowels.length -1; j++){
                if (text.charAt(i) == vowels[j] && vowels[j] != vowels[j + 1]){
                    String newText = text.replace(a, "av");
                    System.out.println(newText);
                    return "parasitic";
                }
            }


        }
        System.out.println(text);
        return "no parasitic";
    }
}