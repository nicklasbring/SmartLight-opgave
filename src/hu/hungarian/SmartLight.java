package hu.hungarian;

import javafx.scene.paint.Color;

public class SmartLight {


    private short lightPercent = 0;

    private Color color = Color.WHITESMOKE;



    public SmartLight(){

    }


    public void turnUp(){
    if (lightPercent <= 80) {
        lightPercent += 20;
    }

    else{
        lightPercent = 100;
    }
    }



    public void turnDown(){
    if (lightPercent >= 20){
        lightPercent -= 20;
    }

    else{
        lightPercent = 0;
    }
    }



    public String toString(){
        String currentState = ("The current lightpercentage = " + lightPercent + "" +
                " \nand the current color is = " + color);
        return currentState;
    }


    public short getLightPercent(){
        return lightPercent;
    }



    public Color getColor() {
        return color;
    }


    public short getLightPrecent() {
        return lightPercent;
    }


    public void setLightPercent(short lightPercent) {
        this.lightPercent = lightPercent;

        if (lightPercent > 100){
            this.lightPercent = 100;
        }

        else if (lightPercent < 0){
            this.lightPercent = 0;
        }
    }


    public void setColor(Color color) {
        this.color = color;

        if (color == Color.BLACK){
            this.color = Color.LIGHTGREY;
        }
    }


}

