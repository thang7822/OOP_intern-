package Collection;

import java.util.HashSet;
import java.util.Set;

public class subject {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        list.add("Toan");
        list.add("ly");
        list.add("hoa");
        list.add("sinh");
        list.add("su");

        // in ra toan bo
        list.forEach(System.out::println);
        // Kiem tra ton tai
        System.out.println(list.contains("Toan"));// true neu co Toan nguoc lai la false
        // Xoa phan tu
        list.remove("sinh");
        System.out.println("Xoa thanh cong");
        list.forEach(System.out::println);

    }
}
