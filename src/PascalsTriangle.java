import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int row = 5;

        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i< row; i++){
            List rowList = new ArrayList<Integer>();
            for(int j = 0; j<i+1; j++){
                if(j == 0){
                    result.add(rowList);
                    rowList.add(j, 1);
                }else if(j ==i){
                    rowList.add(j, 1);
                }else{
                    rowList.add(j, result.get(i-1).get(j-1) +result.get(i-1).get(j));
                }
            }
           // System.out.println(result.get(i));

        }
        System.out.println(result.toString());
    }
}
