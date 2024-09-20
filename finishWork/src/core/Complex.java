package core;

public class Complex implements IComplex {
    private double real;
    private double imaginary;

    public Complex() {
        this.real = this.imaginary = 0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {

        return (isZero()) ? "0" :
                ((real != 0) ? Double.toString(real) : "") +
                ((imaginary > 0 && real != 0) ? "+" : "") +
                ((imaginary != 0) ? imaginary + "i" : "");
    }

    public boolean isZero() {
        return (real == 0 && imaginary == 0);
    }

    public double getRadiusSquare() {
        return real*real + imaginary*imaginary;
    }

}
