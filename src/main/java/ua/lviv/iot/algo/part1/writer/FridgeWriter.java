package ua.lviv.iot.algo.part1.writer;

import ua.lviv.iot.algo.part1.lab2.Fridge;
import ua.lviv.iot.algo.part1.lab2.FridgeCamera;
import ua.lviv.iot.algo.part1.lab2.MedicalRefrigerator;
import ua.lviv.iot.algo.part1.lab2.WineFridge;
import ua.lviv.iot.algo.part1.lab2.FridgeManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class FridgeWriter {
    public static String write(List<Fridge> fridges) {
        String defaultFileName = "result.csv";
        Map <String, Boolean> headerMap = new HashMap<>();
        if (fridges == null || fridges.isEmpty()) {
            return null;
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(defaultFileName));
            for (Fridge fridge : fridges) {
                String className = fridge.getClass().getSimpleName();
                if (!headerMap.containsKey(className) || !headerMap.get(className)){
                    writer.write(fridge.getHeaders() + "\n");
                    headerMap.put(className, true);
                }
                writer.write(fridge.getCSV() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defaultFileName;
    }

        public static void main(String[] args)  {
            FridgeManager fridgeManager = new FridgeManager();

            List<Fridge> fridges = new LinkedList<>();
            Fridge fridge0 = new WineFridge("Bosch","AA12","22l",false,'A',10, 3);
            Fridge fridge1 = new WineFridge("Samsung","BB12","23l",false,'B',11, 2);
            Fridge fridge2 = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);
            Fridge fridge3 = new MedicalRefrigerator("EmFridge", "LK52", "25l", false, 'A', 200, 50 );
            Fridge fridge4 = new FridgeCamera ("bosch","aa","22l", false, 'A',2, "mechanic", 2, 4);

            fridges.add(fridge0);
            fridges.add(fridge1);
            fridges.add(fridge2);
            fridges.add(fridge3);
            fridges.add(fridge4);

            List<Fridge> sortedFridges = fridgeManager.sortFridgesByClass(fridges);

            write(sortedFridges);



        }

//        String defaultFileName = "result.csv";
//        try (FileWriter writer = new FileWriter(defaultFileName);) {
//            for (Fridge fridge : fridges) {
//                try {
//                    writer.write(fridge.getHeaders());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return defaultFileName;
//    }
//    }
}
