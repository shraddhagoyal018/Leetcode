class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder x = new StringBuilder();
        StringBuilder y =new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(x.length()>0)
                x.deleteCharAt(x.length()-1);
            }
            else{
                x.append(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(y.length()>0)
                y.deleteCharAt(y.length()-1);
            }
            else {
                y.append(t.charAt(i));
            }
        }
        return x.toString().equals(y.toString());
    }
}