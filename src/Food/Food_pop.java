package Food;

import java.io.Serializable;

public class Food_pop implements Serializable{
    private String name;        // 상품명
    private int price;          // 가격(상품 가격)
    private int popcount;       // 팝콘 개수
    private int dricount;       // 음료 개수
    private int sidcount;       // 사이드 개수
    private double totalPrice;  // 총 가격(등록 메뉴 누적 가격)

    public Food_pop(String name, int price) {
        this.name = name;
        this.price = price;
        this.popcount = 0;
        this.dricount = 0;
        this.sidcount = 0;
        this.totalPrice = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPopcount() {
        return popcount;
    }

    public void setPopcount(int popcount) {
        this.popcount = popcount;
    }

    public int getDricount() {
        return dricount;
    }

    public void setDricount(int dricount) {
        this.dricount = dricount;
    }

    public int getSidcount() {
        return sidcount;
    }

    public void setSidcount(int sidcount) {
        this.sidcount = sidcount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Food_pop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
