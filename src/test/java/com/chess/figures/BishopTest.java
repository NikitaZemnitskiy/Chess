package com.chess.figures;

import com.chess.Color;
import com.chess.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BishopTest {

    @Test
    void isPossible() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Bishop(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('e',5);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }

    @Test
    void isPossibleMoveFromA1() {
        Figure[][] figures = new Figure[9][9];
        Figure figure = new Bishop(Color.BLACK);
        figures[1][1] = figure;
        Position startPos = new Position('a',1);
        Position dest1 = new Position('b',2);
        Position dest2 = new Position('c',3);
        Position dest3 = new Position('d',4);
        Position dest4 = new Position('e',5);
        Position dest5 = new Position('f',6);
        Position dest6 = new Position('g',7);
        Position dest7 = new Position('h',8);
        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertTrue(figure.isPossible(startPos, dest2, figures));
        assertTrue(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));
        assertTrue(figure.isPossible(startPos, dest5, figures));
        assertTrue(figure.isPossible(startPos, dest6, figures));
        assertTrue(figure.isPossible(startPos, dest7, figures));
    }

    @Test
    void isPossibleMoveFromH8() {
        Figure[][] figures = new Figure[9][9];
        Figure figure = new Bishop(Color.BLACK);
        figures[8][8] = figure;
        Position startPos = new Position('h',8);
        Position dest1 = new Position('b',2);
        Position dest2 = new Position('c',3);
        Position dest3 = new Position('d',4);
        Position dest4 = new Position('e',5);
        Position dest5 = new Position('f',6);
        Position dest6 = new Position('g',7);
        Position dest7 = new Position('a',1);
        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertTrue(figure.isPossible(startPos, dest2, figures));
        assertTrue(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));
        assertTrue(figure.isPossible(startPos, dest5, figures));
        assertTrue(figure.isPossible(startPos, dest6, figures));
        assertTrue(figure.isPossible(startPos, dest7, figures));
    }

    @Test
    void isPossibleMoveFromD4() {
        Figure[][] figures = new Figure[9][9];
        Figure figure = new Bishop(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest1 = new Position('c',3);
        Position dest2 = new Position('b',2);
        Position dest3 = new Position('a',1);
        Position dest4 = new Position('c',5);
        Position dest5 = new Position('b',6);
        Position dest6 = new Position('a',7);
        Position dest7 = new Position('e',3);
        Position dest8 = new Position('f',2);
        Position dest9 = new Position('g',1);
        Position dest10 = new Position('e',5);
        Position dest11 = new Position('f',6);
        Position dest12 = new Position('g',7);
        Position dest13 = new Position('h',8);
        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertTrue(figure.isPossible(startPos, dest2, figures));
        assertTrue(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));
        assertTrue(figure.isPossible(startPos, dest5, figures));
        assertTrue(figure.isPossible(startPos, dest6, figures));
        assertTrue(figure.isPossible(startPos, dest7, figures));
        assertTrue(figure.isPossible(startPos, dest8, figures));
        assertTrue(figure.isPossible(startPos, dest9, figures));
        assertTrue(figure.isPossible(startPos, dest10, figures));
        assertTrue(figure.isPossible(startPos, dest11, figures));
        assertTrue(figure.isPossible(startPos, dest12, figures));
        assertTrue(figure.isPossible(startPos, dest13, figures));
    }

    @Test
    void isPossibleMoveFromD4WithOtherFigures() {
        Figure[][] figures = new Figure[9][9];
        Figure figure = new Bishop(Color.BLACK);
        Figure figure1 = new Knight(Color.WHITE);
        Figure figure2 = new Knight(Color.WHITE);
        Figure figure3 = new Knight(Color.WHITE);
        Figure figure4 = new Knight(Color.WHITE);
        figures[4][4] = figure;
        figures[6][6] = figure1;
        figures[2][6] = figure2;
        figures[2][2] = figure3;
        figures[6][2] = figure4;
        Position startPos = new Position('d',4);
        Position dest1 = new Position('c',3);
        Position dest2 = new Position('b',2);
        Position dest3 = new Position('a',1);
        Position dest4 = new Position('c',5);
        Position dest5 = new Position('b',6);
        Position dest6 = new Position('a',7);
        Position dest7 = new Position('e',3);
        Position dest8 = new Position('f',2);
        Position dest9 = new Position('g',1);
        Position dest10 = new Position('e',5);
        Position dest11 = new Position('f',6);
        Position dest12 = new Position('g',7);
        Position dest13 = new Position('h',8);
        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertTrue(figure.isPossible(startPos, dest2, figures));
        assertFalse(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));
        assertTrue(figure.isPossible(startPos, dest5, figures));
        assertFalse(figure.isPossible(startPos, dest6, figures));
        assertTrue(figure.isPossible(startPos, dest7, figures));
        assertTrue(figure.isPossible(startPos, dest8, figures));
        assertFalse(figure.isPossible(startPos, dest9, figures));
        assertTrue(figure.isPossible(startPos, dest10, figures));
        assertTrue(figure.isPossible(startPos, dest11, figures));
        assertFalse(figure.isPossible(startPos, dest12, figures));
        assertFalse(figure.isPossible(startPos, dest13, figures));
    }
}