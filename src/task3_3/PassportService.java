package task3_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PassportService {
    private Map<String, Passport> passportMap;

    public PassportService() {
        passportMap = new HashMap<>();
    }


    public Passport searchPassport(String number) {
        for (Passport passport : passportMap.values()) {
            if (passport.getNumber().equals(number)) {
                return passport;
            }
        }
        return null;
    }

    public void addPassport(Passport passport) {
        if (searchPassport(passport.getNumber()) == null) {
            passportMap.put(passport.getNumber(), passport);
        } else {
            passport.setLastName(passport.getLastName());
            passport.setFirstName(passport.getFirstName());
            passport.setPatronymic(passport.getPatronymic());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassportService that = (PassportService) o;
        return Objects.equals(passportMap, that.passportMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportMap);
    }

    @Override
    public String toString() {
        return "PassportService{" +
                "passportMap=" + passportMap +
                '}';
    }
}
