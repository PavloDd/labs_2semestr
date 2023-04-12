package ua.lviv.iot.algo.part1.lab2;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter

public class WineFridge extends Fridge {
    private final int capacityInNumberOfBottles;
    private final int maxVolumeOfBottleInLitters;

    @Override
    public int getMaxUsableCapacity() {
        int capacity = this.capacityInNumberOfBottles * this.maxVolumeOfBottleInLitters;
        return capacity;
    }

    public WineFridge(final String brand, final String model,
                      final String capacity, final boolean isDefrosing,
                      final char energyEfficiencyClass, final int capacityInNumberOfBottles,
                      final int maxVolumeOfBottleInLitters) {
        super(brand, model, capacity, isDefrosing, energyEfficiencyClass);
        this.capacityInNumberOfBottles = capacityInNumberOfBottles;
        this.maxVolumeOfBottleInLitters = maxVolumeOfBottleInLitters;
    }

    @Override
    public String toString() {
        return "WineFridge{"
                + "capacityInNumberOfBottles="
                + getCapacityInNumberOfBottles()
                + ", maxVolumeOfBottleInLitters="
                + getMaxVolumeOfBottleInLitters()
                + ", brand='"
                + getBrand()
                + '\''
                + ", model='"
                + getModel()
                + '\''
                + ", capacity='"
                + getCapacity()
                + '\''
                + ", isDefrosing="
                + getIsDefrosing()
                + ", energyEfficiencyClass="
                + getEnergyEfficiencyClass()
                + '}';
    }
}
