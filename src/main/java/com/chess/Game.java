package com.chess;

import com.chess.figures.Figure;
import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j
public class Game {
    private Figure[][] STANDART_ARRANGEMENT;

    public Game(Figure[][] STANDART_ARRANGEMENT) {
        this.STANDART_ARRANGEMENT = STANDART_ARRANGEMENT;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        Board board = new Board(STANDART_ARRANGEMENT);
        while (true){
            String lastPosition = scanner.nextLine();
            Position position1 = new Position(lastPosition.charAt(0),Integer.parseInt(String.valueOf(lastPosition.charAt(1))));
            String newPosition = scanner.nextLine();
            Position position2 = new Position(newPosition.charAt(0),Integer.parseInt(String.valueOf(newPosition.charAt(1))));
            if(!board.makeTurn(position1,position2)){
                log.info("Wrong turn");
                continue;
            }
            else {
                log.info("You made turn");
            }
            board.drow();
            int lose = board.anybodyLose();
            if (board.anybodyLose() == -1){
                log.info("White won!!");
                break;
            }
            if (board.anybodyLose() == 1){
                log.info("Black won!!");
                break;
            }
        }

    }
}
