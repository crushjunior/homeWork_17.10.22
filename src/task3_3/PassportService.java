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
        return passportMap.get(number);
    }

    public void addPassport(Passport passport) {
        if (!passportMap.containsKey(passport.getNumber())) {
            passportMap.put(passport.getNumber(), passport);
        } else {

            Passport pMap = passportMap.get(passport.getNumber());
            pMap.setPatronymic(passport.getPatronymic());
            pMap.setFirstName(passport.getFirstName());
            pMap.setLastName(passport.getLastName());
        }
    }

    //            passportMap.get(passport).setFirstName(passport.getFirstName());
//            passportMap.get(passport).setLastName(passport.getLastName());
//            passportMap.get(passport).setPatronymic(passport.getPatronymic());

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
