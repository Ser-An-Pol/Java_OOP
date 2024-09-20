package view;

import core.IComplex;

public interface IViewer <T extends IComplex> {
    /**
     * Метод выводит результат последних вычислений калькулятора
     */
    void printResult();

    /**
     * Метод выводит числовое равенство, иллюстрирующее последнии вычисления калькулятора
     */
    void printLastExpression();
}
