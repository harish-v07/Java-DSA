/*
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
*/


class Solution {
    public int[] searchRange(int[] nums, int target) {
      int arr[] = new int[2];
      arr[0] = binarySearch(nums, target, true);
      arr[1] = binarySearch(nums, target, false);
      return arr;
    }
    public int binarySearch(int nums[], int target, boolean firstIndex){
      int res = -1;
      int low = 0, high = nums.length - 1;
      while (low <= high) {
        int mid = low + (high - low) / 2;
        if (nums[mid] > target){
          high = mid - 1;
        }
        else if(nums[mid] < target)
          low = mid + 1;
        else{
            res = mid;
            if(firstIndex == true)
                high = mid-1;
            else
                low = mid+1;
        }
      }
      return res;
    }
}
