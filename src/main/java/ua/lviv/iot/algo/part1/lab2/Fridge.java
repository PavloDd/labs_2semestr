package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public abstract class Fridge {
    private final String brand;
    private final String model;
    private final String capacity;
    private final boolean isDefrosing;
    private final char energyEfficiencyClass;

    public Fridge(final String brand, final String model,
                  final String capacity, final Boolean isDefrosing,
                  final char energyEfficiencyClass) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.isDefrosing = isDefrosing;
        this.energyEfficiencyClass = energyEfficiencyClass;
    }

    public abstract int getMaxUsableCapacity();

    public boolean getIsDefrosing() {
        return isDefrosing;
    }
}
