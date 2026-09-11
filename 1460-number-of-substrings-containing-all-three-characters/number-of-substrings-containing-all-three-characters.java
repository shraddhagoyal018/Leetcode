        class Solution {
    public int numberOfSubstrings(String s) {

        int c=0,l=0;
        int[] freq=new int[26];
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r) - 'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                c+=s.length()-r;
                freq[s.charAt(l) - 'a']--;
                l++;
            }
        }
          return c;
    }
}