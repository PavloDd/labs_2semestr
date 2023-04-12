package ua.lviv.iot.algo.part1.lab2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class MedicalRefrigerator extends Fridge {
    private final int capacityInTestTubes;
    private final int capacityOfTestTubeInMl;

    @Override
    public int getMaxUsableCapacity() {
        int capacity = this.capacityInTestTubes * this.capacityOfTestTubeInMl;
        return capacity;
    }

    public MedicalRefrigerator(final String brand, final String model,
                               final String capacity, final boolean isDefrosing,
                               final char energyEfficiencyClass, final int capacityInTestTubes,
                               final int capacityOfTestTubeInMl) {
        super(brand, model, capacity, isDefrosing, energyEfficiencyClass);
        this.capacityInTestTubes = capacityInTestTubes;
        this.capacityOfTestTubeInMl = capacityOfTestTubeInMl;
    }

    @Override
    public String toString() {
        return "MedicalRefrigerator{"
                + "capacityInTestTubes="
                + getCapacityInTestTubes()
                + ", capacityOfTestTubeInMl="
                + getCapacityOfTestTubeInMl()
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
