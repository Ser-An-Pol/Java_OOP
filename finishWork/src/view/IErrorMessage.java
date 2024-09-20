package view;

public interface IErrorMessage {
    /**
     * Метод выводит сообщение об ошибке некорректного ввода комплексного числа
     */
    static void InvalidComplexNumber() {
        String message = "Ввод комплексного числа произведен некорректно! Попробуйте снова...";
        System.out.println(message);
    }

    /**
     * Метод выводит сообщение об ошибке некорректного ввода арифметического оператора
     */
    static void InvalidOperator() {
        String message = "Ввод арифметического оператора произведен некорректно! Попробуйте снова...";
        System.out.println(message);
    }
}
