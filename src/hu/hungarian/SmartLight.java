package hu.hungarian;

import javafx.scene.paint.Color;

import java.lang.reflect.Field;

public class SmartLight {

    private short lightPercent;
    private Color color;

    public SmartLight() {
        lightPercent = 0;
        color = Color.WHITESMOKE;
    }

    public void turnUp() {
        lightPercent = (short) ensureRange(lightPercent + 20, 0, 100);
    }

    public void turnDown() {
        lightPercent = (short) ensureRange(lightPercent - 20, 0, 100);
    }

    @Override
    public String toString() {
        return "SmartLight is " + lightPercent +
                "% lit with color " + color + " .";
    }

    private int ensureRange(int value, int min, int max) {
        return Math.min(Math.max(value, min), max);
    }

    private boolean inRange(int value, int min, int max) {
        return (value >= min) && (value <= max);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        if (color == Color.BLACK) this.color = Color.DARKGRAY;
    }

    public short getLightPercent() {
        return lightPercent;
    }

    public void setLightPercent(int lightPercent) {
        this.lightPercent = (short) ensureRange( lightPercent, 0, 100);
    }

}
