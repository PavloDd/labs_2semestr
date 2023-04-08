package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ShowcaseRefrigerator extends Fridge {
    private int exposureAreaInSquareMeters;
    private int weightWhichFitsUnderBarInKg;
    private int weightWhichFitsOnBarInKg;
    private static int VOLUME_PER_KILOGRAM = 3;

    @Override
    public int getMaxUsableCapacity () {
        int capacity = (this.weightWhichFitsOnBarInKg + this.weightWhichFitsUnderBarInKg) * VOLUME_PER_KILOGRAM;
        return capacity;

    }

    public ShowcaseRefrigerator(String brand, String model, String capacity, boolean isDefrosing, char energyEfficiencyClass, int exposureAreaInSquareMeters, int weightWhichFitsUnderBarInKg, int weightWhichFitsOnBarInKg) {
        super(brand, model, capacity, isDefrosing, energyEfficiencyClass);
        this.exposureAreaInSquareMeters = exposureAreaInSquareMeters;
        this.weightWhichFitsUnderBarInKg = weightWhichFitsUnderBarInKg;
        this.weightWhichFitsOnBarInKg = weightWhichFitsOnBarInKg;
    }

    @Override
    public String toString () {
        return "ShowcaseRefrigerator{"
                + "exposureAreaInSquareMeters="
                + exposureAreaInSquareMeters
                + ", weightWhichFitsUnderBarInKg="
                + weightWhichFitsUnderBarInKg
                + ", weightWhichFitsOnBarInKg="
                + weightWhichFitsOnBarInKg
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
