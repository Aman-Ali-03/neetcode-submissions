class Solution:
    def getFinalState(self, nums: List[int], k: int, multiplier: int) -> List[int]:
        while(k!=0):
            mini = min(nums)
            nums[nums.index(mini)] = mini*multiplier
            k-=1
        return nums
        