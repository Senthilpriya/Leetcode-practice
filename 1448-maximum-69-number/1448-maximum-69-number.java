class Solution {
    public int maximum69Number (int num) {
        String p=String.valueOf(num);
        Boolean valid= false;
        char arr[]=p.toCharArray();
       
        
            for(int i=0;i<p.length();i++){
                
               if(arr[i]=='6'){
                arr[i]='9';
                break;
               }
            
        }
        StringBuilder pr= new StringBuilder();
        for(int i=0;i<arr.length;i++){
            pr.append(arr[i]);
        }
        int g=Integer.parseInt(pr.toString());
        return g;
    }
}