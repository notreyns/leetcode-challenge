public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "helilo";
        String needle = "lo";

        for (int j = 0; j < haystack.length(); j++) {
            int a =j;
            int current = 0;
            boolean match =true;
            while(current< needle.length()){
                if (a>=haystack.length() || needle.charAt(current) != haystack.charAt(a)) {
                    match = false;
                    break;
                }else{

                    current++;
                    a++;
                }
            }


            if (match) System.out.println(j);
        }



    }

}

