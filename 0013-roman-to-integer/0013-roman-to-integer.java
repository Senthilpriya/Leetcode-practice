class Solution {
    public int romanToInt(String s) {
        char c[]=s.toCharArray();
        int ans=0,num=0,prev=0;
        int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
        for(int i=s.length()-1;i>=0;i--){
            switch(c[i]){
                case 'I':
                num=1;
                break;
                case 'V':
                num=5;
                break;
                case 'X':
                num=10;
                break;
                case 'L':
                num =50;
                break;
                case 'C':
                num=100;
                break;
                case 'D':
                num=500;
                break;
                case 'M':
                num=1000;
                break;
        }

           if(num>=prev){
            ans+=num;
            //System.out.println(ans);
           }
           else{
            ans-=num;
            //System.out.println(ans);

           }
           prev=num;
        }
            return ans;
        }
    }
