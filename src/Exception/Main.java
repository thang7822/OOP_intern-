package Exception;

import Exception.exception.InsufficientBalanceException;
import Exception.exception.InvalidAmountException;
import Exception.model.Account;
import Exception.service.Bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        bank.createAccount();
        bank.createAccount();

        Account acc1 = new Account();
        Account acc2 = new Account();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nạp tiền acc1");
            System.out.println("2. Rút tiền acc1");
            System.out.println("3. Chuyển tiền acc1 -> acc2");
            System.out.println("4. Xem số dư");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();

            try {

                switch (choice) {
                    case 1:
                        System.out.print("Nhập số tiền nạp: ");
                        double tienGui = sc.nextDouble();
                        bank.deposit(acc1, tienGui);
                        break;

                    case 2:
                        System.out.print("Nhập số tiền rút: ");
                        double tienRut = sc.nextDouble();
                        bank.withdraw(acc1, tienRut);
                        break;

                    case 3:
                        System.out.print("Nhập số tiền chuyển: ");
                        double tienChuyen = sc.nextDouble();
                        bank.transfer(acc1, acc2, tienChuyen);
                        System.out.println("Chuyển tiền thành công");
                        break;
                }

            }
            catch (InvalidAmountException e) {
                System.out.println("Lỗi số tiền không hợp lệ!");
                e.printStackTrace();
            }
            catch (InsufficientBalanceException e) {
                System.out.println("Không đủ số dư!");
                e.printStackTrace();
            }
        }
    }
}