class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low < high) {
            // Randomly choose a pivot to avoid worst-case performance
            int pi = randomizedPartition(nums, low, high);
            quickSort(nums, low, pi - 1);
            quickSort(nums, pi + 1, high);
        }
    }

    // Randomized partition: choose a random pivot and perform partition
    private int randomizedPartition(int[] nums, int low, int high) {
        // Choose a random pivot index between low and high
        int randomIndex = low + (int) (Math.random() * (high - low + 1));
        // Swap the random pivot element with the last element
        int temp = nums[randomIndex];
        nums[randomIndex] = nums[high];
        nums[high] = temp;

        return partition(nums, low, high);
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];  // Pivot is now at the last element
        int i = low - 1;  // Index for the smaller element

        // Traverse the array and rearrange elements around the pivot
        for (int j = low; j <= high - 1; j++) {
            if (nums[j] < pivot) {
                i++;
                // Swap nums[i] and nums[j]
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // Place the pivot in the correct position
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;  // Return the pivot's index
    }
}
