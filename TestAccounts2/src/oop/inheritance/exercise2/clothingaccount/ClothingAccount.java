
package oop.inheritance.exercise2.clothingaccount;

import inheritance.exercise2.account.Account;


public class ClothingAccount extends Account{
    private int pointsEarned;
    private double credit;
    private double creditLimit;

    public ClothingAccount() {
    }

    public ClothingAccount(int pointsEarned, double credit, double creditLimit, int i, String string) {
        super(i, string);
        this.pointsEarned = pointsEarned;
        this.credit = credit;
        this.creditLimit = creditLimit;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public double getCredit() {
        return credit;
    }
    
    public boolean buy(double amount){
        if(creditLimit > credit){
            return false;
        }else{
            credit += amount;
            
            if(amount >= 100){
                pointsEarned += 1;
            }
        }
        return true;
    }
    public double minimumPayment(){
        return this.credit * 0.15;
    }
}
