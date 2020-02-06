package com.chess.figures;

import com.chess.Color;
import com.chess.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

    @Test
    void isPossibleMoveFromD4() {
        Figure[][] figures = new Figure[9][9];
        Figure figure = new Queen(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);

        Position dest1 = new Position('a',1);
        Position dest2 = new Position('a',2);
        Position dest3 = new Position('a',3);
        Position dest4 = new Position('a',4);
        Position dest5 = new Position('a',5);
        Position dest6 = new Position('a',6);
        Position dest7 = new Position('a',7);
        Position dest8 = new Position('a',8);

        Position dest9 = new Position('b',1);
        Position dest10 = new Position('b',2);
        Position dest11 = new Position('b',3);
        Position dest12 = new Position('b',4);
        Position dest13 = new Position('b',5);
        Position dest14 = new Position('b',6);
        Position dest15 = new Position('b',7);
        Position dest16 = new Position('b',8);

        Position dest17 = new Position('c',1);
        Position dest18 = new Position('c',2);
        Position dest19 = new Position('c',3);
        Position dest20 = new Position('c',4);
        Position dest21 = new Position('c',5);
        Position dest22 = new Position('c',6);
        Position dest23 = new Position('c',7);
        Position dest24 = new Position('c',8);

        Position dest25 = new Position('d',1);
        Position dest26 = new Position('d',2);
        Position dest27 = new Position('d',3);
        Position dest28 = new Position('d',4);
        Position dest29 = new Position('d',5);
        Position dest30 = new Position('d',6);
        Position dest31 = new Position('d',7);
        Position dest32 = new Position('d',8);

        Position dest33 = new Position('e',1);
        Position dest34 = new Position('e',2);
        Position dest35 = new Position('e',3);
        Position dest36 = new Position('e',4);
        Position dest37 = new Position('e',5);
        Position dest38 = new Position('e',6);
        Position dest39 = new Position('e',7);
        Position dest40 = new Position('e',8);

        Position dest41 = new Position('f',1);
        Position dest42 = new Position('f',2);
        Position dest43 = new Position('f',3);
        Position dest44 = new Position('f',4);
        Position dest45 = new Position('f',5);
        Position dest46 = new Position('f',6);
        Position dest47 = new Position('f',7);
        Position dest48 = new Position('f',8);

        Position dest49 = new Position('g',1);
        Position dest50 = new Position('g',2);
        Position dest51 = new Position('g',3);
        Position dest52 = new Position('g',4);
        Position dest53 = new Position('g',5);
        Position dest54 = new Position('g',6);
        Position dest55 = new Position('g',7);
        Position dest56 = new Position('g',8);

        Position dest57 = new Position('h',1);
        Position dest58 = new Position('h',2);
        Position dest59 = new Position('h',3);
        Position dest60 = new Position('h',4);
        Position dest61 = new Position('h',5);
        Position dest62 = new Position('h',6);
        Position dest63 = new Position('h',7);
        Position dest64 = new Position('h',8);

        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertFalse(figure.isPossible(startPos, dest2, figures));
        assertFalse(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));
        assertFalse(figure.isPossible(startPos, dest5, figures));
        assertFalse(figure.isPossible(startPos, dest6, figures));
        assertTrue(figure.isPossible(startPos, dest7, figures));
        assertFalse(figure.isPossible(startPos, dest8, figures));
        assertFalse(figure.isPossible(startPos, dest9, figures));
        assertTrue(figure.isPossible(startPos, dest10, figures));
        assertFalse(figure.isPossible(startPos, dest11, figures));
        assertTrue(figure.isPossible(startPos, dest12, figures));
        assertFalse(figure.isPossible(startPos, dest13, figures));
        assertTrue(figure.isPossible(startPos, dest14, figures));
        assertFalse(figure.isPossible(startPos, dest15, figures));
        assertFalse(figure.isPossible(startPos, dest16, figures));
        assertFalse(figure.isPossible(startPos, dest17, figures));
        assertFalse(figure.isPossible(startPos, dest18, figures));
        assertTrue(figure.isPossible(startPos, dest19, figures));
        assertTrue(figure.isPossible(startPos, dest20, figures));
        assertTrue(figure.isPossible(startPos, dest21, figures));
        assertFalse(figure.isPossible(startPos, dest22, figures));
        assertFalse(figure.isPossible(startPos, dest23, figures));
        assertFalse(figure.isPossible(startPos, dest24, figures));
        assertTrue(figure.isPossible(startPos, dest25, figures));
        assertTrue(figure.isPossible(startPos, dest26, figures));
        assertTrue(figure.isPossible(startPos, dest27, figures));
      //  assertTrue(figure.isPossible(startPos, dest28, figures));
        assertTrue(figure.isPossible(startPos, dest29, figures));
        assertTrue(figure.isPossible(startPos, dest30, figures));
        assertTrue(figure.isPossible(startPos, dest31, figures));
        assertTrue(figure.isPossible(startPos, dest32, figures));
        assertFalse(figure.isPossible(startPos, dest33, figures));
        assertFalse(figure.isPossible(startPos, dest34, figures));
        assertTrue(figure.isPossible(startPos, dest35, figures));
        assertTrue(figure.isPossible(startPos, dest36, figures));
        assertTrue(figure.isPossible(startPos, dest37, figures));
        assertFalse(figure.isPossible(startPos, dest38, figures));
        assertFalse(figure.isPossible(startPos, dest39, figures));
        assertFalse(figure.isPossible(startPos, dest40, figures));
        assertFalse(figure.isPossible(startPos, dest41, figures));
        assertTrue(figure.isPossible(startPos, dest42, figures));
        assertFalse(figure.isPossible(startPos, dest43, figures));
        assertTrue(figure.isPossible(startPos, dest44, figures));
        assertFalse(figure.isPossible(startPos, dest45, figures));
        assertTrue(figure.isPossible(startPos, dest46, figures));
        assertFalse(figure.isPossible(startPos, dest47, figures));
        assertFalse(figure.isPossible(startPos, dest48, figures));
        assertTrue(figure.isPossible(startPos, dest49, figures));
        assertFalse(figure.isPossible(startPos, dest50, figures));
        assertFalse(figure.isPossible(startPos, dest51, figures));
        assertTrue(figure.isPossible(startPos, dest52, figures));
        assertFalse(figure.isPossible(startPos, dest53, figures));
        assertFalse(figure.isPossible(startPos, dest54, figures));
        assertTrue(figure.isPossible(startPos, dest55, figures));
        assertFalse(figure.isPossible(startPos, dest56, figures));
        assertFalse(figure.isPossible(startPos, dest57, figures));
        assertFalse(figure.isPossible(startPos, dest58, figures));
        assertFalse(figure.isPossible(startPos, dest59, figures));
        assertTrue(figure.isPossible(startPos, dest60, figures));
        assertFalse(figure.isPossible(startPos, dest61, figures));
        assertFalse(figure.isPossible(startPos, dest62, figures));
        assertFalse(figure.isPossible(startPos, dest63, figures));
        assertTrue(figure.isPossible(startPos, dest64, figures));

    }
}