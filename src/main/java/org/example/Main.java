package org.example;

import com.google.gson.Gson;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> data = new LinkedHashMap<>();
        data.put("name","Anatolii");
        data.put("lastName","Dolynskyi");
        String jsonData = new Gson().toJson(data);
        System.out.println("jsonData = " + jsonData);
    }
}