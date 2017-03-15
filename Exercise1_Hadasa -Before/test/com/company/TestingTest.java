package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by hackeru on 3/14/2017.
 */
class TestingTest {
    private int counter=0;
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
        System.out.println("in tearDown()");

    }

    @Test
    void getNameTest() {
        counter++;
        System.out.println("in getNameTest()" + counter);

    }

    @Test
    void setNameTest() {
        counter++;
        System.out.println("in setNameTest()" + counter);

    }

    @Test
    void barkTest() {
        counter++;
        System.out.println("in barkTest()" + counter);

    }

}