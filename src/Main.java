import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
    }
    public static int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == (total-leftSum-nums[i])){
                return i;
            }leftSum += nums[i];
        }
        return -1;
    }
}
