package com.chess.figures;

import com.chess.Color;
import com.chess.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnightTest {

    @Test
    void isKnightPossible() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Knight(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest1 = new Position('e',6);
        Position dest2 = new Position('f',5);
        Position dest3 = new Position('e',2);
        Position dest4 = new Position('c',2);
        Position dest5 = new Position('b',3);
        Position dest6 = new Position('b',5);
        Position dest7 = new Position('c',6);
        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertTrue(figure.isPossible(startPos, dest2, figures));
        assertTrue(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));
        assertTrue(figure.isPossible(startPos, dest5, figures));
        assertTrue(figure.isPossible(startPos, dest6, figures));
        assertTrue(figure.isPossible(startPos, dest7, figures));
    }
    @Test
    void isKnightImpossible() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Knight(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',8);
        Position dest1 = new Position('e',7);
        Position dest2 = new Position('f',4);
        Position dest3 = new Position('e',3);
        Position dest4 = new Position('c',1);
        Position dest5 = new Position('b',8);
        Position dest6 = new Position('b',4);
        Position dest7 = new Position('c',7);
        assertFalse(figure.isPossible(startPos, dest1, figures));
        assertFalse(figure.isPossible(startPos, dest2, figures));
        assertFalse(figure.isPossible(startPos, dest3, figures));
        assertFalse(figure.isPossible(startPos, dest4, figures));
        assertFalse(figure.isPossible(startPos, dest5, figures));
        assertFalse(figure.isPossible(startPos, dest6, figures));
        assertFalse(figure.isPossible(startPos, dest7, figures));
    }
}