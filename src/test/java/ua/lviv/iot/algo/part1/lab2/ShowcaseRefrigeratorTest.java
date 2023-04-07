package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShowcaseRefrigeratorTest {

    @Test
    void testGetMaxUsableCapacity() {
        ShowcaseRefrigerator fridge = new ShowcaseRefrigerator("Samsung", "Ap32", "120l", false, 'C', 1, 20, 12);
        assertEquals(96, fridge.getMaxUsableCapacity());
    }

    @Test
    void testToString() {
        ShowcaseRefrigerator fridge = new ShowcaseRefrigerator("Samsung", "Ap32", "120l", false, 'C', 1, 20, 12);
        String expected = "ShowcaseRefrigerator{" +
                "exposureAreaInSquareMeters=1"+
                ", weightWhichFitsUnderBarInKg=20"+
                ", weightWhichFitsOnBarInKg=12"+
                ", brand='Samsung'"+
                ", model='Ap32'" +
                ", capacity='120l'"+
                ", isDefrosing=false" +
                ", energyEfficiencyClass=C" +
                "}";
        assertEquals(expected, fridge.toString());
    }


    }
