package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalRefrigeratorTest {

    @Test
    void testGetCapacityInTestTubes(){
        MedicalRefrigerator fridge = (new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 ));
        assertEquals(200, fridge.getCapacityInTestTubes());
    }

    @Test
    void testSetCapacityInTestTubes(){
        MedicalRefrigerator fridge = (new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 ));
        fridge.setCapacityInTestTubes(300);
        assertEquals(300, fridge.getCapacityInTestTubes());
    }

    @Test
    void testGetCapacityOfTestTubeInMl(){
        MedicalRefrigerator fridge = (new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 ));
        assertEquals(50, fridge.getCapacityOfTestTubeInMl());
    }

    @Test
    void testSetCapacityOfTestTubeInMl(){
        MedicalRefrigerator fridge = (new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 ));
        fridge.setCapacityOfTestTubeInMl(60);
        assertEquals(60, fridge.getCapacityOfTestTubeInMl());
    }

    @Test
    void testGetMaxUsableCapacity() {
        MedicalRefrigerator fridge = (new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 ));
        assertEquals(10000, fridge.getMaxUsableCapacity());
    }

    @Test
    void testToString() {
        MedicalRefrigerator fridge = (new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 ));
        String expected = "MedicalRefrigerator{" +
                "capacityInTestTubes=200"+
                ", capacityOfTestTubeInMl=50"+
                ", brand='EmFridge'"+
                ", model='LK52'" +
                ", capacity='25l'"+
                ", isDefrosing=false" +
                ", energyEfficiencyClass=A" +
                "}";
        assertEquals(expected, fridge.toString());
    }
}