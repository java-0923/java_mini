package Food;

import java.io.Serializable;
import java.util.Set;

public class Food_pop implements Serializable{
    private String name;     // 상품명
    public String popcount;  // 팝콘 개수
    public String dricount;  // 음료 개수
    public String sidcount;  // 사이드 개수
    public double price;    // 가격(상품 가격)
    public double totalPrice;    // 총 가격(등록 메뉴 누적 가격)


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

    public String getDricount() {
        return dricount;
    }

    public void setDricount(String dricount) {
        this.dricount = dricount;
    }

    public String getSidcount() {
        return sidcount;
    }

    public void setSidcount(String sidcount) {
        this.sidcount = sidcount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void info() {     // 이게 뭔지 모르겠다.
        System.out.println("상품명: " + name);
        System.out.println("개수: " + popcount);
    }

    @Override
    public String toString() {
        return "Food_pop{" +
                "name='" + name + '\'' +
                ", count=" + popcount +
                '}';
    }

}
