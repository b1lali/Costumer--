import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        Passport passport11 = new Passport(20, "Dubai", "Male");
        Passport passport1=new Passport(18, "Japan", "Female");

        Bank bank = new Bank("Bill", 12345, 150);
        Bank bank1=new Bank("Aijamal", 5678, 4000);

        Product product11 = new Product("Coca Cola","Beverage",80,456, LocalDate.of(2023, 9, 10), false);
        Product product12 = new Product("Fanta", "Beverage", 89, 890, LocalDate.of(2023,6,10) ,true);
        Product product13=new Product("Pepsi", "Beverage", 89, 456, LocalDate.of(2023,9,10), false);
        Product product14=new Product("KFC", "Beverage", 77, 5, LocalDate.of(2023,5,10),true);
        Product product15=new Product("Mac", "Beverage", 90, 67, LocalDate.of(2023,6,10), false);
        Product [] products={product11, product12};
        Product [] products1={product13, product14};

        Costumer customer=new Costumer("Elina", passport11, bank, products);
        Costumer customer1=new Costumer("Alina", passport1, bank1, products1);
        Costumer customer2=new Costumer("Alibek", passport1, bank1, products);
        Costumer [] costumers ={customer2,customer1,customer};

        System.out.println(product11.checkProduct(products));
        System.out.println(product13.checkProduct(products1));

        System.out.println(Arrays.toString(customer.addProduct(product15)));
        customer.getAllCostumerProducts("Coca Cola");

        System.out.println("-------------------------------------");
        customer.deleteProductByName("Fanta", "Fanta");
        System.out.println("------------------------");
        customer1.deleteProductByName("KFC", "KFC");
        System.out.println("-------------------------------");
        bank.credit("Bill", 50);
        System.out.println("-------------------------------");
        bank.credit2("Bill",80);
        System.out.println("-------------------------------");

        DateBase dateBase = new DateBase(costumers);
        dateBase.updateCostumerName("Elina", "Elinahon");
        System.out.println(dateBase.payment("Aijamal", 5678, 3000));



    }
}
