package view;

public class Logger implements ILogger{
    private String getCurrentMethod() {
        StackTraceElement element = new Exception().getStackTrace()[2];
        return element.getClassName() + "." + element.getMethodName();
    }
    @Override
    public void logStartMethod() {
        System.out.println("*****************************LOG*****************************");
        System.out.printf("LOG: Приступаю к запуску метода '%s'\n", getCurrentMethod());
        System.out.println("*************************************************************");
    }

    @Override
    public void logStartMethodWithParameter(String message) {
        System.out.println("*****************************LOG*****************************");
        System.out.printf("LOG: Приступаю к запуску метода '%s' с параметром: '%s'\n", getCurrentMethod(), message);
        System.out.println("*************************************************************");
    }

    @Override
    public void logFinishMethod() {
        System.out.println("*****************************LOG*****************************");
        System.out.printf("LOG: Метод '%s' завершил свою работу\n", getCurrentMethod());
        System.out.println("*************************************************************");
    }

    @Override
    public void logFinishMethodWithResult(String message) {
        System.out.println("*****************************LOG*****************************");
        System.out.printf("LOG: Метод '%s' завершил свою работу, вернув значение: '%s'\n", getCurrentMethod(), message);
        System.out.println("*************************************************************");
    }
}
