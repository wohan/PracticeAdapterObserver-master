package dao;

import models.Journal;

import java.util.List;

/**
 * Created by PoGo on 20.04.2017.
 */
public interface JournalDAO {
    public List<Journal> getAll();
    public Journal get(Integer id);
}
