import java.text.DecimalFormat;
import java.util.ArrayList;

public class Account {
    /**
     * Class Account .
     */
    private double balance = 0;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();

    /**
     * deposit/withdraw.
     */
    private void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance));
        } else {
            System.out.println("So tien ban nap vao khong hop le!");
        }
    }

    private void withdraw(double amount) {
        if (amount >= 0) {
            if (balance - amount >= 0) {
                balance -= amount;
                transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance));
            } else {
                System.out.println("So tien ban rut vuot qua so du!");
            }
        } else {
            System.out.println("So tien ban rut ra khong hop le!");
        }

    }

    /**
     * Add.
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Print.
     */
    public void printTransaction() {
        DecimalFormat f = new DecimalFormat("##.00");
        for (int i = 0; i < transitionList.size(); i++) {
            double bl = (double) Math.floor(transitionList.get(i).getBalance() * 100) / 100;
            double am = (double) Math.floor(transitionList.get(i).getAmount() * 100) / 100;
            if (transitionList.get(i).getOperation().equals("deposit")) {
                System.out.println("Giao dich " + (i + 1) + ": Nap tien $"
                        + f.format(am) + ". So du luc nay: $" + f.format(bl) + ".");
            } else {
                System.out.println("Giao dich " + (i + 1) + ": Rut tien $"
                        + f.format(am) + ". So du luc nay: $" + f.format(bl) + ".");
            }
        }
    }

}