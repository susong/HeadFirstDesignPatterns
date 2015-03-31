package com.dream.command.undo;

public interface Command {
    void execute();

    void undo();
}
