package main.model.pojo;

/**
 *
 */
public class Journal {

    private long id;
    private Lesson lesson;
    private long lessonId;
    private Student student;
    private long studentId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public long getLessonId() {
        return lessonId;
    }

    public void setLessonId(long lessonId) {
        this.lessonId = lessonId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}
