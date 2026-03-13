package Exception.try_in_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        try {
            System.out.print("Nhập số nguyên mẫu số: ");
            int mauSo = sc.nextInt();

            int ketQua = 100 / mauSo;
            System.out.println("Kết quả: 100 / " + mauSo + " = " + ketQua);

        } catch (InputMismatchException e) {
            System.out.println(" Bạn đã nhập chữ thay vì số");
            sc.nextLine();

            try {
                System.out.print("Nhập lại một số khác để chia: ");
                int soDuPhong = sc.nextInt();

                int ketQuaDuPhong = 100 / soDuPhong;
                System.out.println("Kết quả dự phòng: " + ketQuaDuPhong);

            } catch (ArithmeticException e2) {
                System.out.println("Bạn nhập số 0");
            } catch (InputMismatchException e3) {
                System.out.println("Bạn đã nhập chữ thay vì số");
            }
        } catch (ArithmeticException e4) {
            System.out.println("Bạn nhập số 0");
            sc.nextLine();
        }
        finally {
            sc.close();
        }
    }
}
