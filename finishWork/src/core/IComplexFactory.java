package core;

import static view.IErrorMessage.InvalidClassInstanceCreation;

public interface IComplexFactory<T extends IComplex> {

    /**
     * Метод создает экземпляр класса T, реализующий интерфейс IComplex
     * При возникновении ошибки будет создан экземпляр базового класса Complex
     * @param tClass
     * @return
     * @param <T>
     */
    static <T extends IComplex> T create(Class<T> tClass) {
        try {
            return tClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            InvalidClassInstanceCreation(tClass.getName());
            return (T)new Complex();
        }
    }
}