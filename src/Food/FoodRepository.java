package Food;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FoodRepository {
    private static Map<String, Food_pop> MenuList;

    static {
        MenuList = new HashMap<>();
    }

    public boolean addNewMenu(String name, String popcount ) {
        if (!MenuList.containsKey(name)) {
            Food_pop Fpop = new Food_pop(name, popcount);
            MenuList.put(name, Fpop);
            return true;
        } else {
            return false;
        }
    }


    public static Map<String, Food_pop> getProductList() {
        return MenuList;
    }

    public void autoSave() {
        File f = new File("Menu.sav");
        try (FileOutputStream fos = new FileOutputStream(f)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(MenuList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Load product data from a file
    public void loadFile() {
        File f = new File("Menu.sav");
        if (f.exists()) {
            try (FileInputStream fis = new FileInputStream(f)) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                MenuList = (Map<String, Food_pop>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int count() {
        return MenuList.size(); // 주문 수를 얻고자 하는 경우
    }


    public boolean isRegistered(String popconName) {
        return MenuList.containsKey(popconName);
    }
}
