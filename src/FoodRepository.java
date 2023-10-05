import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
public class FoodRepository {
    private static Map<String, Food_pop> popList;

    static {
        popList = new HashMap<>();
    }

    public void addNewFood(String name, double price) {
        Food_pop Fpop = new Food_pop(name, price);
        popList.put(name, Fpop);
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
        File f = new File("/Popcon.sav");
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
}
