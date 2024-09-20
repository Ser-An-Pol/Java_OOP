package core.arithm;

import core.IComplex;

public interface IMultComplex <T extends IComplex> {
    /**
     * Операция умножения двух комплексных чисел
     * @param a - первый операнд операции (множитель)
     * @param b - второй операнд операции (множитель)
     * @return - результат операции
     */
    T mult(T a, T b);
}
