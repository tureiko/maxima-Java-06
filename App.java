package org.example;


import org.example.config.SpringConfig;
import org.example.model.Manul;
import org.example.model.Place;
import org.example.model.Sphynx;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        City Spb = new City("Санкт-Петербург", 120, true, true);
        City Murmansk = new City("Мурманск", 1400, false, true);
        City Tver = new City("Тверь", 540, false, true);
        City myCity = new City("Город", 940);
        City Mosсow = new City("Москва", 800, true, true);

        Truck trailerTruck = new Truck("Грузовик с полуприцепом", 24000, 120, 150.41);
        Truck roadTrain = new Truck("Автопоезд", 44000, 100, 180.41);
        Ship tanker = new Ship("Танкер", 18159000, 27, 300.82);
        Plane aircraft = new Plane("Самолёт", 120000, 800, 600.68);
        Ship kater = new Ship("Катер", 1815, 90, 100.82);

        System.out.println("Hello Spring!");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Logistics logistics = context.getBean(Logistics.class);
        TransportFactory transportFactory = context.getBean(TransportFactory.class);

        logistics = new Logistics(tanker, roadTrain, kater, aircraft, trailerTruck);
        logistics.getShipping(myCity, 1900, 1);




      /*  Manul murka = context.getBean(Manul.class);
        Manul murzik = context.getBean(Manul.class);

        Sphynx ramzes = (Sphynx) context.getBean("hairless");

        System.out.println(murzik);
        System.out.println(ramzes);
        System.out.println(murka);*/
/*
        murka.setName("Мурка");
        System.out.println(murzik.getName());
        System.out.println(murka.getName());
        System.out.println(murzik==murka);*/


      /* Place place = context.getBean(Place.class);
        System.out.println(place.getCat1());
        System.out.println(place.getCat2());*/
    }
}
