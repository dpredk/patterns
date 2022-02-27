package com.pda.patterns.command;

// this class acts as a Client in scope of the Command pattern
public class CommandApplication {

    public static void main(String[] args) {
        String filename = "command.txt";
        Document receiver = new Document(filename);

        OpenCommand openCommand = new OpenCommand(receiver);
        PrintCommand printCommand = new PrintCommand(receiver);
        SaveCommand saveCommand = new SaveCommand(receiver);

        FileCommandExecutor commandExecutor = new FileCommandExecutor();

        commandExecutor.executeFileOperation(openCommand);
        commandExecutor.executeFileOperation(printCommand);
        commandExecutor.executeFileOperation(saveCommand);
    }
}
