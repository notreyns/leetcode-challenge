import java.util.ArrayList;

public class AddBinary {
    public static void main(String[] args) {
        String a = "0";
        String b = "0";

        int maxLength =0;
        StringBuilder strA = new StringBuilder();
        StringBuilder strB = new StringBuilder();
        if(a.length()>=b.length()){
            strA.append("0"+a);
            maxLength = a.length();
            for(int i = 0; i< (maxLength-b.length()); i++){
                strB.append(0);
            }
            strB.append("0"+b);
        }else {
            strB.append("0"+b);
            maxLength = b.length();
            for(int i = 0; i< (maxLength-a.length()); i++){
                strA.append(0);
            }
            strA.append("0"+a);
        }

        StringBuilder result = new StringBuilder();
        int inHead = 0;
        for(int i = maxLength; i>=0; i--){
            int digitA = Integer.parseInt(String.valueOf(strA.charAt(i)));
            int digitB = Integer.parseInt(String.valueOf(strB.charAt(i)));
            if(digitA+digitB+inHead == 2){
                inHead = 1;
                result.insert(0, "0");
            }else if(digitA+digitB+inHead ==3){
                result.insert(0, "1");
            }else if(digitA+ digitB+inHead ==1){
                result.insert(0, "1");
                inHead =0;
            }
            else{
                result.insert(0, "0");
                inHead =0;
            }
        }
        if(result.indexOf("1")==-1){
            System.out.println("0");
        }else{
            System.out.println(result.substring(result.indexOf("1")));
        }

}
}
