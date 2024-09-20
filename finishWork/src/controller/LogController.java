package controller;

import core.IComplex;
import view.ILogger;

public class LogController<T extends IComplex> implements IController<T>{
    private final IController<T> decorated;
    private final ILogger logger;

    public LogController(IController<T> decorated, ILogger logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public boolean inputOperandA() {
        logger.logStartMethod();
        boolean res = decorated.inputOperandA();
        logger.logFinishMethodWithResult(Boolean.toString(res));
        return res;
    }

    @Override
    public boolean inputOperandB() {
        logger.logStartMethod();
        boolean res = decorated.inputOperandB();
        logger.logFinishMethodWithResult(Boolean.toString(res));
        return res;
    }

    @Override
    public boolean inputOperator() {
        logger.logStartMethod();
        boolean res = decorated.inputOperator();
        logger.logFinishMethodWithResult(Boolean.toString(res));
        return res;
    }

    @Override
    public void calculate() {
        logger.logStartMethod();
        decorated.calculate();
        logger.logFinishMethod();
    }

    @Override
    public boolean inputNext() {
        logger.logStartMethod();
        boolean res = decorated.inputNext();
        logger.logFinishMethodWithResult(Boolean.toString(res));
        return res;
    }

    @Override
    public boolean inputNew() {
        logger.logStartMethod();
        boolean res = decorated.inputNew();
        logger.logFinishMethodWithResult(Boolean.toString(res));
        return res;
    }
}
