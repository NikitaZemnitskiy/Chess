package com.chess.figures;

import com.chess.Color;
import com.chess.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    @Test
    void isPossibleVerticalPlus1() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Pawn(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('d',5);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isImpossibleVerticalPlus1FigureExist() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Pawn(Color.BLACK);
        Figure figure2 = new Knight(Color.BLACK);
        figures[4][4] = figure;
        figures[5][4] = figure2;
        Position startPos = new Position('d',4);
        Position dest = new Position('d',5);
        assertFalse(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isImpossibleVerticalPlus2FigureExist() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Pawn(Color.BLACK);
        Figure figure2 = new Knight(Color.BLACK);
        figures[4][4] = figure;
        figures[6][4] = figure2;
        Position startPos = new Position('d',4);
        Position dest = new Position('d',6);
        assertFalse(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isImpossibleVerticalPlus2FigureExistBetweenThem() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new Pawn(Color.BLACK);
        Figure figure2 = new Knight(Color.BLACK);
        figures[4][4] = figure;
        figures[5][4] = figure2;
        Position startPos = new Position('d',4);
        Position dest = new Position('d',6);
        assertFalse(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isPossibleVerticalPlus2TurnFirst() {
        Figure[][] figures = new Figure[8][8];
        Pawn figure = new Pawn(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('d',6);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isImpossibleVerticalPlus2TurnNotFirs() {
        Figure[][] figures = new Figure[8][8];
        Pawn figure = new Pawn(Color.BLACK);
        figures[4][4] = figure;
        figure.isTurnFirst = false;
        Position startPos = new Position('d',4);
        Position dest = new Position('d',6);
        assertFalse(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isImpossibleDiagonalFigureNotExist() {
        Figure[][] figures = new Figure[8][8];
        Pawn figure = new Pawn(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest = new Position('c',5);
        assertFalse(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isPossibleDiagonalFigureExistLeftDiagonal() {
        Figure[][] figures = new Figure[8][8];
        Pawn figure = new Pawn(Color.BLACK);
        Figure figure2 = new Knight(Color.BLACK);
        figures[4][4] = figure;
        figures[5][3] = figure2;
        Position startPos = new Position('d',4);
        Position dest = new Position('c',5);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isPossibleDiagonalFigureExistRightDiagonal() {
        Figure[][] figures = new Figure[8][8];
        Pawn figure = new Pawn(Color.BLACK);
        Figure figure2 = new Knight(Color.BLACK);
        figures[4][4] = figure;
        figures[5][5] = figure2;
        Position startPos = new Position('d',4);
        Position dest = new Position('e',5);
        assertTrue(figure.isPossible(startPos, dest, figures));
    }
    @Test
    void isImpossible() {
        Figure[][] figures = new Figure[8][8];
        Pawn figure = new Pawn(Color.BLACK);
        figures[4][4] = figure;
        Position startPos = new Position('d',4);
        Position dest1 = new Position('c',6);
        Position dest2 = new Position('e',7);
        Position dest3 = new Position('a',3);
        Position dest4 = new Position('b',5);
        Position dest5 = new Position('d',3);
        assertFalse(figure.isPossible(startPos, dest1, figures));
        assertFalse(figure.isPossible(startPos, dest2, figures));
        assertFalse(figure.isPossible(startPos, dest3, figures));
        assertFalse(figure.isPossible(startPos, dest4, figures));
        assertFalse(figure.isPossible(startPos, dest5, figures));
    }
}