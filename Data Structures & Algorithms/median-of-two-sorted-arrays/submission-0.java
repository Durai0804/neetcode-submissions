class Solution {
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] arr = new int[nums1.length + nums2.length];
    int l = 0;
    int r = 0;
    int i = 0;

    while (l < nums1.length && r < nums2.length) {
      if (nums1[l] < nums2[r]) {
        arr[i] = nums1[l];
        i++;
        l++;
      } else {
        arr[i] = nums2[r];
        r++;
        i++;
      }
    }
    while (l < nums1.length) {
      arr[i] = nums1[l];
      i++;
      l++;
    }
    while (r < nums2.length) {
      arr[i] = nums2[r];
      i++;
      r++;
    }
    int n = arr.length;

    if (n % 2 == 1) {
      return arr[n / 2];
    } else {
      return (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
    }
  }
}
