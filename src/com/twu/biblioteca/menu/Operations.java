package com.twu.biblioteca.menu;

public enum Operations {
    LISTBOOKS(1, "List Books"), QUIT(0, "quit");
    private int code;
    private String operation;
    private Operations(int code, String operation) {
        this.code = code;
        this.operation = operation;
    }
    public String getOperation() {
        return this.operation;
    }
    public int getCode() {
        return this.code;
    }
}
