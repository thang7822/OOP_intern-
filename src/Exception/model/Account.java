package Exception.model;

import Exception.exception.InsufficientBalanceException;
import Exception.exception.InvalidAmountException;

public class Account {
    private double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public double deposit(double tienGui){
        if (tienGui <= 0){
            throw new InvalidAmountException("Tien gui khong nho hon 0");
        }
        return balance += tienGui;
    }

    public double withdraw(double tienRut){
        if (tienRut <= 0){
            throw new InvalidAmountException("Tien rut khong nho hon 0");
        }
        if (tienRut > balance) {
            throw new InsufficientBalanceException("So du khong du");
        }
        return balance -= tienRut;
    }
}
