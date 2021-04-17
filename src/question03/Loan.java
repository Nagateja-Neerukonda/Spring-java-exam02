/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author Neerukonda Nagateja
 */
public class Loan {

    private double Loanamount;
    private double interestRate;
    private String loanPurpose;

    public Loan(double Loanamount, double interestRate, String loanPurpose) {
        this.Loanamount = Loanamount;
        this.interestRate = interestRate;
        this.loanPurpose = loanPurpose;

    }

    @Override
    public String toString() {
        return """
               Loan Details Are :
               Loanamount=""" + Loanamount + ", interestRate= " + 
               interestRate + ", loanPurpose= " + loanPurpose + '}';
    }

}
