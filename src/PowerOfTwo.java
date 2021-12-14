public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 0;

        boolean result = true;
        if(n == 1) result = true;
        if(n == 0) result =false;
        while(n>1){
            if(n%2 ==1 ){
                result = false;
               // System.out.println(false);
                break;
            }else{
                n = n/2;
                result = true;
            }
        }
        System.out.println(result);
    }
}

