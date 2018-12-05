package com.nullPointer.Utils;

import java.awt.Color;
import java.util.ArrayList;

public class ColorSet {

    public static ArrayList<Color> playerColors = new ArrayList<>();

    public final static Color BLACK = new Color(0,0,0);

    public final static Color BOARDBACKGROUND = new Color(187, 229, 206);

    public final static Color player1Color = new Color(255, 0, 0);

    public final static Color player2Color = new Color(255, 127, 0);

    public final static Color player3Color = new Color(255, 255, 0);

    public final static Color player4Color = new Color(127, 255, 0);

    public final static Color player5Color = new Color(0, 255, 0);

    public final static Color player6Color = new Color(0, 255, 127);

    public final static Color player7Color = new Color(0, 255, 255);

    public final static Color player8Color = new Color(0, 127, 255);

    public final static Color player9Color = new Color(0, 0, 255);

    public final static Color player10Color = new Color(127, 0, 255);

    public final static Color player11Color = new Color(255, 0, 255);

    public final static Color player12Color = new Color(255, 0, 127);

    public ColorSet() {

    }

    public static Color getBLACK() {
        return BLACK;
    }

    public static Color getBackground() {
        return BOARDBACKGROUND;
    }

    public static ArrayList<Color> getPlayerColors() {
        playerColors.add(player1Color);
        playerColors.add(player2Color);
        playerColors.add(player3Color);
        playerColors.add(player4Color);
        playerColors.add(player5Color);
        playerColors.add(player6Color);
        playerColors.add(player7Color);
        playerColors.add(player8Color);
        playerColors.add(player9Color);
        playerColors.add(player10Color);
        playerColors.add(player11Color);
        playerColors.add(player12Color);
        return playerColors;
    }

    /*
    BOARDBACKGROUND("Board", new Color(187, 229, 206)),
    WHITE("White", new Color(256,256,256));

    private final String key;
    private final Color value;

    ColorSet(String key, Color value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Color getValue() {
        return new Color(0,0,0);
    }
        */

}
