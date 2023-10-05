package Food;

import java.io.Serializable;
import java.util.Set;

public class Food_pop implements Serializable{
    private String name;
    public String popcount;
    private double price;
    private Set<String> popList;

    public Food_pop(String name, String popcount) {
        this.name = name;
        this.popcount = popcount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopcount() {
        return popcount;
    }

    public void setPopcount(String popcount) {
        this.popcount = popcount;
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }


    public void info() {     // 이게 뭔지 모르겠다..
        System.out.println("상품명: " + name);
        System.out.println("가격: " + popcount);
    }

    @Override
    public String toString() {
        return "Product{" +
                "item='" + name + '\'' +
                ", price=" + popcount +
                '}';
    }

}
