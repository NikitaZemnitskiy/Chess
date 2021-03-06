package com.chess.figures;

import com.chess.Color;
import com.chess.Position;


public class King extends Figure {

    public King(Color color) {
        super(color);
    }

    @Override
    public boolean isPossible(Position position1, Position position2, Figure[][] figures) {

        if (position1.getVertical() == position2.getVertical()+1 && position1.getHorizontal()==position2.getHorizontal()){
            return true;
        }
        if (position1.getVertical() == position2.getVertical()-1 && position1.getHorizontal()==position2.getHorizontal()){
            return true;
        }
        if (position1.getVertical() == position2.getVertical() && position1.getHorizontal()==position2.getHorizontal()+1){
            return true;
        }
        if (position1.getVertical() == position2.getVertical() && position1.getHorizontal()==position2.getHorizontal()-1){
            return true;
        }
        if (position1.getVertical() == position2.getVertical()+1 && position1.getHorizontal()==position2.getHorizontal()+1){
            return true;
        }
        if (position1.getVertical() == position2.getVertical()+1 && position1.getHorizontal()==position2.getHorizontal()-1){
            return true;
        }
        if (position1.getVertical() == position2.getVertical()-1 && position1.getHorizontal()==position2.getHorizontal()+1){
            return true;
        }
        if (position1.getVertical() == position2.getVertical()-1 && position1.getHorizontal()==position2.getHorizontal()-1){
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        if(super.getColor() == Color.WHITE) {
            return "♔";
        }
        return "♚";
    }
}
