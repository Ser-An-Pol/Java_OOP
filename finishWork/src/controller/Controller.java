package controller;

import core.IComplex;
import core.ICalculator;
import core.IComplexFactory;
import core.Operator;

import java.util.Scanner;

import static core.Service.*;

public class Controller<T extends IComplex> implements IController<T>{
    ICalculator<T> calculator;
    T operandA;
    T operandB;
    Operator operator;

    public Controller(ICalculator<T> calculator, Class<T> tClass) {
        this.calculator = calculator;
        this.operandA = IComplexFactory.create(tClass);
        this.operandB = IComplexFactory.create(tClass);
    }

    @Override
    public boolean inputOperandA() {
        Scanner scanner = new Scanner(System.in);
        double[] comp;
        try {
            comp = stringToTwoDouble(scanner.nextLine());
        } catch (Exception e) {
            return false;
        }
        operandA.setReal(comp[0]);
        operandA.setImaginary(comp[1]);
        return true;
    }

    @Override
    public boolean inputOperandB() {
        Scanner scanner = new Scanner(System.in);
        double[] comp;
        try {
            comp = stringToTwoDouble(scanner.nextLine());
        } catch (Exception e) {
            return false;
        }
        operandB.setReal(comp[0]);
        operandB.setImaginary(comp[1]);
        return true;
    }

    @Override
    public boolean inputOperator() {
        Scanner scanner = new Scanner(System.in);
        try {
            operator = stringToOperator(scanner.nextLine());
        } catch (RuntimeException e) {
            return false;
        }
        return true;
    }

    @Override
    public void calculate() {
        calculator.setOperandA(operandA);
        calculator.setOperandB(operandB);
        calculator.setOperator(operator);
        calculator.calculate();
    }

    @Override
    public boolean inputNext() {
        Scanner scanner = new Scanner(System.in);
        boolean isNext = stringToBoolean(scanner.nextLine());
        if (isNext) operandA = calculator.getResult();
        return isNext;
    }

    @Override
    public boolean inputNew() {
        Scanner scanner = new Scanner(System.in);
        return stringToBoolean(scanner.nextLine());
    }
}
