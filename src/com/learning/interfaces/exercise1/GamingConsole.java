package com.learning.interfaces.exercise1;

public interface GamingConsole {

    default void execute(){
        up();
        down();
        left();
        right();
    }
    void up();
    void down();
    void left();
    void right();
}
