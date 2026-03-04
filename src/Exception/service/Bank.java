package Exception.service;

import Exception.exception.InsufficientBalanceException;
import Exception.exception.InvalidAmountException;
import Exception.model.Account;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> list = new ArrayList<>();

    public Account createAccount(){
        Account acc = new Account();
        list.add(acc);
        return acc;
    }

    public void deposit(Account accountNumber, double tienGui){
        accountNumber.deposit(tienGui);
        System.out.println("Gui tien thanh cong");
    }

    public void withdraw(Account accountNumber, double rutTien){
        accountNumber.withdraw(rutTien);
        System.out.println("Rut tien thanh cong");
    }

    public void transfer(Account acc1, Account acc2, double tienChuyen){
        double tienAcc1 = acc1.getBalance();
        double tienAcc2 = acc2.getBalance();
        if (tienChuyen<=0){
            throw new InvalidAmountException("Chuyển tiền khong nho hon 0");
        }
        if(tienAcc1 == 0 || tienAcc1 < tienChuyen){
            throw new InsufficientBalanceException("So du khong du");
        }
        tienAcc2 += tienChuyen;
        tienAcc1 -= tienChuyen;
        acc1.setBalance(tienAcc1);
        acc2.setBalance(tienAcc2);

        System.out.println();
    }
}
