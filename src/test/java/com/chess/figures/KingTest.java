package com.chess.figures;

import com.chess.Board;
import com.chess.Color;
import com.chess.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KingTest {

    @Test
    void isPossibleHorPlus1() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('e',4);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isPossibleHorMinus1() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('c',4);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isPossibleVertPlus1() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('d',5);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }

    @Test
    void isPossibleVertMinus1() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('d',3);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isPossibleDiagonal55() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('e',5);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isPossibleDiagonal35() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('c',5);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }

    @Test
    void isPossibleDiagonal33() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('c',3);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isPossibleDiagonal53() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('e',3);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isImpossible() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('d',6);
        Position dest1 = new Position('d',2);
        Position dest2 = new Position('a',8);
        Position dest3 = new Position('c',6);
        Position dest4 = new Position('e',1);
        Position dest5 = new Position('h',8);
        assertFalse(figure.isPossible(startPos, dest, figures));
        assertFalse(figure.isPossible(startPos, dest2, figures));
        assertFalse(figure.isPossible(startPos, dest3, figures));
        assertFalse(figure.isPossible(startPos, dest4, figures));
        assertFalse(figure.isPossible(startPos, dest5, figures));
    }
}