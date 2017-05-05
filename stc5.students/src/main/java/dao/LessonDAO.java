package dao;

import models.Lesson;

import java.util.List;

/**
 * Created by PoGo on 20.04.2017.
 */
public interface LessonDAO {
    public List<Lesson> getAll();
    public Lesson get(Integer id);
}
