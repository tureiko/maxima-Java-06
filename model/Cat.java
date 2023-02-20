package org.example.model;

import org.example.TransportFactory;

public interface Cat {
    String getName();               // если 2 Бина имплеминтрирует один интерфейс, нужно выбрать 1
                                    // указать приоритетный Бин @Primary

}
