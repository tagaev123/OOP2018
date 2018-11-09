public class Main {

    public static void main(String[] args){
        Sequence s1 = new Sequence("abba");
        Sequence s2 = new Sequence("abbas");

        System.out.println(s1.isPalindrome());
        System.out.println(s2.isPalindrome());

        System.out.println(s1.isSubstring(s2));

    }
}
