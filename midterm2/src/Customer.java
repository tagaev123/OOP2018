public class Customer {
    String name;
    boolean member = false;
    String memberType;
    public Customer() {}
    public Customer(String name, boolean member, String memberType){
        this.member = member;
        this.memberType = memberType;
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    boolean isMember(){
        return this.member;
    }

    void setMember(boolean member){
        this.member = member;
    }

    String getMemberType(){
         return this.memberType;
    }

    void setMemberType(String memberType){
        this.memberType = memberType;
    }


    public String toString(){
        return "My name is " + this.name + ". " + "I am from " + this.memberType;
    }


}
