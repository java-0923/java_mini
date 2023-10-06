package FoodV;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FoodRepository {
    private static Map<String, Food_pop> popList;

    static {
        popList = new HashMap<>();
    }

    public boolean addNewMenu(String name, double price) {
        if (!popList.containsKey(name)) {
            Food_pop Fpop = new Food_pop(name, price);
            popList.put(name, Fpop);
            return true;
        } else {
            return false;
        }
    }

    // Show the list of products
    public void showProductList() {
        for (Food_pop Fpop : popList.values()) {
            System.out.println(Fpop);
        }
    }

    public static Map<String, Food_pop> getProductList() {
        return popList;
    }

    public void autoSave() {
        File f = new File("Popcon.sav");
        try (FileOutputStream fos = new FileOutputStream(f)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(popList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Load product data from a file
    public void loadFile() {
        File f = new File("Popcon.sav");
        if (f.exists()) {
            try (FileInputStream fis = new FileInputStream(f)) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                popList = (Map<String, Food_pop>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // FoodRepository 클래스에서
    public int count() {
        return popList.size(); // 주문 수를 얻고자 하는 경우
    }


    public boolean isRegistered(String popconName) {
        return popList.containsKey(popconName);
    }
}
