package core.arithm;

import core.IComplex;

public interface ISumComplex <T extends IComplex> {
    /**
     * Операция суммы двух комплексных чисел
     * @param a - первый операнд операции (слагаемое)
     * @param b - второй операнд операции (слагаемое)
     * @return - результат операции
     */
    T sum(T a, T b);
}
