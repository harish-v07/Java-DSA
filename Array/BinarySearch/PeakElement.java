/*
Peak Element or Peak Index in Mountain Array

Example 1:
Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.

Example 2:
Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 
*/


class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            int mid = start + (end-start) / 2;
            if(nums[mid] > nums[mid+1])
                end = mid;
            else
                start = mid+1;
        }
        return start; // return end; as start == end
    }
}
