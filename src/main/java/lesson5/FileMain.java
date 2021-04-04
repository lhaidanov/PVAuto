package lesson5;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileMain {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");
        List<String> list = FileUtils.readLines(file, StandardCharsets.UTF_8);
        Map <Integer, String> map = new HashMap<>();

        for (String s : list) {
            String[] splitArray = s.split(",");
            map.put(Integer.parseInt(splitArray[0].trim()),splitArray[1].trim());

        }
        for (Map.Entry<Integer, String> entry :map.entrySet()){
            System.out.println(entry.getKey() + "==> " + entry.getValue());
        }

//        System.out.println(System.getProperty("user.dir"));
    }
}
