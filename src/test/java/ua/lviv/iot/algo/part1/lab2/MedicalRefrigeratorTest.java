package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicalRefrigeratorTest {

    @Test
    public void testMedicalRefrigeratorConstructor(){
        MedicalRefrigerator fridge = (new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 ));
        assertEquals("EmFridge", fridge.getBrand());
        assertEquals("LK52", fridge.getModel());
        assertEquals("25l", fridge.getCapacity());
        assertEquals(false, fridge.isDefrosing());
        assertEquals('A', fridge.getEnergyEfficiencyClass());
        assertEquals(200, fridge.getCapacityInTestTubes());
        assertEquals(50, fridge.getCapacityOfTestTubeInMl());
    }

    @Test
    public void testGetMaxUsableCapacity() {
        MedicalRefrigerator fridge = (new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 ));
        assertEquals(10000, fridge.getMaxUsableCapacity());
    }

    @Test
    public void testToString() {
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
