package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FridgeManagerTest {
    FridgeManager fridgeManager;
    Fridge fridge0;
    Fridge fridge1;

    @BeforeEach
    public void setUp(){
        FridgeManager fridgeManager = new FridgeManager();
        WineFridge fridge0 = new WineFridge("Bosch","AA12","22l",false,'A',10, 3);
        WineFridge fridge1 = new WineFridge("Bosch","BB12","23l",false,'B',11, 2);
    }

    @Test
    public void testAddFridge() {
        fridgeManager.addFridge(fridge0);
        assertFalse(fridgeManager.getFridges().isEmpty());
        assertTrue(fridgeManager.getFridges().contains(fridge0));
    }

    @Test
    public void testAddAllFridges() {
        List <Fridge> fridges = new LinkedList<>();
        fridges.add(fridge0);
        fridges.add(fridge1);
        fridgeManager.addAllFridges(fridges);
        assertFalse(fridgeManager.getFridges().isEmpty());
        assertTrue(fridgeManager.getFridges().contains(fridge0));
        assertTrue(fridgeManager.getFridges().contains(fridge1));
    }

    @Test
    public void testFindFridgeByBrand() {
        List <Fridge> fridges = new LinkedList<>();
        fridges.add(fridge0);
        fridges.add(fridge1);
        fridgeManager.addAllFridges(fridges);
        assertFalse(fridgeManager.getFridges().isEmpty());
        List <Fridge> boschFridges = fridgeManager.findFridgeByBrand("Bosch");
        assertTrue(boschFridges.contains(fridge0));
        assertFalse(boschFridges.contains(fridge1));
    }

    @Test
    public void testFindFridgeByEnergyEfficiencyClass() {
        List <Fridge> fridges = new LinkedList<>();
        fridges.add(fridge0);
        fridges.add(fridge1);
        fridgeManager.addAllFridges(fridges);
        assertFalse(fridgeManager.getFridges().isEmpty());
        List <Fridge> aClassFridges = fridgeManager.findFridgeByEnergyEfficiencyClass('A');
        assertTrue(aClassFridges.contains(fridge0));
        assertFalse(aClassFridges.contains(fridge1));
    }
}
