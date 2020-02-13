package com.chess;

import com.chess.figures.Figure;
import com.chess.figures.King;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

   /* @Test
    void makeTurnBoardIsEmpty() {
        Figure[][] figures = new Figure[8][8];
        Board board = new Board(figures);
        assertFalse(board.isTurnPossible(new Position('a',1),
                new Position('a',2)));

    }


    @Test
    void makeTurnFirstPositionDoesNotHaveFigure() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[2][1] = figure;
        Board board = new Board(figures);
        board.setFigures(figures);
        assertFalse(board.isTurnPossible(new Position('a',1),
                new Position('a',2)));
    }
@Test
    void makeTurnFirstPositionAndSecondPositionAreTheSame() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[0][1] = figure;
        figures[1][1] = figure;
        figures[2][1] = figure;
        figures[3][1] = figure;
        Board board = new Board(figures);
        assertFalse(board.isTurnPossible(new Position('a',2),
                new Position('a',2)));
    }
@Test
    void makeTurnFirstPositionAndSecondPositionAreFromSameTeam() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[0][1] = figure;
        figures[1][1] = figure;
        figures[2][1] = figure;
        figures[3][1] = figure;
        Board board = new Board(figures);
        assertFalse(board.isTurnPossible(new Position('a',2),
                new Position('a',3)));
    }
    @Test
    void ImpossibleTurn() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[1][2] = figure;
        Board board = new Board(figures);
        assertFalse(board.isTurnPossible(new Position('b',1),
                new Position('a',3)));
    }

    @Test
    void PossibleTurn() {
        Figure[][] figures = new Figure[8][8];
        Figure figure = new King(Color.BLACK);
        figures[1][2] = figure;
        Board board = new Board(figures);
        assertTrue(board.isTurnPossible(new Position('b',1),
                new Position('b',2)));
    }*/
}