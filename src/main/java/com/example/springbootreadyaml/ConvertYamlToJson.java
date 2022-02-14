package com.example.springbootreadyaml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConvertYamlToJson {
    public static void main(String[] args) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(
                    "Your's yaml path")));
            System.out.println("*********Content from YAML File ****************");
            System.out.println(content);
            String json = convertYamlToJson(content);
            System.out.println("*********Cnverted JSON from YAML File ****************");
            System.out.println(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String convertYamlToJson(String yaml) {
        try {
            ObjectMapper yamlReader = new ObjectMapper(new YAMLFactory());
            Object obj = yamlReader.readValue(yaml, Object.class);
            ObjectMapper jsonWriter = new ObjectMapper();
            return String.valueOf(obj);
        } catch (JsonProcessingException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
