package creational.singleton;

//Double check logging
public class LoggerDoubleCheckLock {
    private static volatile LoggerDoubleCheckLock loggerDoubleCheckLock;
    public void log(String s){
        System.out.println("INFO:"+ s);
    }
    private LoggerDoubleCheckLock(){
    }
    public static LoggerDoubleCheckLock getInstance(){
        if(loggerDoubleCheckLock == null){
            synchronized(LoggerDoubleCheckLock.class){
                if(loggerDoubleCheckLock == null){
                    loggerDoubleCheckLock = new LoggerDoubleCheckLock();
                }
            }
        }
        return loggerDoubleCheckLock;
    }
}
