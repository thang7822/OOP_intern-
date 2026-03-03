package Collection;

import java.util.*;

public class danhSach {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Thang");
        list.add("Phuong");
        list.add("Phuong Thang");
        list.add("Thang Phuong");
        System.out.println(list.get(0));
        list.forEach(System.out::println);

        System.out.println( );

        list = new LinkedList<>();
        list.add("Thang");
        list.add("Phuong");
        list.add("Phuong Thang");
        list.add("Thang Phuong");
        list.forEach(System.out::println);
        list.remove("Thang");
        list.forEach(System.out::println);

    }

}
