package com.solid.lsp;

public class Square extends Rectangle {

    Square(int side) {

        this.setSide(side);
    }

    @Override
    public void setWidth(int width) {
//        this.setSide(width);
        super.setWidth(width);
    }

    @Override
    public void setHeight(int height) {

//        this.setSide(height);
        super.setHeight(height);
    }

    public void setSide(int side) {

        super.setWidth(side);
        super.setHeight(side);
    }
}
