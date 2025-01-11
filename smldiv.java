class smldiv {
    public int sumofD(int arr[], int div) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (int) Math.ceil((double) arr[i] / div);
        }
        return sum; // Fixed: Add return statement
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if (n > threshold) return -1;

        // Find the maximum element in nums
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, nums[i]);
        }

        int low = 1, high = maxi;
        while (low <= high) {
            int mid = (low + high) / 2;

            // Use nums instead of arr in sumofD call
            if (sumofD(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
