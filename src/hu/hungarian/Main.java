package hu.hungarian;


import javafx.scene.paint.Color;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        SmartLight s = new SmartLight();
        System.out.println(s.toString());


        s.turnUp();
        s.setColor(Color.RED);
        s.setLightPercent((short) 78);

        System.out.println();

        System.out.println(s.toString());


    }
}
