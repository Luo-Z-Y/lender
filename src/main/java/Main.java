/*
public class Main {

    public static void main(String[] args) {
        LoanManager m1 = new LoanManager();
        m1.addLoan("Alice Betsy", 100, 0.1);
        m1.addLoan("Ben Chee", 50, 0.2);
        m1.addLoan("Chris Davis", 30, 0.3);
        m1.setAsPaid("Ben Chee");
        m1.listLoans();
        System.out.println("profit from m1: " + m1.calculateProfitEarned());

        LoanManager m2 = new LoanManager();
        m2.addLoan("Alice Betsy", 500, 0.05);
        m2.addLoan("Emily Hee", 25, 0.15);
        m2.setAsPaid("Alice Betsy");
        m2.listLoans();
        System.out.println("profit from m2: " + m2.calculateProfitEarned());
    }
}
*/

public class Main {

    public static void main(String[] args) {
        Loan[] loans = new Loan[100];
        int loansCount = 0;

        loans[loansCount] = new Loan(100, "Alice Betsy", 0.1, "12345678");
        loansCount++;
        loans[loansCount] = new Loan(50, "Ben Chee", 0.2, "87654321");
        loansCount++;
        loans[loansCount] = new Loan(30, "Chris Davis", 0.3, "11111111");
        loansCount++;

        loans[1].setAsPaid();

        for (int i = 0; i < loansCount; i++) {
            if (!loans[i].getIsPaid()) {
                System.out.println(loans[i].getBorrower() + ": " + loans[i].getAmount());
            }
        }

        double profit = 0;
        for (int i = 0; i < loansCount; i++) {
            // if the loan was repaid, add the interest to profit
            if (loans[i].getIsPaid()) {
                profit = profit + (loans[i].getAmount() * loans[i].getInterestRate());
            }
        }
        System.out.println("profit: " + profit);
    }
}