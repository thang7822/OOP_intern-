package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentService {
    List<Student> list = new ArrayList<>();

    public void checkStudent(Optional<Student> std){
        if (std.isEmpty()){
            throw new RuntimeException("Khong tim thay sinh vien");
        } else {
            System.out.printf("Sinh vien %s ton tai.",std);
        }
    }

    public List<Student> highGPA(){
        List<Student> ls = list.stream().filter(x -> x.getGpa() > 3.2).collect(Collectors.toList());
        return ls;
    }

    public List<String> danhSach(){
        List<String> ds = list.stream().map(x -> x.getName()).collect(Collectors.toList());
        return ds;
    }

    public List<Student> sort(){
        List<Student> sortSV = list.stream().sorted(Comparator.comparing(Student::getGpa)).collect(Collectors.toList());
        return sortSV;
    }

    public long countSV(){
        long count = list.stream().filter(x -> x.getMajor() == "IT").count();
        return count;
    }
}
