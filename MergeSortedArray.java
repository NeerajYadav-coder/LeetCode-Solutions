public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1;  // Index of the last element in nums1's original part
      int j = n - 1;  // Index of the last element in nums2
      int k = m + n - 1;  // Index of the last element in the merged array

      // Merge nums1 and nums2 starting from the end
      while (i >= 0 && j >= 0) {
          if (nums1[i] > nums2[j]) {
              nums1[k--] = nums1[i--];
          } else {
              nums1[k--] = nums2[j--];
          }
      }

      // If there are remaining elements in nums2
      while (j >= 0) {
          nums1[k--] = nums2[j--];
      }

      // No need to handle the remaining elements in nums1
      // as they are alread    
  }