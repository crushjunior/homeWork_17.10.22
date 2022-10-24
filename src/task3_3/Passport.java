package task3_3;

import java.util.Objects;

public class Passport {
    private String number;
    private String lastName;
    private String firstName;
    private String patronymic;
    private final String dateOfBirth;

    public Passport(String number, String lastName, String firstName, String patronymic, String dateOfBirth) throws RuntimeException {
        if (number == null || number.isBlank()) {
            throw new RuntimeException("Введите данные");
        } else {
            this.number = number;
        }

        setLastName(lastName);

        setFirstName(firstName);

        setPatronymic(patronymic);

        if (dateOfBirth == null || dateOfBirth.isBlank()) {
            throw new RuntimeException("Введите данные");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public void setLastName(String lastName) throws RuntimeException{
        if (lastName == null || lastName.isBlank()) {
            throw new RuntimeException("Введите данные");
        } else {
            this.lastName = lastName;
        }
    }

    public void setFirstName(String firstName) throws RuntimeException {
        if (firstName == null || firstName.isBlank()) {
            throw new RuntimeException("Введите данные");
        } else {
            this.firstName = firstName;
        }
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return Objects.equals(number, passport.number) && Objects.equals(lastName, passport.lastName) && Objects.equals(firstName, passport.firstName) && Objects.equals(patronymic, passport.patronymic) && Objects.equals(dateOfBirth, passport.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, lastName, firstName, patronymic, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number='" + number + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
