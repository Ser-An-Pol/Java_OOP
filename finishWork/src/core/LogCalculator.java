package core;

import view.ILogger;

public class LogCalculator<T extends IComplex> implements ICalculator<T>{
    ICalculator<T> decorated;
    ILogger logger;


    public LogCalculator(ICalculator<T> decorated, ILogger logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public void calculate() {
        logger.logStartMethod();
        decorated.calculate();
        logger.logFinishMethod();
    }

    @Override
    public T getOperandA() {
        logger.logStartMethod();
        T operand = decorated.getOperandA();
        logger.logFinishMethodWithResult(operand.toString());
        return operand;
    }

    @Override
    public void setOperandA(T operandA) {
        logger.logStartMethodWithParameter(operandA.toString());
        decorated.setOperandA(operandA);
        logger.logFinishMethod();
    }

    @Override
    public T getOperandB() {
        logger.logStartMethod();
        T operand = decorated.getOperandB();
        logger.logFinishMethodWithResult(operand.toString());
        return operand;
    }

    @Override
    public void setOperandB(T operandB) {
        logger.logStartMethodWithParameter(operandB.toString());
        decorated.setOperandB(operandB);
        logger.logFinishMethod();
    }

    @Override
    public T getResult() {
        logger.logStartMethod();
        T operand =  decorated.getResult();
        logger.logFinishMethodWithResult(operand.toString());
        return operand;
    }

    @Override
    public Operator getOperator() {
        logger.logStartMethod();
        Operator operator = decorated.getOperator();
        logger.logFinishMethodWithResult(operator.toString());
        return operator;
    }

    @Override
    public void setOperator(Operator operator) {
        logger.logStartMethodWithParameter(operator.toString());
        decorated.setOperator(operator);
        logger.logFinishMethod();
    }
}
