package org.example.data;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

public class Meeting implements Serializable {

    private LocalTime startTime;
    private LocalTime endTime;
    private String description;
    private String title;

    public Meeting(LocalTime startTime, LocalTime endTime, String description, String title) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.title = title;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meeting meeting = (Meeting) o;
        return Objects.equals(startTime, meeting.startTime) &&
                Objects.equals(endTime, meeting.endTime) &&
                Objects.equals(description, meeting.description) &&
                Objects.equals(title, meeting.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, description, title);
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
