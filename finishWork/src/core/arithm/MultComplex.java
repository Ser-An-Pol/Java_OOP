package core.arithm;

import core.IComplex;
import core.IComplexFactory;

public class MultComplex <T extends IComplex> implements IMultComplex<T>{
    private final T result;

    public MultComplex(Class<T> tClass) {
        this.result = IComplexFactory.create(tClass);
    }

    @Override
    public T mult(T a, T b) {
        result.setReal(a.getReal()*b.getReal() - a.getImaginary()*b.getImaginary());
        result.setImaginary(a.getReal()*b.getImaginary() + a.getImaginary()*b.getReal());
        return result;
    }
}
