package com.chess.figures;

import com.chess.Color;
import com.chess.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RookTest {

    @Test
    void isPossibleUpPlus1() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Rook(Color.BLACK);
        Figure figure2 = new Knight(Color.BLACK);
        figures[4][4] = figure;
        figures[5][4] = figure2;
        Position startPos = new Position('d',4);
        Position dest = new Position('d',5);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }

    @Test
    void isPossibleHorizontalMove() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Rook(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest1 = new Position('a',4);
        Position dest2 = new Position('b',4);
        Position dest3 = new Position('c',4);
        Position dest4 = new Position('e',4);
        Position dest5 = new Position('f',4);
        Position dest6 = new Position('g',4);
        Position dest7 = new Position('h',4);
        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertTrue(figure.isPossible(startPos, dest2, figures));
        assertTrue(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));
        assertTrue(figure.isPossible(startPos, dest5, figures));
        assertTrue(figure.isPossible(startPos, dest6, figures));
        assertTrue(figure.isPossible(startPos, dest7, figures));
    }

    @Test
    void isPossibleVerticalMove() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Rook(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest1 = new Position('d',1);
        Position dest2 = new Position('d',2);
        Position dest3 = new Position('d',3);
        Position dest4 = new Position('d',5);
        Position dest5 = new Position('d',6);
        Position dest6 = new Position('d',7);
        Position dest7 = new Position('d',8);
        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertTrue(figure.isPossible(startPos, dest2, figures));
        assertTrue(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));
        assertTrue(figure.isPossible(startPos, dest5, figures));
        assertTrue(figure.isPossible(startPos, dest6, figures));
        assertTrue(figure.isPossible(startPos, dest7, figures));
    }
    @Test
    void isPossibleVerticalMoveWithOtherFigures() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Rook(Color.BLACK);
        Figure figureBad = new Pawn(Color.BLACK);
        figures[4][4] = figure;
        figures[6][4] = figureBad;
        Position startPos = new Position('d',4);
        Position dest1 = new Position('d',1);
        Position dest2 = new Position('d',2);
        Position dest3 = new Position('d',3);
        Position dest4 = new Position('d',5);
        Position dest5 = new Position('d',6);
        Position dest6 = new Position('d',7);
        Position dest7 = new Position('d',8);
        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertTrue(figure.isPossible(startPos, dest2, figures));
        assertTrue(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));
        assertTrue(figure.isPossible(startPos, dest5, figures));
        assertFalse(figure.isPossible(startPos, dest6, figures));
        assertFalse(figure.isPossible(startPos, dest7, figures));
    }
    @Test
    void isImpossibleHorizontalMoveFigureExistBetween() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Rook(Color.BLACK);
        Figure figureBad = new Pawn(Color.BLACK);
        figures[4][4] = figure;
        figures[4][6] = figureBad;
        Position startPos = new Position('d',4);
        Position dest1 = new Position('a',4);
        Position dest2 = new Position('b',4);
        Position dest3 = new Position('c',4);
        Position dest4 = new Position('e',4);
        Position dest5 = new Position('f',4);
        Position dest6 = new Position('g',4);
        Position dest7 = new Position('h',4);
        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertTrue(figure.isPossible(startPos, dest2, figures));
        assertTrue(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));
        assertTrue(figure.isPossible(startPos, dest5, figures));
        assertFalse(figure.isPossible(startPos, dest6, figures));
        assertFalse(figure.isPossible(startPos, dest7, figures));
    }
    @Test
    void isImpossibleMoveFromA1() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Rook(Color.BLACK);
        figures[1][1] = figure;
        Position startPos = new Position('a',1);
        Position dest1 = new Position('b',1);
        Position dest2 = new Position('c',1);
        Position dest3 = new Position('d',1);
        Position dest4 = new Position('e',1);
        Position dest5 = new Position('f',1);
        Position dest6 = new Position('g',1);
        Position dest7 = new Position('h',1);

        Position dest8 = new Position('a',2);
        Position dest9 = new Position('a',3);
        Position dest10 = new Position('a',4);
        Position dest11 = new Position('a',5);
        Position dest12 = new Position('a',6);
        Position dest13 = new Position('a',7);
        Position dest14 = new Position('a',8);
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
        assertTrue(figure.isPossible(startPos, dest14, figures));
    }
    @Test
    void isImpossibleMoveFromA1WithOtherFigures() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Rook(Color.BLACK);
        Figure figureBad = new Pawn(Color.BLACK);
        figures[1][1] = figure;
        figures[1][5] = figureBad;
        figures[5][1] = figureBad;
        Position startPos = new Position('a',1);

        Position dest1 = new Position('b',1);
        Position dest2 = new Position('c',1);
        Position dest3 = new Position('d',1);
        Position dest4 = new Position('e',1);
        Position dest5 = new Position('f',1);
        Position dest6 = new Position('g',1);
        Position dest7 = new Position('h',1);

        Position dest8 = new Position('a',2);
        Position dest9 = new Position('a',3);
        Position dest10 = new Position('a',4);
        Position dest11 = new Position('a',5);
        Position dest12 = new Position('a',6);
        Position dest13 = new Position('a',7);
        Position dest14 = new Position('a',8);
        assertTrue(figure.isPossible(startPos, dest1, figures));
        assertTrue(figure.isPossible(startPos, dest2, figures));
        assertTrue(figure.isPossible(startPos, dest3, figures));
        assertTrue(figure.isPossible(startPos, dest4, figures));

        assertFalse(figure.isPossible(startPos, dest5, figures));
        assertFalse(figure.isPossible(startPos, dest6, figures));
        assertFalse(figure.isPossible(startPos, dest7, figures));

        assertTrue(figure.isPossible(startPos, dest8, figures));
        assertTrue(figure.isPossible(startPos, dest9, figures));
        assertTrue(figure.isPossible(startPos, dest10, figures));
        assertTrue(figure.isPossible(startPos, dest11, figures));

        assertFalse(figure.isPossible(startPos, dest12, figures));
        assertFalse(figure.isPossible(startPos, dest13, figures));
        assertFalse(figure.isPossible(startPos, dest14, figures));
    }

}