package ua.lviv.iot.algo.part1.lab2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class FridgeManager {
    private List<Fridge> fridges = new LinkedList<>();

    List<Fridge> getFridges() {
        return fridges;
    }

    public void addFridge(final Fridge fridge) {
        this.fridges.add(fridge);
    }

    public void addAllFridges(final List<Fridge> fridges) {
        this.fridges.addAll(fridges);
    }

     public List<Fridge> findFridgeByBrand(final String brand) {
        return fridges.stream().
                filter(fridge -> fridge.getBrand().equals(brand)).
                collect(Collectors.toList());
    }

    public List<Fridge> findFridgeByEnergyEfficiencyClass(final char energyEfficiencyClass) {
        return fridges.stream().
                filter(fridge -> fridge.getEnergyEfficiencyClass() == energyEfficiencyClass).
                collect(Collectors.toList());
    }

    public List<Fridge> sortFridgesByClass(List <Fridge> fridges){
        Collections.sort(fridges, new Comparator<>() {
            @Override
            public int compare(Fridge fridge0, Fridge fridge1) {
                return fridge0.getClass().getName().compareTo(fridge1.getClass().getName());
            }
        });
        return fridges;

    }
}
