package com.peaksoft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson gson = BUILDER.setPrettyPrinting().create();
    //public static final Path WRITE_PATH = Paths.get("./cars.json");

    public static void main(String[] args) { // * - все баары
        // write your code here
//
//        Car[] cars = {
//                Car.makeCar("X6", 3000, Type.BMW),
//                Car.makeCar("M5", 6000, Type.TESLA),
//                Car.makeCar("Camry", 3000, Type.TOYOTA)
//        };
//
        //String allCars = gson.toJson(cars);


        //System.out.println(allCars);  // это первая часть вывести на консоль

        //writeFile(allCars); // вторая часть писать файл

//        String read = readFile();
//        System.out.println(read);

        //System.out.println(readFile());//третья часть читать файл


        Autobaza autobaza = new Autobaza(1, "Moskva prospect Mira");
        System.out.println(autobaza);


//        Car[] cars1 = gson.fromJson(readFile(),Car[].class);
//        for(Car c:cars1){
//            System.out.println(c.toString());

        //}
//
    }


//пишет файл
    private static void writeFile(String object) {
        Path write = Paths.get("./cars.json"); //String.valueOf(WRITE_PATH)

        try {
            Files.writeString(write, object, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            e.getMessage();
        }
    }



    // читает файл
    private static String readFile() {
        String json = "";
        try{
            FileReader fileReader = new FileReader("./cars.json"); //String.valueOf(WRITE_PATH)
            int a;
            while((a = fileReader.read()) != -1){
                json +=  (char)a;
            }
            //return json;
        }catch(IOException e){
            e.getMessage();
        }
        return json;
    }

}

