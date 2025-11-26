package atu.ie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person myPerson = new Person();
        System.out.println(myPerson.toString());
        Customer myCustomer = new Customer("Fionán", "Loughrea", "2222", 12, true);
        System.out.println(myCustomer.toString());
    }
}