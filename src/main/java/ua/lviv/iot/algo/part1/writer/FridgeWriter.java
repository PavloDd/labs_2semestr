package ua.lviv.iot.algo.part1.writer;

import ua.lviv.iot.algo.part1.lab2.Fridge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class FridgeWriter {
    public static void writeToFile(List<Fridge> fridges, String defaultFileName) {
        Map<String, Boolean> headerMap = new HashMap<>();
        if (fridges == null || fridges.isEmpty()) {
            return;
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(defaultFileName, java.nio.charset.StandardCharsets.UTF_8));
            for (Fridge fridge : fridges) {
                String className = fridge.getClass().getSimpleName();
                if (!headerMap.containsKey(className) || !headerMap.get(className)) {
                    writer.write(fridge.getHeaders() + "\n");
                    headerMap.put(className, true);
                }
                writer.write(fridge.getCSV() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

