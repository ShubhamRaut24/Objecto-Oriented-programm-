package SOLID.Dependancy_inversion_principle;

interface ILogger{
    public void logInformation(String logInfo);
}

public class Logger implements ILogger {
    public void logInformation(String logInfo){
        System.out.println(logInfo);
    }
}
class LoggingTOFile{
    ILogger logger;

    public LoggingTOFile(ILogger logger)
    {
       this.logger=logger;
    }
    public void logging()
    {
       logger.logInformation("logs the file.....");
    }
}
class DIP{
    public static void main(String[] args) {
        LoggingTOFile logging=new LoggingTOFile(new Logger());
        logging.logging();
    }
}