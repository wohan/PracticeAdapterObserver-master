package models;

/**
 * Created by PoGo on 20.04.2017.
 */
public class Journal {

    private Integer id;
    private Integer lessonId;
    private Integer StudentId;

    public Journal(Integer id, Integer lessonId, Integer studentId) {
        this.id = id;
        this.lessonId = lessonId;
        StudentId = studentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLessonId() {
        return lessonId;
    }

    public void setLessonId(Integer lessonId) {
        this.lessonId = lessonId;
    }

    public Integer getStudentId() {
        return StudentId;
    }

    public void setStudentId(Integer studentId) {
        StudentId = studentId;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "id=" + id +
                ", lessonId=" + lessonId +
                ", StudentId=" + StudentId +
                '}';
    }
}
