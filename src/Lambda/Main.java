package Lambda;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo Service và dữ liệu mẫu
        StudentService service = new StudentService();
        service.list.add(new Student("An", 3.5, "IT"));
        service.list.add(new Student("Binh", 2.8, "Biz"));
        service.list.add(new Student("Cuong", 3.9, "IT"));
        service.list.add(new Student("Dung", 3.1, "Marketing"));

        System.out.println("--- TẤT CẢ SINH VIÊN ---");
        service.list.forEach(System.out::println);

        // 2. Test hàm highGPA (GPA > 3.2)
        System.out.println("\n--- SINH VIÊN GPA CAO (> 3.2) ---");
        List<Student> highGpaList = service.highGPA();
        highGpaList.forEach(System.out::println);

        // 3. Test hàm danhSach (Chỉ lấy tên)
        System.out.println("\n--- DANH SÁCH TÊN SINH VIÊN ---");
        List<String> tenSV = service.danhSach();
        System.out.println(tenSV);

        // 4. Test hàm sort (Sắp xếp theo GPA tăng dần)
        System.out.println("\n--- SẮP XẾP THEO GPA TĂNG DẦN ---");
        List<Student> sortedList = service.sort();
        sortedList.forEach(System.out::println);

        // 5. Test hàm countSV (Đếm sinh viên ngành IT)
        System.out.println("\n--- SỐ LƯỢNG SINH VIÊN NGÀNH IT ---");
        long countIT = service.countSV();
        System.out.println("Số sinh viên IT: " + countIT);

        // 6. Test hàm checkStudent với Optional
        System.out.println("\n--- KIỂM TRA OPTIONAL ---");
        // Trường hợp tìm thấy (lấy sinh viên đầu tiên trong danh sách)
        Optional<Student> findFirst = service.list.stream().findFirst();
        service.checkStudent(findFirst);

        // Trường hợp không tìm thấy (Optional rỗng)
        try {
            service.checkStudent(Optional.empty());
        } catch (RuntimeException e) {
            System.out.println("\nLỗi mong đợi: " + e.getMessage());
        }
    }
}