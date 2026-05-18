class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int ans = -1;
        //Brute approach
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         int b = j-i;
        //         int area = b* (Math.min(heights[i], heights[j]));
        //         ans =  Math.max(area, ans);
        //     }
        // }

        //Two pointer appoach
        int i = 0, j = n-1;
        while(i<j){
            int b = j-i;
            int area = b* (Math.min(heights[i], heights[j]));
            if(area>ans) ans= area;
            if( heights[i]<=heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}
