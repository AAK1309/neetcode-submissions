class Solution {
    public boolean isAnagram(String s, String t) {

       char[] a = s.toCharArray();
       char[] b = t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
       if(Arrays.equals(a,b)){
        System.out.println("racecar");
        return true;
       }
       System.out.println("carrace");
       return false;
    }
}
