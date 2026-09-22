class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int high=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }   
        while(l<=high){
            int mid=l+(high-l)/2;
            long hours =0;
            for(int i=0;i<piles.length;i++){
                hours+= (piles[i] + mid -1)/mid;
            }
            if(hours <= h){
                high=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}