package org.example.data;

import org.example.model.CalendarUser;

import java.util.List;
import java.util.Objects;

public class YearCalendar {

    private List<CalendarUser> users;
    private int id;
    private int day;
    private int year;

    public YearCalendar(List<CalendarUser> users, int id, int day, int year) {
        this.users = users;
        this.id = id;
        this.day = day;
        this.year = year;
    }

    public List<CalendarUser> getUsers() {
        return users;
    }

    public void setUsers(List<CalendarUser> users) {
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YearCalendar that = (YearCalendar) o;
        return id == that.id &&
                day == that.day &&
                year == that.year &&
                Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, id, day, year);
    }

    @Override
    public String toString() {
        return "YearCalendar{" +
                "users=" + users +
                ", id=" + id +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
