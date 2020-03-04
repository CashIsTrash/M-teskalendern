package org.example.data;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CalendarDay implements Serializable {

    private List<Meeting> meetingList;
    private LocalDate date;


    public CalendarDay(LocalDate date) {
        this.meetingList = new ArrayList<>();
        this.date = date;
    }

    public List<Meeting> getMeetingList() {
        return meetingList;
    }

    public void setMeetingList(List<Meeting> meetingList) {
        this.meetingList = meetingList;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean addMeeting(Meeting addedMeeting) {
        for (int i = 0; i < meetingList.size(); i++) {
            if (meetingList.get(i).equals(addedMeeting))
                System.out.println("Meeting already exists!");
            return false;
        }
        meetingList.add(addedMeeting);
        return true;
    }

    public boolean deleteMeeting(Meeting meetingToDelete) {
        for (int i = 0; i < meetingList.size(); i++) {
            if (meetingList.get(i).equals(meetingToDelete))
                return true;
        }
        throw new IllegalArgumentException("Meeting does not exist!");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalendarDay that = (CalendarDay) o;
        return Objects.equals(meetingList, that.meetingList) &&
                Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meetingList, date);
    }

    @Override
    public String toString() {
        return "CalendarDay{" +
                "meetingList=" + meetingList +
                ", date=" + date +
                '}';
    }
}
