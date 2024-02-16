/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ladzi.model.Impl;

import com.ladzi.model.Arithmetic;
import common.Operation;

/**
 *
 * @author Ladzani_fabian
 */
public class ArithmeticCalculator implements Arithmetic {
    
    private Integer num1;
    private Integer num2;
    private String operation;
    private Integer answer;
    
    public ArithmeticCalculator(){}

    @Override
    public String getAnswer() {
        try {
            doCalculation();
        } catch (Exception e) {
            return e.getMessage();
        }
        return String.valueOf(this.answer);
    }

    @Override
    public void setOperands(String num1, String num2) {
        this.num1 = Integer.valueOf(num1);
        this.num2 = Integer.valueOf(num2);
    }

    @Override
    public void setOperation(String operation) {
        this.operation = operation;
    }
    private void doCalculation() throws Exception {
        switch (operation) {
            case Operation.ADD:
                this.answer = this.num1 + this.num2;
                break;
            case Operation.SUBTRACT:
                this.answer = this.num1 - this.num2;
                break;
            case Operation.MULITPLY:
                this.answer = this.num1 * this.num2;
                break;
            case Operation.DIVIDE:
                if(num2 == 0){
                   throw new Exception("cannot divide by zero");
                }else {
                    this.answer = num1/num2;
                }
                break;
            default:
                throw new Exception("wooah!");
        } 
    }
}

