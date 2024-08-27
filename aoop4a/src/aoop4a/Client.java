package aoop4a;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set up the chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create logger
        Logger logger = new Logger();

        // Create commands
        logger.addCommand(new LogCommand(infoHandler));
        logger.addCommand(new LogCommand(debugHandler));
        logger.addCommand(new LogCommand(errorHandler));

        // Process commands
        logger.processCommands();
    }
}
