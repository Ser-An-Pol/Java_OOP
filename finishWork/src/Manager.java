import controller.Controller;
import controller.IController;
import controller.LogController;
import core.Calculator;
import core.Complex;
import core.ICalculator;
import core.LogCalculator;
import core.arithm.DivComplex;
import core.arithm.MultComplex;
import core.arithm.SumComplex;
import view.*;

public class Manager {
    public void run() {
        // Создаем экземпляр логгера
        ILogger logger = new Logger();
        // Инициализация класса, используемого в качестве Комплексного числа
        Class<Complex> tClass = Complex.class;
        // Создаем экземпляр калькулятора
        ICalculator<Complex> d_calculator = new Calculator<>(new DivComplex<>(tClass), new MultComplex<>(tClass),
                                                            new SumComplex<>(tClass), tClass);
        ICalculator<Complex> calculator = new LogCalculator<>(d_calculator, logger);
        //Создаем экземпляр контроллера
        IController<Complex> d_controller = new Controller<>(calculator, tClass);
        IController<Complex> controller = new LogController<>(d_controller, logger);
        //Создаем экземпляр вьюера
        IViewer<Complex> viewer = new Viewer<>(calculator);

        do {
            //Запрос, чтение и инициализация первого операнда
            IRequestMessage.requestComplexNumber();
            while (!controller.inputOperandA()) IErrorMessage.InvalidComplexNumber();
            //Инициализируем флаг, отвечающий с продолжение вычислений с использованием текущего
            // результата операций
            boolean isNext = true;
            while (isNext) {
                //Запрос, чтение и инициализация типа арифметической операции
                IRequestMessage.requestOperator();
                while (!controller.inputOperator()) IErrorMessage.InvalidOperator();
                //Запрос, чтение и инициализация второго операнда
                IRequestMessage.requestComplexNumber();
                while (!controller.inputOperandB()) IErrorMessage.InvalidComplexNumber();

                //Вычисление заданного числового выражения
                controller.calculate();
                //Вывод результирующего значения заданного числового выражения
                viewer.printResult();

                //Запрос и инициация (в случае положительного ответа) на продолжение
                // вычислений с использованием текущего результата операций
                IRequestMessage.requestNext();
                isNext = controller.inputNext();
            }
            //Вывод числового равенства, иллюстрирующего последнии вычисления калькулятора
            viewer.printLastExpression();
            //Запрос на начало вычислений нового числового выражения на калькуляторе
            IRequestMessage.requestNew();
        } while (controller.inputNew());
    }
}
