package org.example.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class CalendarUser implements Serializable {

    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDate calendar;

    public CalendarUser(String id, String email, String firstName, String lastName, LocalDate calendar) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.calendar = calendar;
    }

    public int findDay(LocalDate date) {
        if (calendar.getYear() == date.getYear() && calendar.getMonth() == date.getMonth() && calendar.getDayOfMonth() == date.getDayOfMonth()) {
            return getCalendar().getDayOfMonth();
        } else {
            throw new IllegalArgumentException("The year you're trying to find does not exist!");
        }
    }

    public int createCalendar(int year) {
        if (getCalendar().getYear() == year) {
            throw new IllegalArgumentException("Year already exists!");
        } else {
            LocalDate newYear = LocalDate.of(year, 1, 1);
            return newYear.getYear();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getCalendar() {
        return calendar;
    }

    public void setCalendar(LocalDate calendar) {
        this.calendar = calendar;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalendarUser that = (CalendarUser) o;
        return Objects.equals(email, that.email) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(calendar, that.calendar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, firstName, lastName, calendar);
    }

    @Override
    public String toString() {
        return "CalendarUser{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", calendar=" + calendar +
                '}';
    }

}
