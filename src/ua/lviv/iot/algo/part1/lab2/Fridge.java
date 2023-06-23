package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public abstract class Fridge {
    protected String brand;
    protected String model;
    protected String capacity;
    protected boolean isDefrosing;
    protected char energyEfficiencyClass;

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