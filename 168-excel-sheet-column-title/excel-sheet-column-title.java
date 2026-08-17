class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        while(columnNumber>0){
            int temp = columnNumber % 26;
            if(temp ==0){
                title.insert(0,'Z');
            }
            else{
                title.insert(0,(char)('A' + (temp - 1 )));
            }
            columnNumber=(columnNumber-1)/26;
        }
        return title.toString();
    }
}