package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu myMenu = new Menu(new ScreenOutput(),new ScreenInput());
        myMenu.printMenu();
    }
}
