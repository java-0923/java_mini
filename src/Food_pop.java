import java.io.Serializable;
import java.util.Set;

public class Food_pop implements Serializable{
    private String name;
    private double price;
    private Set<String> popList;

    public Food_pop(String name, double price) {
        this.name = name;
//        this.popList = popList;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<String> getPopList() {
        return popList;
    }

    public void setPopList(Set<String> popList) {
        this.popList = popList;
    }

    public void info() {
        System.out.println("상품명: " + name);
        System.out.println("가격: " + price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
