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
        City myCity = new City("Город", 540);
        City Mosсow = new City("Москва", 800, true, true);

        Truck trailer_truck = new Truck("Грузовик с полуприцепом", 44000, 120, 150.41);
        Ship tanker = new Ship("Танкер", 18159000, 27, 300.82);
        Plane aircraft = new Plane("Самолёт", 120000, 800, 600.68);
        Ship kater = new Ship("Катер", 1815, 90, 100.82);

        System.out.println("Hello Spring!");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Logistics logistics = context.getBean(Logistics.class);
        TransportFactory transportFactory = context.getBean(TransportFactory.class);

        System.out.println(transportFactory);
        System.out.println(logistics);


        logistics = new Logistics(tanker, trailer_truck, kater, aircraft, trailer_truck);

        try {
            logistics.getShipping(Murmansk, 1900, 1);
        } catch (LogisticsGetShippingException ex) {
            System.out.println("Нет нужного транспорта");
        }

        System.out.println();

       // TransportFactory factory = new TransportFactory();
       // Transport transport = factory.getTransport(Murmansk, 190700, 1);


        /*Manul murka = context.getBean(Manul.class);
       Manul murzik= context.getBean(Manul.class);
        Sphynx ramzes= context.getBean(Sphynx.class);

        System.out.println(murzik);
        System.out.println(ramzes);
        System.out.println(murka);

        murka.setName("Мурка");
        System.out.println(murzik.getName());
        System.out.println(murka.getName());
        System.out.println(murzik==murka);*/

      /* Place place = context.getBean(Place.class);
        System.out.println(place.getCat1());
        System.out.println(place.getCat2());*/
    }
}
