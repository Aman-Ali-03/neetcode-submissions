class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int start = 0;
        int end = heights.length - 1;
        while(start<end)
        {
            int area = Math.min(heights[start], heights[end]) * (end - start);
            if(area > max)
            {
                max = area;
            }
            if(heights[start] < heights[end])
            {
                start = start+1;
            }
            else
            {
                end = end - 1;
            }
        }
        return max;
    }
}