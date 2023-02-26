import java.util.*;

public class Main {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(
//                twoSum_BruteForce(new int[]{3, 6, 10, 14}, 9) // [6, 3] best case
//        ));
//
//        System.out.println(Arrays.toString(
//                twoSum_BruteForce(null, 4) // null - invalid input
//        ));
////
//        System.out.println(Arrays.toString(
//                twoSum_BruteForce(new int[]{3, 1, 4}, 5)  // [1, 4] best case
//        ));
////
//        System.out.println(Arrays.toString(
//                twoSum_BruteForce(new int[]{3}, 9) // null - array less than two integers
//        ));

        System.out.println(Arrays.toString(
                twoSumO(new int[]{3, 6, 10, 14}, 9) // [6, 3] best case
        ));

        System.out.println(Arrays.toString(
                twoSumO(null, 4) // null - invalid input
        ));

        System.out.println(Arrays.toString(
                twoSumO(new int[]{3, 1, 4}, 5)  // [1, 4] best case
        ));

        System.out.println(Arrays.toString(
                twoSumO(new int[]{3}, 9) // null - array less than two integers
        ));

        System.out.println(Arrays.toString(
                twoSumO(new int[]{3, 1, 4}, 500)  // [1, 4] best case
        ));

        System.out.println(Arrays.toString(
                twoSumO(new int[]{3, 6, 10, 14}, 9) // [6, 3] best case
        ));

//        System.out.println(Arrays.toString(
//                findTwoSum_Sorting(null, 4) // null - invalid input
//        ));

//        System.out.println(Arrays.toString(
//                // [1, 3, 4]
//                findTwoSum_Sorting(new int[]{3, 1, 4}, 5)  // [1, 4] best case
//        ));
//
//        System.out.println(Arrays.toString(
//                findTwoSum_Sorting(new int[]{3}, 9) // null - array less than two integers
//        ));
//
//        System.out.println(Arrays.toString(
//                findTwoSum_Sorting(new int[]{3, 1, 4}, 4)  // [1, 4] best case
//        ));
    }

    // O (n ^ 2)
    public static int[] twoSum_BruteForce(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }

        for (int i = 0; i < nums.length; i++) { // o(n)
            int diff = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) { // o(n)
                if (nums[j] == diff) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


    // time complexity O(n)
    public static int[] twoSumO(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }

//        int n=nums.length;

        Map<Integer,Integer> map=new HashMap<>();

        int[] result=new int[2];

        for(int i=0;i<nums.length;i++){ // o (n)

            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
//            map.put(nums[i],i);
        }
        return result;
    }

    // Time complexity: O(n*lon(n))
    public static int[] findTwoSum_Sorting(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }




}