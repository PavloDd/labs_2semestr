package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ShowcaseRefrigerator extends Fridge {
    private final int exposureAreaInSquareMeters;
    private final int weightWhichFitsUnderBarInKg;
    private final int weightWhichFitsOnBarInKg;
    private static int VOLUME_PER_KILOGRAM = 3;

    @Override
    public int getMaxUsableCapacity() {
        int capacity = (this.weightWhichFitsOnBarInKg + this.weightWhichFitsUnderBarInKg) * VOLUME_PER_KILOGRAM;
        return capacity;

    }

    public ShowcaseRefrigerator(final String brand, final String model,
                                final String capacity, final boolean isDefrosing,
                                final char energyEfficiencyClass, final int exposureAreaInSquareMeters,
                                final int weightWhichFitsUnderBarInKg, final int weightWhichFitsOnBarInKg) {
        super(brand, model, capacity, isDefrosing, energyEfficiencyClass);
        this.exposureAreaInSquareMeters = exposureAreaInSquareMeters;
        this.weightWhichFitsUnderBarInKg = weightWhichFitsUnderBarInKg;
        this.weightWhichFitsOnBarInKg = weightWhichFitsOnBarInKg;
    }

    @Override
    public String toString() {
        return "ShowcaseRefrigerator{"
                + "exposureAreaInSquareMeters="
                + getExposureAreaInSquareMeters()
                + ", weightWhichFitsUnderBarInKg="
                + getWeightWhichFitsUnderBarInKg()
                + ", weightWhichFitsOnBarInKg="
                + getWeightWhichFitsOnBarInKg()
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
