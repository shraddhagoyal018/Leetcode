class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq= new int[26];
        int left=0;
        int maxfreq=0;
        int ans=0;
        for(int r =0;r<s.length();r++){
            freq[s.charAt(r) - 'A']++;
            maxfreq= Math.max(maxfreq,freq[s.charAt(r) - 'A']);
            while((r-left+1)-maxfreq > k){
            freq[s.charAt(left) - 'A']--;
            left++;
            }
            ans = Math.max(ans, r - left +1); 
        } 
        return ans;
    }
}