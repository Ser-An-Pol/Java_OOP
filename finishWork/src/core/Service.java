package core;

public class Service {
    /**
     * Метод преобразует строку из двух действительных чисел, разделенных пробелом,
     * в массив из двух элементов типа double
     * @param line
     * @return
     */
    public static double[] stringToTwoDouble(String line) {
        double[] comp = new double[2];
        String[] lines = line.split(" ");
        comp[0] = Double.parseDouble(lines[0]);
        comp[1] = Double.parseDouble(lines[1]);
        return comp;
    }

    /**
     * Метод преобразует строку, содержащую вначале один из четырех значков арифметических операций
     * в значение типа операции: Operator.[SUM,MULT,SUB,DIV]
     * @param line
     * @return
     */
    public static Operator stringToOperator(String line) {
        char op = line.charAt(0);
        return switch (op) {
            case '+' -> Operator.SUM;
            case '-' -> Operator.SUB;
            case '*' -> Operator.MULT;
            case '/' -> Operator.DIV;
            default -> throw new RuntimeException();
        };
    }

    /**
     * Метод возвращает true, если в начале переданной строки стоит символ 'y' или 'Y'.
     * В противном случает метод возвращает false
     * @param line
     * @return
     */
    public static boolean stringToBoolean(String line) {
        char op = line.charAt(0);
        return switch (op) {
            case 'y', 'Y' -> true;
            default -> false;
        };
    }
}
