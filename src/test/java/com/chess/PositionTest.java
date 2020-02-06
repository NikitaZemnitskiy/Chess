package com.chess;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void RightPosition1(){

        Position position = new Position('c', 8);
        Assert.assertNotNull(position);
    }

   @Test
    void WrongPosition1(){

        Throwable thrown = assertThrows(IllegalStateException.class, () -> {
           new Position('3', 1);
        });
        assertNotNull(thrown.getMessage());
    }
    @Test
    void WrongPosition2(){

        Throwable thrown = assertThrows(IllegalStateException.class, () -> {
            new Position('a', 0);
        });
        assertNotNull(thrown.getMessage());
    }
@Test
    void WrongPosition3(){

        Throwable thrown = assertThrows(IllegalStateException.class, () -> {
           new Position('a', 9);
        });

        assertNotNull(thrown.getMessage());
    }

    @Test
    void WrongPosition4(){

        Throwable thrown = assertThrows(IllegalStateException.class, () -> {
            new Position('e', 9);
        });
        assertNotNull(thrown.getMessage());
    }

    @Test
    void WrongPosition5(){

        Throwable thrown = assertThrows(IllegalStateException.class, () -> {
            Position position = new Position('d', -5);
        });
        assertNotNull(thrown.getMessage());
    }
    @Test
    void RightSetter1(){
        Position position = new Position('a', 1);
        position.setHorizontal('a');

    }
    @Test
    void RightSetter2(){
        Position position = new Position('a', 1);
        position.setVertical(8);

    }
    @Test
    void WrongSetter1(){
        Position position = new Position('a', 1);
        Throwable thrown = assertThrows(IllegalStateException.class, () -> {
            position.setHorizontal('2');
        });
        assertNotNull(thrown.getMessage());
    }

    @Test
    void WrongSetter2(){
        Position position = new Position('a', 1);
        Throwable thrown = assertThrows(IllegalStateException.class, () -> {
            position.setVertical('a');
        });
        assertNotNull(thrown.getMessage());
    }



}