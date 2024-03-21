package com.solugenix.solid.di;

public class MackBook1 {
    private final WiredMouse wiredMouse;
    private final WiredKeyBoard wiredKeyBoard;
    public MackBook1(){
        wiredMouse = new WiredMouse();
        wiredKeyBoard = new WiredKeyBoard();
    }
}
