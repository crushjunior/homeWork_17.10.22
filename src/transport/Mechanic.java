package transport;

import java.util.Objects;

public class Mechanic<C extends Car>{
    private final String fullName;
    private final String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

    public boolean service(C c) {
        return c.service();
    }

    public void repair(C c) {
        c.repair();
    }

    @Override
    public String toString() {
        return "Механик " + getFullName() + " " +
                "из компании: " + getCompany();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(fullName, mechanic.fullName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company);
    }
}
