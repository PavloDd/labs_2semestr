package ua.lviv.iot.algo.part1.lab2;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class FridgeManager {
    private List <Fridge> fridges = new LinkedList<>();

    public void addFridge (Fridge fridge){
        this.fridges.add(fridge);

    }

    public void addAllFridges (List <Fridge> fridges){
        this.fridges.addAll(fridges);
    }

     public List <Fridge> findFridgeByBrand (String brand){
        return fridges.stream().
                filter(fridge -> fridge.getBrand()==(brand)).
                collect(Collectors.toList());
    }

    public List <Fridge> findFridgeByEnergyEfficiencyClass (char energyEfficiencyClass){
        return fridges.stream().
                filter(fridge -> fridge.getEnergyEfficiencyClass()== energyEfficiencyClass).
                collect(Collectors.toList());
    }

    public static void main(String ... Args){
        List <Fridge> fridges = new LinkedList<>();
        fridges.add(new WineFridge("Bosch","AA12","22l",false,'B',10, 2));
        fridges.add(new WineFridge("Bosch","AA25","10l",false,'A',4, 2));
        fridges.add(new FridgeCamera("Bosch", "MT22", "200l", false, 'A', 1, "mechanical", 1,160));
        fridges.add(new FridgeCamera("Samsung", "Ap22", "255l", false, 'A', 2, "electrical", 2,180));
        fridges.add(new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 ));
        fridges.add(new MedicalRefrigerator("EmFridge", "LK567", "45l", false, 'B', 350, 50 ));
        fridges.add(new ShowcaseRefrigerator("Samsung", "Ap32", "120l", false, 'C', 1, 20, 12));
        fridges.add(new ShowcaseRefrigerator("Bosch", "LKH76", "150l", false, 'A', 2, 25, 25));

        FridgeManager fridgeManager = new FridgeManager();
        fridgeManager.addAllFridges(fridges);

        List<Fridge> fridgeByBrand = fridgeManager.findFridgeByBrand("Bosch");
        fridgeByBrand.forEach(device -> System.out.println(device.toString()));
        System.out.println("_________________________________________________");
        List<Fridge> fridgeByEnergyEfficiencyClass = fridgeManager.findFridgeByEnergyEfficiencyClass('B');
        fridgeByEnergyEfficiencyClass.forEach(fridge -> System.out.println(fridge.toString()));
    }
}
