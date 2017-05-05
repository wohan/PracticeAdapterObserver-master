package main.service;
import main.models.pojo.Admin;
import java.util.List;

/**
 * Created by admin on 22.04.2017.
 */
public interface AdminService {
    Admin getAdmin (int id);

    List<Admin> getAll();

    void update(Admin admin);

    void delete(Admin admin);

    Integer insert(Admin admin);

    Integer passwordVerification(String adminName, String passName);
}
