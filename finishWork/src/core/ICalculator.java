package core;

public interface ICalculator <T extends IComplex> {
    /**
     * Метод инициирует выполнение текущей операции на калькуляторе
     * Предварительно требуется инициировать два операнда и тип операции
     */
    void calculate();

    /**
     * Метод возвращает комплексное число со значением равным первому операнду
     * @return
     */
    T getOperandA();

    /**
     * Метод инициализирует первый операнд калькулятора значением комплексного числа operandA
     * @param operandA
     */
    void setOperandA(T operandA);
    /**
     * Метод возвращает комплексное число со значением равным второму операнду
     * @return
     */
    T getOperandB();
    /**
     * Метод инициализирует второй операнд калькулятора значением комплексного числа operandB
     * @param operandB
     */
    void setOperandB(T operandB);
    /**
     * Метод возвращает комплексное число со значением равным результату вычислений, произведенных калькулятором
     * @return
     */
    T getResult();

    /**
     * Метод возвращает тип текущей операции калькулятора
     * @return
     */
    Operator getOperator();

    /**
     * Метод устанавливает тип текущей операции калькулятора
     * @param operator - тип операции Operator.[SUM,MULT,SUB,DIV]
     */
    void setOperator(Operator operator);
}
