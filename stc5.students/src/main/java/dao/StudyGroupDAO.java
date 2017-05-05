package dao;

import models.StudyGroup;

import java.util.List;

/**
 * Created by PoGo on 20.04.2017.
 */
public interface StudyGroupDAO {
    public List<StudyGroup> getAll();
    public StudyGroup get(Integer id);
}
