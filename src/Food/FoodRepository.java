package Food;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FoodRepository {
    public static Map<String, Food_pop> MenuList;
    public static Map<String, Food_pop> UserMenuList;

    static {
        MenuList = new HashMap<>();
        MenuList.put("오리지널", new Food_pop("오리지널", 2000));
        MenuList.put("어니언", new Food_pop("어니언", 2500));
        MenuList.put("카라멜", new Food_pop("카라멜", 3000));
        MenuList.put("콜라", new Food_pop("콜라", 1000));
        MenuList.put("사이다", new Food_pop("사이다", 1000));
        MenuList.put("아이스 아메리카노", new Food_pop("아이스 아메리카노", 1500));
        MenuList.put("나쵸", new Food_pop("나쵸", 1000));
        MenuList.put("츄러스", new Food_pop("츄러스", 1000));
        MenuList.put("핫도그", new Food_pop("핫도그", 1500));
    }

    static {
        UserMenuList = new HashMap<>();
    }

    public boolean addNewMenu(String name, int popcount, int dricount, int sidcount) {
        if (MenuList.containsKey(name)) {
            Food_pop menu = MenuList.get(name);
            menu.setPopcount(popcount);
            menu.setDricount(dricount);
            menu.setSidcount(sidcount);
            // 총 가격 계산
            menu.setTotalPrice((popcount + dricount + sidcount) * menu.getPrice());
            return true;
        }
        return false;
    }

    public static Map<String, Food_pop> getMenuList() {
        return UserMenuList;
    }

    public void autoSave() {
        File f = new File("Menu.sav");
        try (FileOutputStream fos = new FileOutputStream(f)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(UserMenuList);
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
                UserMenuList = (Map<String, Food_pop>) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int count() {
        return UserMenuList.size(); // 주문 수를 얻고자 하는 경우
    }

}
