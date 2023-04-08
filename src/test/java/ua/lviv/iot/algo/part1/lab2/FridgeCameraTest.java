package ua.lviv.iot.algo.part1.lab2;

import junit.framework.TestCase;
import org.junit.Test;

public class FridgeCameraTest extends TestCase {

    @Test
    public void testFridgeCameraConstructor(){
        FridgeCamera fridge = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);
        assertEquals("bosch", fridge.getBrand());
        assertEquals("aa", fridge.getModel());
        assertEquals("22l", fridge.getCapacity());
        assertEquals(false, fridge.isDefrosing());
        assertEquals('A', fridge.getEnergyEfficiencyClass());
        assertEquals(2, fridge.getNumberOfEntrances());
        assertEquals("mechanic", fridge.getTypeOfTapeDrive());
        assertEquals(2, fridge.getMaxTapeSpeedInMetersPerSec());
        assertEquals(4, fridge.getMaxWeightTapeCanWithstand());
    }

    public void testGetMaxUsableCapacity() {
        FridgeCamera fridge = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);
        assertEquals(2, fridge.getMaxUsableCapacity());
    }

    @Test
    public void testTestToString() {
        FridgeCamera fridge = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);
        String expected = "FridgeCamera{" +
                "numberOfEntrances=2"+
                ", typeOfTapeDrive='mechanic'"+
                ", maxTapeSpeedInMetersPerSec=2"+
                ", maxWeightTapeCanWithstand=4"+
                ", brand='bosch'"+
                ", model='aa'" +
                ", capacity='22l'"+
                ", isDefrosing=false" +
                ", energyEfficiencyClass=A" +
                "}";
        assertEquals(expected, fridge.toString());
    }
}
