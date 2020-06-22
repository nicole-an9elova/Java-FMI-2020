package sample;

public class LoanComponent {
    private double annualInterestRate;
    private double loanAmount;
    private int numberOfYears;

    public LoanComponent(double annualInterestRate, double loanAmount, int numberOfYears) {
        setAnnualInterestRate(annualInterestRate);
        setLoanAmount(loanAmount);
        setNumberOfYears(numberOfYears);
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount >= 0.0) {
            this.loanAmount = loanAmount;
        }
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears >= 0) {
            this.numberOfYears = numberOfYears;
        }
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        if (annualInterestRate >= 0.0) {
            this.annualInterestRate = annualInterestRate;
        }
    }
    public double monthlyPayment(){
        annualInterestRate = (annualInterestRate / 100) / 12;
        double temp = numberOfYears * 12;
        double temp2 = Math.pow(1 + annualInterestRate,temp);
        double result = (temp2 - 1) / (annualInterestRate * temp2);
        return (loanAmount / result);
    }
}

