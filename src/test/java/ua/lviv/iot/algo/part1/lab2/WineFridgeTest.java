package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WineFridgeTest {

    @Test
    void testGetCapacityInNumberOfBottles(){
        WineFridge fridge = new WineFridge("Bosch","AA12","22l",false,'B',10, 2);
        assertEquals(10, fridge.getCapacityInNumberOfBottles());
    }

    @Test
    void testSetCapacityInNumberOfBottles(){
        WineFridge fridge = new WineFridge("Bosch","AA12","22l",false,'B',10, 2);
        fridge.setCapacityInNumberOfBottles(20);
        assertEquals(20, fridge.getCapacityInNumberOfBottles());
    }

    @Test
    void testGetMaxVolumeOfBottleInLitters(){
        WineFridge fridge = new WineFridge("Bosch","AA12","22l",false,'B',10, 2);
        assertEquals(2, fridge.getMaxVolumeOfBottleInLitters());
    }

    @Test
    void testSetMaxVolumeOfBottleInLitters(){
        WineFridge fridge = new WineFridge("Bosch","AA12","22l",false,'B',10, 2);
        fridge.setMaxVolumeOfBottleInLitters(3);
        assertEquals(3, fridge.getMaxVolumeOfBottleInLitters());
    }

    @Test
    void testGetMaxUsableCapacity() {
        WineFridge fridge = new WineFridge("Bosch","AA12","22l",false,'B',10, 2);
        assertEquals(20, fridge.getMaxUsableCapacity());
    }

    @Test
    void testToString() {
        WineFridge fridge = new WineFridge("Bosch","AA12","22l",false,'B',10, 2);
        String expected = "WineFridge{" +
                "capacityInNumberOfBottles=10"+
                ", maxVolumeOfBottleInLitters=2"+
                ", brand='Bosch'"+
                ", model='AA12'" +
                ", capacity='22l'"+
                ", isDefrosing=false" +
                ", energyEfficiencyClass=B" +
                "}";
        assertEquals(expected, fridge.toString());
    }
    }
