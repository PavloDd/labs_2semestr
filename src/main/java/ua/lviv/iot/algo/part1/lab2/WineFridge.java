package ua.lviv.iot.algo.part1.lab2;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter





public class WineFridge extends Fridge {

    private int capacityInNumberOfBottles;
    private int maxVolumeOfBottleInLitters;

    @Override
    public int getMaxUsableCapacity () {
        int capacity = this.capacityInNumberOfBottles * this.maxVolumeOfBottleInLitters;
        return capacity;
    }

    public WineFridge(String brand, String model, String capacity, boolean isDefrosing, char energyEfficiencyClass, int capacityInNumberOfBottles, int maxVolumeOfBottleInLitters) {
        super(brand, model, capacity, isDefrosing, energyEfficiencyClass);
        this.capacityInNumberOfBottles = capacityInNumberOfBottles;
        this.maxVolumeOfBottleInLitters = maxVolumeOfBottleInLitters;
    }

    @Override
    public String toString () {
        return "WineFridge{"
                + "capacityInNumberOfBottles="
                + capacityInNumberOfBottles
                + ", maxVolumeOfBottleInLitters="
                + maxVolumeOfBottleInLitters
                + ", brand='"
                + brand
                + '\''
                + ", model='"
                + model
                + '\''
                + ", capacity='"
                + capacity
                + '\''
                + ", isDefrosing="
                + isDefrosing
                + ", energyEfficiencyClass="
                + energyEfficiencyClass
                + '}';
    }
}
