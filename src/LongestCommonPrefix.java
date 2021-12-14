import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] texts = new String[3];
        texts[0] = "f";
        texts[1] = "floght";
        texts[2] = "flow";


        int maxLength = texts[0].length();
        for (int i = 1; i < texts.length; i++) {
            if (texts[i].length() < maxLength) {
                maxLength = texts[i].length();
            }
        }

        StringBuilder prefix = new StringBuilder("");
        for (int i = 0; i < maxLength; i++) {
            char myChar = texts[0].charAt(i);
            int counter = 0;
            for (String elem : texts) {
                if (elem.charAt(i) == myChar) {
                    counter++;
                }
            }
            if(counter == texts.length){
                prefix.append(myChar);
            }
        }

        System.out.println(prefix);
    }


}
