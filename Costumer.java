import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class Costumer {
    private String name;
   private Passport passport;
   private Bank bank;
   private Product [] products;

    public Costumer(String name, Passport passport, Bank bank, Product[] products) {
        this.name = name;
        this.passport = passport;
        this.bank = bank;
        this.products = products;
    }

    public Costumer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    public Product[] addProduct(Product productName) {
        for (Product pp : products) {
            if (!pp.equals(productName)) {
                Product[] ppp = new Product[products.length + 1];
                for (int i = 0; i < products.length; i++) {
                    ppp[i] = products[i];
                }
                ppp[products.length] = productName;
                products = Arrays.copyOf(ppp, ppp.length);
                return products;
            }
        }
        return null;
    }
    public Product[] deleteProductByName(String name, String productName) {
        int indexToRemove = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(productName) && products[i].getName().equals(name)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            Product[] arr = new Product[products.length - 1];
            int j = 0;
            for (int i = 0; i < products.length; i++) {
                if (i != indexToRemove) {
                    arr[j] = products[i];
                    j++;
                    System.out.println(products[i]);
                }
            }
            products = arr;
            products = Arrays.copyOf(arr, arr.length - 1);
        }
        return products;
    }

    public void getAllCostumerProducts(String name) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name)) {
                System.out.println(getName());

            }


        }

    }

//    public  void updateCostumerName(String name,String newName) {
//        for (int i = 0; i < costumers.length; i++) {
//            if (costumers[i].getName().equals(name)) {
//                costumers[i].setName(newName);
//                System.out.println(costumers[i].getName());
//            }
//        }
//    }



    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", passport=" + passport +
                ", bank=" + bank +
                ", products=" + Arrays.toString(products) +
                '}';
    }
}
