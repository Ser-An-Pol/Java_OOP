package core.arithm;

import core.IComplex;

public interface IDivComplex<T extends IComplex> {
    /**
     * Операция деления двух комплексных чисел
     * @param a - первый операнд операции (делимое)
     * @param b - второй операнд операции (делитель)
     * @return - результат операции
     */
    T div(T a, T b);
}
