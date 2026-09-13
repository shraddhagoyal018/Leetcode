class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int base=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                base += customers[i];
            }
        }
        int extra =0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                extra += customers[i];
            }
        }
        int maxExtra = extra;
        for(int r=minutes;r<customers.length;r++){
            if(grumpy[r]==1){
                extra += customers[r];
            }
            if(grumpy[r- minutes]==1){
                extra -= customers[r - minutes];
            }
            maxExtra = Math.max(maxExtra,extra);
        }
        return base + maxExtra;
    }
}