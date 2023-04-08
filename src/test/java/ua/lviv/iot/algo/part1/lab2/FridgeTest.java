package ua.lviv.iot.algo.part1.lab2;

import junit.framework.TestCase;
import org.junit.Test;

public class FridgeTest extends TestCase {

    @Test
    public void testGetMaxUsableCapacity() {
    }

    @Test
    public void testTurnOnDefrosing() {
        FridgeCamera fridge = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);
        fridge.turnOnDefrosing();
        assertTrue(fridge.isDefrosing);
    }

    @Test
    public void testTurnOffDefrosing() {
        FridgeCamera fridge = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);
        fridge.turnOffDefrosing();
        assertFalse(fridge.isDefrosing);
    }

    @Test
    public void testDeleteModelInfo() {
        FridgeCamera fridge = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);
        fridge.deleteModelInfo();
        assertNull(fridge.getModel());
    }
}
