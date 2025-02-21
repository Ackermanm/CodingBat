package WarmUp02;

/* Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
   Return true if the array does not contain any triples.


noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false */

public class NoTriples {
    public boolean noTriples(int[] nums) {
        boolean checker = true;
        int size = nums.length;

        for (int i = 0; i < size - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
                checker = false;
        }

        return checker;
    }
}
