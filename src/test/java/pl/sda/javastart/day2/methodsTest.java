package pl.sda.javastart.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class methodsTest {
    @Test
    public void testRectangleArea(){
        assert Methods.calculateRectangleArea(2,4)==8;
        assert Methods.calculateRectangleArea(2,4)==4;

    }


}