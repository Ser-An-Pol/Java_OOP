package view;

import core.IComplex;
import core.ICalculator;

public class Viewer<T extends IComplex> implements IViewer<T>{
    ICalculator<T> calculator;

    public Viewer(ICalculator<T> calculator) {
        this.calculator = calculator;
    }

    @Override
    public void printResult() {
        String message = "Текущий результат вычислений:\n";
        System.out.println(message + calculator.getResult());
    }

    @Override
    public void printLastExpression() {
        String message = "Последнее вычисленное выражение:\n";
        String expression = calculator.getOperandA() +
                        switch (calculator.getOperator()) {
                            case DIV -> " / ";
                            case MULT -> " * ";
                            case SUB -> " - ";
                            case SUM -> " + ";
                        } + calculator.getOperandB() + " = " +
                        calculator.getResult();
        System.out.println(message + expression);

    }
}
