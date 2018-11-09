public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer("Steve", true, "Premium");

        Visit cust1 = new Visit(cust, "12-18-2000");

        cust1.setServiceExpense(2000);
        cust1.setProductExpense(1000);
        System.out.println(cust1.getServiceExpense());
        System.out.println(cust1.getProductExpense());
        System.out.println(cust1.getTotalExpense());
    }
}
