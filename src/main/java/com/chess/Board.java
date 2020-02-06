package com.chess;
import com.chess.figures.Figure;

import com.chess.figures.King;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
@Getter
@Setter
@Slf4j
public class Board {
    public Board(Figure[][] figures) {
        this.figures = figures;
    }

    Figure [][] figures;
    public boolean makeTurn(Position position1, Position position2){
        if (!isTurnPossible(position1, position2)){
            return false;
        }
        else {
            Figure figureBuff = figures[position1.getVertical()][position1.getIntHorizontal()];
            figures[position1.getVertical()][position1.getIntHorizontal()] = null;
            figures[position2.getVertical()][position2.getIntHorizontal()] = figureBuff;
            return true;
        }
    }

    public boolean isTurnPossible(Position position1, Position position2){

        //Position 1 does't have a figure
       if (figures[position1.getVertical()][position1.getIntHorizontal()] == null){
           System.out.println(position1.getVertical() + " - vert");
           System.out.println(position1.getIntHorizontal() + " - horiz");
           log.debug("Turn is impossible. Position 1 don't have a figure");
           return false;
       }

       //Position 1 and position 2 are the same color
       if(figures[position2.getVertical()][position2.getIntHorizontal()] != null){
           if (figures[position1.getVertical()][position1.getIntHorizontal()].getColor() ==
                   figures[position2.getVertical()][position2.getIntHorizontal()].getColor()){
               log.debug("Turn is impossible. Position 1 and position 2 have the same color figures");
               return false;
           }
       }
       if (!figures[position1.getVertical()][position1.getIntHorizontal()]
                .isPossible(position1,position2, figures)){
           log.debug("Turn is impossible");
           return false;
       }
        log.debug("Turn is Possible");
        return true;
    }
    public void drow(){
        for(int i = 1; i<9; i++){
            for(int k = 1; k<9; k++){
                if(figures[i][k] != null) {
                    System.out.print(" "+figures[i][k]+" ");
                }
                else {
                    System.out.print(" ▢ ");
                }
            }
            System.out.println();
        }
    }
    public int anybodyLose(){
        boolean isWhiteKingAlive = false;
        boolean isBlackKingAlive = false;
        for(int i = 1; i<9; i++) {
            for (int k = 1; k < 9; k++) {
                if(figures[i][k].getClass() == King.class){
                    if (figures[i][k].getColor() == Color.WHITE){
                        isWhiteKingAlive = true;
                    }
                    if (figures[i][k].getColor() == Color.BLACK){
                        isBlackKingAlive = true;
                    }
                }
            }
        }
        if(!isBlackKingAlive){
            return -1;
        }
        if(!isWhiteKingAlive){
            return 1;
        }
        return 0;
    }
}
