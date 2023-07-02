package ru.netology.web.data;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class DataGenerator {
    private static Faker faker = new Faker(new Locale("ru"));

    private static final List<String> cities = Arrays.asList("Самара","Кострома","Псков","Санкт-Петербург","Калининград","Тверь","Пермь","Волгоград","Саратов");
    public static String generateDate(long addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
    }
    public static String generateCity() {
       return cities.get(faker.random().nextInt(cities.size()));
    }
    public static String generateName(){
        return faker.name().fullName();
    }
    public static String generatePhone(){return faker.phoneNumber().phoneNumber();}
}


