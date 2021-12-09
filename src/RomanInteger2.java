import java.util.Scanner;

public class RomanInteger2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String text = scan.nextLine();
        int[] values = new int[text.length()];
        for(int i=0; i<text.length(); i++){
            char myChar = text.charAt(i);
            switch (myChar){
                case 'I':
                    values[i]= 1;
                    break;
                case 'V':
                    values[i]= 5;
                    break;
                case 'X':
                    values[i]= 10;
                    break;
                case 'L':
                    values[i]= 50;
                    break;
                case 'C':
                    values[i]= 100;
                    break;
                case 'D':
                    values[i]= 500;
                    break;
                case 'M':
                    values[i]= 1000;
                    break;
             }
        }
        int sum = 0;
        for(int i =0; i<values.length-1; i++){
            if(values[i]<values[i+1]){
                sum =sum - values[i];
            }else{
                sum = sum + values[i];
            }
        }
        System.out.println(sum + values[values.length-1]);
    }
}
