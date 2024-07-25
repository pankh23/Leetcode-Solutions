class Solution {
    public int[] sortArray(int[] nums) {
        
        int n=nums.length;
        if (nums == null || nums.length == 0) {
            return nums;
        }

        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(nums, left, middle);
            mergeSort(nums, middle + 1, right);

            merge(nums, left, middle, right);
        }
    }

    private void merge(int[] nums, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = nums[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = nums[middle + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                nums[k] = leftArray[i];
                i++;
            } else {
                nums[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            nums[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            nums[k] = rightArray[j];
            j++;
            k++;
        }

    }
        
}
