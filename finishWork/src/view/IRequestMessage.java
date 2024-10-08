package view;

public interface IRequestMessage {
    /**
     * Метод выводит сообщение с предложением ввести комплексное число
     */
    static void requestComplexNumber() {
        String message = """
                Введите комплексное число в формате "X Y"(X<пробел>Y), где\s
                X-действительная часть комплексного числа
                Y-мнимая часть комплексного числа""";
        System.out.println(message);
    }

    /**
     * Метод выводит сообщение с предложением ввести арифметический оператор
     */
    static void requestOperator() {
        String message = "Введите оператор - один из символов: +, -, *, /";
        System.out.println(message);
    }

    /**
     * Метод выводит вопрос о продолжении вычислений с использованием текущего результата операций
     */
    static void requestNext() {
        String message = """
                Вы хотите выполнить следующую операцию, используя текущий результат вычислений?
                Да - введите 'y' или 'Y'
                Нет - любой другой символ""";
        System.out.println(message);
    }

    /**
     * Метод выводит вопрос о продолжении использования калькулятора для новых вычислений
     */
    static void requestNew() {
        String message = """
                Вы хотите вычислить значение другого выражения?
                Да - введите 'y' или 'Y'
                Нет - любой другой символ""";
        System.out.println(message);
    }
}
