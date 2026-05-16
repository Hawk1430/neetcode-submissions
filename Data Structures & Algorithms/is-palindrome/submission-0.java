class Solution {
    public boolean isPalindrome(String s) {
        int end = s.length()-1;
        int start = 0;
        while (start < end){
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }

            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if(Character.toLowerCase(s.charAt(start))== Character.toLowerCase(s.charAt(end))){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
