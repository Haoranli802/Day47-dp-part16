class Solution {
    public int countSubstrings(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        int count = 0;
        for(int i = len - 1; i >= 0; i--){
            for(int j = i; j < len; j++){
                if(s.charAt(i) == s.charAt(j) && (j - i <= 1 || dp[i + 1][j - 1])){
                    dp[i][j] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
//dp

class Solution {
    public int countSubstrings(String s) {
    
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            count++;

            //奇数长度
            int left = i - 1;
            int right = i + 1;
            while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }

            //偶数长度
            left = i;
            right = i + 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
//中心扩散
