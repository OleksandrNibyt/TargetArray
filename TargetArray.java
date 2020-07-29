import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> list=new ArrayList();

        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i< nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}
public class TargetArray {

    public static void main(String[] args) {
        int[] input = {0,1,2,3,4};
        int[] indexes = {0,1,2,2,1};
        int[] result = Solution.createTargetArray(input, indexes);
        System.out.println(result);
    }
}
