package ua.lviv.iot.algo.part1.lab2;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class FridgeManager {
    private List<Fridge> fridges = new LinkedList<>();

    List<Fridge> getFridges() {
        return fridges;
    }

    public void addFridge(Fridge fridge) {
        this.fridges.add(fridge);
    }

    public void addAllFridges(List<Fridge> fridges) {
        this.fridges.addAll(fridges);
    }

     public List<Fridge> findFridgeByBrand(String brand) {
        return fridges.stream().
                filter(fridge -> fridge.getBrand().equals(brand)).
                collect(Collectors.toList());
    }

    public List<Fridge> findFridgeByEnergyEfficiencyClass(char energyEfficiencyClass) {
        return fridges.stream().
                filter(fridge -> fridge.getEnergyEfficiencyClass() == energyEfficiencyClass).
                collect(Collectors.toList());
    }

}