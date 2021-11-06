package com.solvd.autoservice;

import org.apache.commons.io.FileUtils;
import java.io.File;
import org.apache.commons.lang3.StringUtils;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Stream;


class TextReading {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("src/main/resources/Dumas.txt");
        System.out.println(inputStream.available());
        int a = 0;
        while ((a = inputStream.read()) != -1) {
            System.out.print((char) a);
        }
        File dumasFile = new File( "src/main/resources/Dumas.txt");
        String dumasText = FileUtils.readFileToString(dumasFile, "UTF-8");
        dumasText = dumasText.toLowerCase();
        dumasText = dumasText.replaceAll("[^a-z0-9]", " ");
        System.out.println(org.apache.commons.lang3.StringUtils.isAlphanumericSpace(dumasText));

        List<String> dumasList = new ArrayList<>(Arrays.asList(StringUtils.split(dumasText)));
        System.out.println(dumasList);

        Map<String, Integer> textMap = new HashMap<String, Integer>();
        for(String words : dumasList){
            Integer count = textMap.get(words);
            textMap.put(words,(count == null) ? 1 : count + 1);
        }
        printMap(textMap);

        Stream<Map.Entry<String,Integer>> sorted =
                textMap.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue());

        PrintWriter writer = new PrintWriter("New file.txt", "UTF-8");
        sorted.forEach(el -> writer.write(el + "\n"));
        writer.close();
    }

    public static void printMap(Map<String, Integer> textMap){
        for (Map.Entry<String, Integer> entry : textMap.entrySet()) {
            System.out.println(" Word " + entry.getKey() + ", repeat " + entry.getValue());
        }
    }
}
