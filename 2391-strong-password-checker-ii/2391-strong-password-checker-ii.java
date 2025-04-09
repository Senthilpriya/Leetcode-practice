class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int l=0,u=0,d=0,s=0;
        for(int i=0;i<password.length();i++){
            if(i<password.length()-1 && password.charAt(i)==password.charAt(i+1)) return false;
            if( Character.isLowerCase(password.charAt(i))) l++;
            if(Character.isUpperCase(password.charAt(i))) u++;
            if(Character.isDigit(password.charAt(i))) d++;
            if("!@#$%^&*()-+".indexOf(password.charAt(i))!=-1)  s++;
            if(password.length()<8) return false;

        }
        if(l==0||u==0||d==0||s==0){
            return false;
        }
        return true;
    }
}