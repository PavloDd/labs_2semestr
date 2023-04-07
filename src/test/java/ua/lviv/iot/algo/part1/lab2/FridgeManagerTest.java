package ua.lviv.iot.algo.part1.lab2;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FridgeManagerTest {

    @Test
    void testAddFridge() {
        FridgeManager fridgeManager = new FridgeManager();
        WineFridge fridge = new WineFridge("Bosch","AA12","22l",false,'B',10, 2);
        fridgeManager.addFridge(fridge);
        assertTrue(fridgeManager.getFridges().contains(fridge));
    }

    @Test
    void testAddAllFridges() {
        FridgeManager fridgeManager = new FridgeManager();
        WineFridge fridge0 = new WineFridge("Bosch","AA12","22l",false,'A',10, 3);
        WineFridge fridge1 = new WineFridge("Bosch","BB12","23l",false,'B',11, 2);
        List <Fridge> fridges = new LinkedList<>();
        fridges.add(fridge0);
        fridges.add(fridge1);
        fridgeManager.addAllFridges(fridges);
        assertTrue(fridgeManager.getFridges().contains(fridge0));
        assertTrue(fridgeManager.getFridges().contains(fridge1));
    }

    @Test
    void testFindFridgeByBrand() {
        FridgeManager fridgeManager = new FridgeManager();
        WineFridge fridge0 = new WineFridge("Bosch","AA12","22l",false,'A',10, 3);
        WineFridge fridge1 = new WineFridge("Samsung","BB12","23l",false,'B',11, 2);
        List <Fridge> fridges = new LinkedList<>();
        fridges.add(fridge0);
        fridges.add(fridge1);
        fridgeManager.addAllFridges(fridges);
        List <Fridge> boschFridges = fridgeManager.findFridgeByBrand("Bosch");
        assertTrue(boschFridges.contains(fridge0));
        assertFalse(boschFridges.contains(fridge1));
    }

    @Test
    void testFindFridgeByEnergyEfficiencyClass() {
        FridgeManager fridgeManager = new FridgeManager();
        WineFridge fridge0 = new WineFridge("Bosch","AA12","22l",false,'A',10, 3);
        WineFridge fridge1 = new WineFridge("Samsung","BB12","23l",false,'B',11, 2);
        List <Fridge> fridges = new LinkedList<>();
        fridges.add(fridge0);
        fridges.add(fridge1);
        fridgeManager.addAllFridges(fridges);
        List <Fridge> aClassFridges = fridgeManager.findFridgeByEnergyEfficiencyClass('A');
        assertTrue(aClassFridges.contains(fridge0));
        assertFalse(aClassFridges.contains(fridge1));
    }
}