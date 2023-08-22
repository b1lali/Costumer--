import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
public class Product {
    private String name;
    private String description;
    private int price;
    private int count;
    private LocalDate madeInDate;
    private boolean isAlcoholic;

    public Product(String name, String description, int price, int count, LocalDate madeInDate, boolean isAlcoholic) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.count = count;
        this.madeInDate = madeInDate;
        this.isAlcoholic = isAlcoholic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public LocalDate getMadeInDate() {
        return madeInDate;
    }

    public void setMadeInDate(LocalDate madeInDate) {
        this.madeInDate = madeInDate;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }
    public String checkProduct(Product [] products){
        for (int i = 0; i < products.length; i++) {
            Period  period = Period.between(products[i].getMadeInDate(), LocalDate.of(2023,9, 10 ));
            if(period.getMonths()>=1){
                System.out.println(products[i]);
                return "expired";
            }
        }
        return "not expired";
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", madeInDate=" + madeInDate +
                ", isAlcoholic=" + isAlcoholic +
                '}';
    }
}
