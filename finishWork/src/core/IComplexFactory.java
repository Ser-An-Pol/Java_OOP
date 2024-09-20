package core;

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
            System.out.printf("Error in %s creation\n", tClass.getName());
            return (T)new Complex();
        }
    }
}