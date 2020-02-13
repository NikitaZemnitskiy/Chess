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
    static String boardStr = "";
    Figure [][] figures;
    public void drow(){
        for(int i = 1; i<9; i++){
            for(int k = 1; k<9; k++){
                if(figures[i][k] != null) {
                    boardStr = boardStr+figures[i][k].toString();
                    System.out.print(""+figures[i][k]+"");
                }
                else {
                    boardStr = boardStr+"1";
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
