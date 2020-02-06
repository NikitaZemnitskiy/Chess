package com.chess;

import com.chess.figures.*;

public class Application {
    private static final Figure[][] STANDART_ARRANGEMENT = new Figure[9][9];
    public static void main(String[] args) {
        STANDART_ARRANGEMENT[1][1] = new Rook(Color.WHITE);
        STANDART_ARRANGEMENT[1][2] = new Knight(Color.WHITE);
        STANDART_ARRANGEMENT[1][3] = new Bishop(Color.WHITE);
        STANDART_ARRANGEMENT[1][4] = new Queen(Color.WHITE);
        STANDART_ARRANGEMENT[1][5] = new King(Color.WHITE);
        STANDART_ARRANGEMENT[1][6] = new Bishop(Color.WHITE);
        STANDART_ARRANGEMENT[1][7] = new Knight(Color.WHITE);
        STANDART_ARRANGEMENT[1][8] = new Rook(Color.WHITE);

        STANDART_ARRANGEMENT[2][1] = new Pawn(Color.WHITE);
        STANDART_ARRANGEMENT[2][2] = new Pawn(Color.WHITE);
        STANDART_ARRANGEMENT[2][3] = new Pawn(Color.WHITE);
        STANDART_ARRANGEMENT[2][4] = new Pawn(Color.WHITE);
        STANDART_ARRANGEMENT[2][5] = new Pawn(Color.WHITE);
        STANDART_ARRANGEMENT[2][6] = new Pawn(Color.WHITE);
        STANDART_ARRANGEMENT[2][7] = new Pawn(Color.WHITE);
        STANDART_ARRANGEMENT[2][8] = new Pawn(Color.WHITE);

        STANDART_ARRANGEMENT[8][1] = new Rook(Color.BLACK);
        STANDART_ARRANGEMENT[8][2] = new Knight(Color.BLACK);
        STANDART_ARRANGEMENT[8][3] = new Bishop(Color.BLACK);
        STANDART_ARRANGEMENT[8][4] = new King(Color.BLACK);
        STANDART_ARRANGEMENT[8][5] = new Queen(Color.BLACK);
        STANDART_ARRANGEMENT[8][6] = new Bishop(Color.BLACK);
        STANDART_ARRANGEMENT[8][7] = new Knight(Color.BLACK);
        STANDART_ARRANGEMENT[8][8] = new Rook(Color.BLACK);

        STANDART_ARRANGEMENT[7][1] = new Pawn(Color.BLACK);
        STANDART_ARRANGEMENT[7][2] = new Pawn(Color.BLACK);
        STANDART_ARRANGEMENT[7][3] = new Pawn(Color.BLACK);
        STANDART_ARRANGEMENT[7][4] = new Pawn(Color.BLACK);
        STANDART_ARRANGEMENT[7][5] = new Pawn(Color.BLACK);
        STANDART_ARRANGEMENT[7][6] = new Pawn(Color.BLACK);
        STANDART_ARRANGEMENT[7][7] = new Pawn(Color.BLACK);
        STANDART_ARRANGEMENT[7][8] = new Pawn(Color.BLACK);
        Game game = new Game(STANDART_ARRANGEMENT);
        game.start();
    }

}
