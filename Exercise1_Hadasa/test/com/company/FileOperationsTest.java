package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by hackeru on 3/14/2017.
 */
class FileOperationsTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("in beforeAll");
    }

    @BeforeEach
    void setUp() {
        System.out.println("in setUp()");
    }

    @AfterEach
    void tearDown() {
        System.out.println("in AfterEach");

    }

    @Test
    void pathValidTest_NotPath() {
        FileOperations file= new FileOperations();
        if(file.pathValid("jhgfol"))
            Assertions.fail("is not path");

    }

    @Test
    void checkpathTest_NotFile(){
        FileOperations file= new FileOperations();
        if(file.pathValid("C:/User/hackeru.HACKERU3/Documents/GitHub/Exercisess"))
            Assertions.fail("is not file");

    }

    @Test
    void checkpathTest_PathNotExsit(){
        FileOperations file= new FileOperations();
        if(file.pathValid("C:/User/hackeru.HACKERU3/Documents/GitHub/Exercisess/dgsdgs"))
            Assertions.fail("Path does not exist");
    }
    @Test
    void checkpathTest_Path(){
        FileOperations file= new FileOperations();
        if((file.pathValid("C:\\Users\\hackeru.HACKERU3\\Documents\\GitHub\\Exercisess\\Exercises\\z.txt"))==false)
            Assertions.fail("Path does not exist");
    }

    @Test
    void exeption() {

    }

}