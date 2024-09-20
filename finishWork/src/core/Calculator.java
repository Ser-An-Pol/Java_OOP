package core;

import core.arithm.IDivComplex;
import core.arithm.IMultComplex;
import core.arithm.ISumComplex;



public class Calculator<T extends IComplex> implements ICalculator<T> {
    private final IDivComplex<T> divComplex;
    private final IMultComplex<T> multComplex;
    private final ISumComplex<T> sumComplex;
    private final Class<T> tClass;

    private final T operandA;
    private final T operandB;
    private Operator operator;
    private T result;


    public Calculator(IDivComplex<T> divComplex, IMultComplex<T> multComplex, ISumComplex<T> sumComplex,
                      Class<T> tClass){
        this.divComplex = divComplex;
        this.multComplex = multComplex;
        this.sumComplex = sumComplex;
        this.tClass = tClass;
        this.operandA = IComplexFactory.create(tClass);
        this.operandB = IComplexFactory.create(tClass);
    }


    private void sum() {
        this.result = sumComplex.sum(operandA, operandB);
    }

    private void sub() {
        T operand = IComplexFactory.create(tClass);
        operand.setReal(-operandB.getReal());
        operand.setImaginary(-operandB.getImaginary());
        this.result = sumComplex.sum(operandA, operand);
    }

    private void mult() {
        this.result = multComplex.mult(operandA, operandB);
    }

    private void div() {
        this.result = divComplex.div(operandA, operandB);
    }

    @Override
    public void calculate() {
        switch (operator) {
            case SUM -> sum();
            case SUB -> sub();
            case MULT -> mult();
            case DIV -> div();
        }
    }

    @Override
    public T getOperandA() {
        T operand = IComplexFactory.create(tClass);
        operand.setReal(operandA.getReal());
        operand.setImaginary(operandA.getImaginary());
        return operand;
    }

    @Override
    public void setOperandA(T operandA) {
        this.operandA.setReal(operandA.getReal());
        this.operandA.setImaginary(operandA.getImaginary());
    }

    @Override
    public T getOperandB() {
        T operand = IComplexFactory.create(tClass);
        operand.setReal(operandB.getReal());
        operand.setImaginary(operandB.getImaginary());
        return operand;
    }

    @Override
    public void setOperandB(T operandB) {
        this.operandB.setReal(operandB.getReal());
        this.operandB.setImaginary(operandB.getImaginary());
    }

    @Override
    public T getResult() {
        T operand = IComplexFactory.create(tClass);
        operand.setReal(result.getReal());
        operand.setImaginary(result.getImaginary());
        return operand;
    }

    @Override
    public Operator getOperator() {
        return operator;
    }

    @Override
    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
