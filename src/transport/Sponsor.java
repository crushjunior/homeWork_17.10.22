package transport;

import java.util.Objects;

public class Sponsor {
    private final String name;
    private int support;

    public Sponsor(String name, int support) {
        this.name = name;
        setSupport(support);
    }

    public String getName() {
        return name;
    }

    public int getSupport() {
        return support;
    }

    public void setSupport(int support) {
        if (support <= 0) {
            this.support = 1000;
        } else {
            this.support = support;
        }
    }

    public void toSponsor() {
        System.out.println("Сделать взнос " + getSupport());
    }

    @Override
    public String toString() {
        return "Спонсор " + getName() + ", " +
                "взнос: " + getSupport();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return support == sponsor.support && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, support);
    }
}
