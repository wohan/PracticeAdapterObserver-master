package models;

import java.util.Date;

/**
 * Created by PoGo on 20.04.2017.
 */
public class Lesson {
    private Integer id;
    private Integer studyGroup;
    private Date lessonDate;
    private Integer room;
    private String description;

    public Lesson(Integer id, Integer studyGroup, Date lessonDate, Integer room, String description) {
        this.id = id;
        this.studyGroup = studyGroup;
        this.lessonDate = lessonDate;
        this.room = room;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(Integer studyGroup) {
        this.studyGroup = studyGroup;
    }

    public Date getLessonDate() {
        return lessonDate;
    }

    public void setLessonDate(Date lessonDate) {
        this.lessonDate = lessonDate;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", studyGroup=" + studyGroup +
                ", lessonDate=" + lessonDate +
                ", room=" + room +
                ", description='" + description + '\'' +
                '}';
    }
}
