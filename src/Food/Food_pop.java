package Food;
import java.io.Serializable;

public class Food_pop implements Serializable {
    private String orderNumber; // 주문 번호 추가
    private String name;        // 상품명
    private int price;          // 가격(상품 가격)
    private int popcount;       // 팝콘 개수
    private int dricount;       // 음료 개수
    private int sidcount;       // 사이드 개수
    private int totalPrice;  // 총 가격(등록 메뉴 누적 가격)

    public Food_pop(String name, int price) {
        this.orderNumber = generateOrderNumber();
        this.name = name;
        this.price = price;
        this.popcount = 0;
        this.dricount = 0;
        this.sidcount = 0;
        this.totalPrice = 0;
    }

//    public Food_pop(String orderNumber, String name, int price, int popcount, int dricount, int sidcount, int totalPrice) {
//
//        this.name = name;
//        this.price = price;
//        this.popcount = popcount;
//        this.dricount = dricount;
//        this.sidcount = sidcount;
//        this.totalPrice = totalPrice;
//    }

    // 주문 번호를 생성하는 메서드
    private String generateOrderNumber() {
        return "ORD" + System.currentTimeMillis();
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
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

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void updateTotalPrice() {
        this.totalPrice = (popcount + dricount + sidcount) * price;
    }

    @Override
    public String toString() {
        return "Food_pop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", popcount=" + popcount +
                ", dricount=" + dricount +
                ", sidcount=" + sidcount +
                ", totalPrice=" + totalPrice +
                '}';
    }
}