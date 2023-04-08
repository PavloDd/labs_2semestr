package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WineFridgeTest {

    @Test
    public void testWineFridgeConstructor(){
        WineFridge fridge = new WineFridge("Bosch","AA12","22l",false,'B',10, 2);
        assertEquals("Bosch", fridge.getBrand());
        assertEquals("AA12", fridge.getModel());
        assertEquals("22l", fridge.getCapacity());
        assertEquals(false, fridge.isDefrosing());
        assertEquals('B', fridge.getEnergyEfficiencyClass());
        assertEquals(10, fridge.getCapacityInNumberOfBottles());
        assertEquals(2, fridge.getMaxVolumeOfBottleInLitters());
    }

    @Test
    public void testGetMaxUsableCapacity() {
        WineFridge fridge = new WineFridge("Bosch","AA12","22l",false,'B',10, 2);
        assertEquals(20, fridge.getMaxUsableCapacity());
    }

    @Test
    public void testToString() {
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
