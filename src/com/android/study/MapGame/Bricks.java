package com.android.study.MapGame;

import java.awt.*;

public class Bricks {
    public int map[][];
    public int brickWidth;
    public int brickHeight;

    public Bricks(int row, int column) {
        map = new int[row][column];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = 1;
            }
        }
        brickWidth = 650 / column;
        brickHeight = 150 / row;
    }

    public void draw(Graphics2D graphics2D) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    graphics2D.setColor(Color.DARK_GRAY);
                    graphics2D.fillRect(j * brickWidth + 75, i * brickHeight + 40, brickWidth, brickHeight);
                    //stroke
                    graphics2D.setColor(Color.BLACK);
                    graphics2D.setStroke(new BasicStroke(3));
                    graphics2D.drawRect(j * brickWidth + 75, i * brickHeight + 40, brickWidth, brickHeight);
                }
            }
        }
    }

    public void value(int value, int row, int column) {
        map[row][column] = value;
    }
}
