package com.chess.figures;

import com.chess.Color;
import com.chess.Position;

public class Queen extends Figure{
    public Queen(Color color) {
        super(color);
    }

    @Override
    public boolean isPossible(Position position1, Position position2, Figure[][] figures) {
        Rook rook = new Rook(Color.WHITE);
        Bishop bishop = new Bishop(Color.WHITE);
        if(rook.isPossible(position1,position2,figures) || bishop.isPossible(position1,position2,figures)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        if(super.getColor() == Color.WHITE) {
            return "♕";
        }
        return "♛";
    }
}
