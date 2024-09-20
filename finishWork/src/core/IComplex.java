package core;

public interface IComplex {
    /**
     * Метод возвращает значение действительной части комплексного числа
     * @return
     */
    double getReal();

    /**
     * Метод устанавливает значение действительной части комплексного числа
     * @param real
     */

    void setReal(double real);
    /**
     * Метод возвращает значение мнимой части комплексного числа
     * @return
     */

    double getImaginary();

    /**
     * Метод устанавливает значение мнимой части комплексного числа
     * @param imaginary
     */
    void setImaginary(double imaginary);

    /**
     * Метод возвращает true, если данное комплексное число равно нулю.
     * В противном случае возвращает false
     * @return
     */
    boolean isZero();

    /**
     * Метод вычисляет квадрат радиуса комплексного числа: real^2 + imaginary^2
     * @return
     */
    double getRadiusSquare();
}
