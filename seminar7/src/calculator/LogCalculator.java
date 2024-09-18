package calculator;

public class LogCalculator implements Calculable{
    private Calculable decorated;
    private Loggable logger;

    public LogCalculator(Calculable decorated, Loggable logger) {
        this.decorated = decorated;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        int firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора:" + firstArg +
                    "\nВызываем метод sum с параметром:" + arg + "...");
        Calculable result = decorated.sum(arg);
        logger.log("Вызов метода sum произведен успешно!");
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        int firstArg = decorated.getResult();
        logger.log("Первое значение калькулятора:" + firstArg +
                "\nВызываем метод multi с параметром:" + arg + "...");
        Calculable result = decorated.multi(arg);
        logger.log("Вызов метода multi произведен успешно!");
        return result;
    }

    @Override
    public int getResult() {
        logger.log("Вызываем метод getResult...");
        int result = decorated.getResult();
        logger.log("Вызов метода getResult произведен успешно. Получен результат:" + result);
        return result;
    }
}
