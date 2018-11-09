public class Sequence {
    private String ss;
    public Sequence() {}
    public Sequence(String s){
        this.ss = s;
    }
    void setValue(String s){
        this.ss = s;
    }

    boolean isPalindrome(){
        String str = this.ss;
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }
    boolean isSubstring(Sequence s){
        String str = s.ss;
        for(int i = 0; i < this.ss.length(); i++){
            if(ss.charAt(i) != str.charAt(i))
                return false;
        }
        return true;
    }
}
