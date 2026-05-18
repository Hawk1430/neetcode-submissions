class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int ans = -1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int b = j-i;
                int area = b* (Math.min(heights[i], heights[j]));
                ans =  Math.max(area, ans);
            }
        }
        return ans;
    }
}
