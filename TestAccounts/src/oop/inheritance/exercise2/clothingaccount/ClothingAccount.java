package oop.inheritance.exercise2.clothingaccount;

import inheritance.exercise2.account.Account;
/**
 * @author Ladzani_fabian
 */
public class ClothingAccount extends Account{
    private int pointsEarned;
    private double credit;
    private double creditLimit;

    public ClothingAccount() {
    }

    public ClothingAccount(int pointsEarned, double credit, double creditLimit) {
        this.pointsEarned = pointsEarned;
        this.credit = credit;
        this.creditLimit = creditLimit;
    }

    public ClothingAccount(int pointsEarned, double credit, double creditLimit, int i, String string) {
        super(i, string);
        this.pointsEarned = pointsEarned;
        this.credit = credit;
        this.creditLimit = creditLimit;
    }

    public double getCredit() {
        return credit;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }
    
    public boolean buy(double amount){
        boolean canPurchase;
        if(creditLimit > credit){
            canPurchase = true;
            credit += amount;
            pointsEarned += 100;
        }else{
            canPurchase = false;
            
        }
        return canPurchase;
    }
    public double minimumPayment(){
        final double REQUIRED_MINI_PAYMENT_PERCENTAGE = 0.15;
       double payment = getCredit() * REQUIRED_MINI_PAYMENT_PERCENTAGE;
       return payment;
    }
    
    
    
    
}
