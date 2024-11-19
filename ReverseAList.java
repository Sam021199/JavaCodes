import java.util.ArrayList;
import java.util.List;

public class ReverseAList {
    public static void main(String[] ags){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original: "+list);
        int left=0;
        int right=list.size()-1;

        while (left<right){
            int temp=list.get(left);
            list.set(left,list.get(right));
            list.set(right,temp);

            left++;
            right--;
        }
        System.out.println("Reversed: "+list);
    }
}
