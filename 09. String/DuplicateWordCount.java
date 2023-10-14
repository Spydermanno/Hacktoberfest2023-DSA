
public class Solution {

     static void printSubstrings(String s) {

        for(int i=0;i<s.length();i++){
            String substring="";
            substring+=s.charAt(i);
            System.out.println(substring);
            for(int j=i+1;j<s.length();j++){
                substring+=s.charAt(j);
                System.out.println(substring);
            }
        }
    }
    public static void main(String[] args){
        String s="ankit";
        printSubstrings(ankit);
    }

}
