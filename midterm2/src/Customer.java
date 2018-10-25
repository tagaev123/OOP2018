public class Customer {
    String name;
    boolean member = false;
    String memberType;
    public Customer() {}
    public Customer(String name){
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

    @Override
    String toString(){
        return "My name is " + this.
    }


}
