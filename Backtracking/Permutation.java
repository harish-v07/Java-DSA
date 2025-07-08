/*
Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:
Input: nums = [1]
Output: [[1]]
*/



class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        backtrack(nums,res,curr);
        return res;
    }
    private void backtrack(int []nums,List<List<Integer>> res,ArrayList<Integer> curr)
    {
        if(curr.size() == nums.length)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i : nums)
        {
            if(curr.contains(i))
                continue;
            curr.add(i);
            backtrack(nums,res,curr);
            curr.removeLast();
        }
    }
}
