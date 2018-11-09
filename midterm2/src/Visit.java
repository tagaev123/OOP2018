import java.util.Date;
public class Visit {
    String name;
    Customer customer;
    String date;
    double serviceExpense = 0, productExpense = 0;

    Visit(Customer customer, String date){
        this.customer = customer;
        this.date = date;
    }
    String getName(){
        return this.customer.name;
    }

    double getServiceExpense(){
        return this.serviceExpense;
    }

    void setServiceExpense(double se){
        this.serviceExpense = se;
        this.serviceExpense = this.serviceExpense - (this.serviceExpense * DiscountRate.getServiceDiscountRate(customer.memberType));
    }

    double getProductExpense() {
            return this.productExpense;
    }

    void setProductExpense(double pe){
        this.productExpense = pe;
        if (customer.member) {
            this.productExpense = this.productExpense - (this.productExpense * DiscountRate.getProductDiscountRate(customer.memberType));
        }
    }

    double getTotalExpense(){
        return this.getProductExpense() + this.getServiceExpense();
    }

    public String toString() {
        return "My name is " + this.name + "My visit at " + this.date;
    }
}
