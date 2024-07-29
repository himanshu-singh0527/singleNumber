import java.util.*;
class Solution{
    public int singleNumber(int[] nums){
        int p =0;
        for(int i=0;i<nums.length;i++){
            p^=nums[i];
        }
        return p;
    }
}
public class singleNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers [] :");
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution solution = new Solution();
        int singleNumber = solution.singleNumber(nums);
        System.out.println("Sinngle number is :"+ singleNumber);
    }
}