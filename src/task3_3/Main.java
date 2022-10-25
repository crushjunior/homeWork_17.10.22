package task3_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Passport passport1 = new Passport("1234", "Иванов", "Иван", "Иванович", "10.11.1973");
        Passport passport2 = new Passport("6541", "Яковлев", "Кирилл", "Матвеевич", "10.08.1985");
        Passport passport3 = new Passport("9876", "Бондаренко", "Борис", "Михайлович", "01.12.1981");
        Passport passport4 = new Passport("6541", "Захаров", "Павел", "Павлович", "10.11.1973");


        PassportService passportServiceMap = new PassportService();
        passportServiceMap.addPassport(passport1);
        passportServiceMap.addPassport(passport2);
        passportServiceMap.addPassport(passport3);
        passportServiceMap.addPassport(passport4);
        System.out.println(passportServiceMap);

        System.out.println(passportServiceMap.searchPassport("1234"));



    }


}
