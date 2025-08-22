class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int mergeSort(int[] arr, int l, int r) {
        if (l >= r) return 0;
        int mid = (l + r) / 2;
        int count = mergeSort(arr, l, mid) + mergeSort(arr, mid + 1, r);

        // Count reverse pairs across halves
        int j = mid + 1;
        for (int i = l; i <= mid; i++) {
            while (j <= r && (long) arr[i] > 2L * arr[j]) j++;
            count += j - (mid + 1);
        }

        // Merge step
        int[] temp = new int[r - l + 1];
        int i = l, k = 0; j = mid + 1;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        System.arraycopy(temp, 0, arr, l, temp.length);

        return count;
    }
}
