package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString


public abstract class Fridge {
    protected String brand;
    protected String model;
    protected String capacity;
    protected boolean isDefrosing;
    protected char energyEfficiencyClass;

    public Fridge (String brand, String model, String capacity, Boolean isDefrosing, char energyEfficiencyClass){
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.isDefrosing = isDefrosing;
        this.energyEfficiencyClass = energyEfficiencyClass;
    }

    public int getMaxUsableCapacity(){
        return 0;
    };

    public void turnOnDefrosing(){
        this.isDefrosing = true;
    };

    public void turnOffDefrosing(){
        this.isDefrosing = false;
    };

    public void deleteModelInfo(){
        this.model = null;
    };


}