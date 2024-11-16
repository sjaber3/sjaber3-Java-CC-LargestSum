import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums) {
        if (nums == null || nums.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two elements.");
        }

        // Sort the list in descending order
        Collections.sort(nums, Collections.reverseOrder());

        // Sum the first two elements (the two largest elements)
        return nums.get(0) + nums.get(1);
    }

    public static void main(String[] args) {
        LargestSum ls = new LargestSum();
        List<Integer> nums = Arrays.asList(5, 4, 2, 5, 0);  // Example input
        System.out.println(ls.bigSum(nums));  // Should print 10
    }
}