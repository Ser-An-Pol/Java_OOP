package core.arithm;

import core.IComplex;
import core.IComplexFactory;

public class DivComplex<T extends IComplex> implements IDivComplex<T>{
    private final T result;

    public DivComplex(Class<T> tClass) {
        this.result = IComplexFactory.create(tClass);
    }

    @Override
    public T div(T a, T b) {
        if (b.isZero()) return null;

        double x = a.getReal()*b.getReal() + a.getImaginary()*b.getImaginary();
        double y = a.getImaginary()*b.getReal() - a.getReal()*b.getImaginary();
        double rSq = b.getRadiusSquare();
        result.setReal(x/rSq);
        result.setImaginary(y/rSq);
        return result;
    }
}
