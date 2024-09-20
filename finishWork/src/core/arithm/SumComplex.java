package core.arithm;

import core.IComplex;
import core.IComplexFactory;

public class SumComplex<T extends IComplex> implements ISumComplex<T>{

    private final T result;

    public SumComplex(Class<T> tClass) {
        this.result = IComplexFactory.create(tClass);
    }

    @Override
    public T sum(T a, T b) {
        result.setReal(a.getReal() + b.getReal());
        result.setImaginary(a.getImaginary() + b.getImaginary());
        return result;
    }
}
