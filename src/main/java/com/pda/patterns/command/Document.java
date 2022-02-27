package com.pda.patterns.command;

//The receiver, knows how to perform the operations associated with carrying out a request.
// Any class may serve as a Receiver.
public class Document {
    private final String filename;

    public Document(String filename) {
        this.filename = filename;
    }

    public void open() {
        System.out.println("File " + filename + " is opened");
    }

    public void print() {
        System.out.println("File " + filename + " is printed");
    }

    public void save() {
        System.out.println("File " + filename + " is saved");
    }

}
