public class PalindromNumber_9 {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        StringBuffer bf=new StringBuffer(s);
        bf.reverse();
        String sb=bf.toString();
        return (s.equals(sb));
    }
}
