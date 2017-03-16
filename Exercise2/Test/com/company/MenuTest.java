package com.company;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


/**
 * Created by hackeru on 3/16/2017.
 */
class MenuTest {
    int outputCount = 0;
    @BeforeEach
    void setUp() {
        System.out.println("Begin test Menu");

    }

    @AfterEach
    void tearDown() {
        System.out.println("After test Menu");

    }

    @Test
    void printMenu() {

    }

    @Test
    void chooseOption() {
        Menu myMenu = new Menu();
        String testChoice = " ";
        Assertions.assertEquals(myMenu.myChoice(testChoice), "invalid option. try again.", "assertion failed for space");
        testChoice = "\n";
        Assertions.assertEquals(myMenu.myChoice(testChoice), "invalid option. try again.", "assertion failed for Enter");
        testChoice = "a";
        Assertions.assertEquals(myMenu.myChoice(testChoice), "invalid option. try again.", "assertion failed for letter");
        testChoice = "6";
        Assertions.assertEquals(myMenu.myChoice(testChoice), "invalid option. try again.", "assertion failed for number except 1,2");
        testChoice = "";
        Assertions.assertEquals(myMenu.myChoice(testChoice), "Something went wrong. Please try again", "assertion failed for space");


    }
    /*
    @Test
    void chooseOption2Test(){

        Input input = mock(Input.class);//יצרנו MOK פקטיבי ל INPUT
        Output output = mock(Output.class);//יצרנו MOK פקטיבי ל OUTPUT
        when(input.input()).thenReturn("1").thenReturn("C:\\Users\\hackeru.HACKERU3\\Documents\\GitHub\\Hadasa_Exercise\\Document.txt").thenReturn("0");
        Menu myMenu = new Menu(output,input);
        myMenu.chooseOption();
        verify(output,timeout(1)).output("Enter a file path:");

        //Assertions.assertEquals(myMenu.myChoice("1"),,"gfi");
    }*/

    @Test
    void chooseOptionTest2() {

        Input input = mock(Input.class);//יצרנו MOK פקטיבי ל INPUT
        when(input.input()).thenReturn("1").thenReturn("C:\\Users\\hackeru.HACKERU3\\Documents\\GitHub\\Hadasa_Exercise\\Document.txt").thenReturn("0");
        Output output = new Output() {
            @Override
            public void output(String s) {
                switch (outputCount) {
                    case 0:
                        assertEquals("please choose:\n 1. If you want to encrypt the file Press 1\n 2. If you want to decrypt the file Press 2\n 0. exit\n your choice:   ", s);
                        break;
                    case 1:
                        assertEquals("Enter a file path:", s);
                        break;
                    case 2:
                        assertEquals("Encrypt", s);
                        break;
                }
                outputCount++;
            }
        };

        Menu myMenu = new Menu(output, input);
        myMenu.printMenu();

    }

    @Test
    void myChoice() {

    }

    @Test
    void getPathFromUser() {

    }

}