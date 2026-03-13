package Exception.try_in_try;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        try {
            System.out.print("Nhập số nguyên mẫu số: ");
            int mauSo = sc.nextInt();

            try {
                int ketQua = 100 / mauSo;
                System.out.println("Kết quả: 100 / " + mauSo + " = " + ketQua);
            } catch (ArithmeticException e){
                System.out.println("Không thể chia cho 0");
            }

        } catch (InputMismatchException e) {
            System.out.println(" Bạn đã nhập chữ thay vì số");
            sc.nextLine();

        } finally {
            sc.close();
        }
    }
}

