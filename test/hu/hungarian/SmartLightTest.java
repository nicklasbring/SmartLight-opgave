package hu.hungarian;

import javafx.scene.paint.Color;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class SmartLightTest {

    SmartLight s = new SmartLight();

    @Test
    public void initialValuesTest() {
        short x = s.getLightPercent();
        assertTrue(x == 0);
        Color c = Color.WHITESMOKE;
        assertTrue(s.getColor() == c);
    }

    @Test
    public void turnUpTest() {
        s.setLightPercent((short)0);
        assertTrue(s.getLightPercent() == 0);
        s.turnUp();
        assertTrue(s.getLightPercent() == 20);
        s.turnUp();
        assertTrue(s.getLightPercent() == 40);
        s.turnUp();
        assertTrue(s.getLightPercent() == 60);
        s.turnUp();
        assertTrue(s.getLightPercent() == 80);
        s.turnUp();
        assertTrue(s.getLightPercent() == 100);
        s.turnUp();
        assertTrue(s.getLightPercent() == 100);
        s.turnUp();
        assertTrue(s.getLightPercent() == 100);
    }

    @Test
    public void turnDownTest() {
        s.setLightPercent((short)50);
        assertTrue(s.getLightPercent() == 50);
        s.turnDown();
        assertTrue(s.getLightPercent() == 30);
        s.turnDown();
        assertTrue(s.getLightPercent() == 10);
        s.turnDown();
        assertTrue(s.getLightPercent() == 0);
        s.turnDown();
        assertTrue(s.getLightPercent() == 0);
    }

    @Test
    public void setLightTest() {
        s.setLightPercent((short)-1220);
        assertTrue(s.getLightPercent() == 0);
        s.setLightPercent((short)1110);
        assertTrue(s.getLightPercent() == 100);
    }

    @Test
    public void colorTest() {
        assertThat(s.getColor(), instanceOf(javafx.scene.paint.Color.class));
    }

    @Test
    public void colorShouldNotBeBlackTest() {
        s.setColor(Color.BLACK);
        assertFalse(s.getColor() == Color.BLACK);
    }
}