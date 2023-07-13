package Problems;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];
        int[] right = new int[length];
        int[] left = new int[length];

        /*
            input = [1, 2, 3, 4]
            left =  [1, 2, 6, 24]
            right = [24 ,12 ,4, 1]
            answer =[24, 12, 8, 6]
         */
        left[0] = 1;
        for (int i = 1; i < length; i++) {
            left[i] = left[i - 1] * nums[i-1];
        }

        right[length - 1] = 1;
        for (int j = length - 2; j >= 0; j--) {
            right[j] = nums[j+1] * right[j+1];
        }

        for (int k = 0; k < length; k++) {
            answer[k] = right[k] * left[k];
        }
        return answer;
    }

    public static int[] productExceptSelfSpaceOptimized(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];

        /*
            input = [1, 2, 3, 4]
            left =  [1, 2, 6, 24]
            right = [24 ,12 ,4, 1]
            answer =[24, 12, 8, 6]
         */
        answer[0] = 1;
        for (int i = 1; i < length; i++) {
            answer[i] = answer[i - 1] * nums[i-1];
        }

        int right = 1;
        for (int j = length - 1; j >= 0; j--) {
            answer[j] = answer[j] * right;
            right = right * nums[j];
        }
        return answer;
    }
}
