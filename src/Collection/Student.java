package Collection;

import java.util.HashMap;
import java.util.Map;

public class Student {
    public static void main(String[] args) {
        Map<String,String> danhSach = new HashMap<>();
        danhSach.put("SV01", "Thang");
        danhSach.put("SV02", "Phuong");
        danhSach.put("SV03", "An");
        danhSach.put("SV04", "Linh");
        danhSach.put("SV05", "Huy");
        // sua phan tu
        danhSach.put("SV04","Cuong");
        //Xoa phan tu
        danhSach.remove("SV03");
        //Duyet danh sach phan tu
        danhSach.forEach((Key, Value)-> System.out.println(Key + "-" + Value));
        // Goi phan tu
        System.out.println(danhSach.get("SV01"));

    }
}
