package view;

public interface ILogger {
    void logStartMethod();
    void logStartMethodWithParameter(String message);
    void logFinishMethod();
    void logFinishMethodWithResult(String message);
}
