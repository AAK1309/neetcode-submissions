class Solution {
    public boolean isAnagram(String s, String t) {

       char [] a = s.toCharArray();
       char [] b = t.toCharArray();

       Arrays.sort(a);
       Arrays.sort(b);
       if(Arrays.equals(a,b)){
         System.out.println("Anagram");
         return true;
       } else 
       System.out.println("not anagram");
       return false;
    }
}
