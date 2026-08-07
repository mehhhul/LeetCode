 class Solution {
  public int lengthOfLastWord(String s) {
         s=s.trim();
//         int j=s.length()-1;
//         int i=j;
//         while(i>=0 && s.charAt(i)!=' '){
//             i--;
//         }
//         return j-i;
        int lastSpace = s.lastIndexOf(' ');
        return s.length() - lastSpace - 1;
     }
 }


    