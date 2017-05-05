package main.service;
import static main.models.ConnectionBase.initConnection;
import main.models.dao.AdminDAO;
import main.models.dao.AdminDAOImpl;
import main.models.pojo.Admin;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 22.04.2017.
 */
public class AdminServiceImpl implements AdminService {

    static {
        PropertyConfigurator.configure("log4j.properties");
    }

    Connection connection = initConnection();
    private static final Logger logger = Logger.getLogger(AdminServiceImpl.class);

    @Autowired
    public AdminServiceImpl() {
    }

    public Integer passwordVerification(String adminName, String passName) {
        AdminService adminService = new AdminServiceImpl();
        List<Admin> admins;
        admins = adminService.getAll();
        for (Admin admin: admins){
        if(adminName.equals(admin.getUser_name())){
            if (passName.equals(admin.getUser_pass())){
                return 1; //авторизация успешна
            }
            else {
                return 2; //пароль не верный
            }
        }
    }
        return 3; //пользователь не найден.
}


    public Admin getAdmin (int id) {
        AdminDAO adminDAO = new AdminDAOImpl();
        Admin admin = adminDAO.getById(id);
        return admin;
    }

    public List<Admin> getAll() {
        AdminDAO adminDAO = new AdminDAOImpl();
        List<Admin> admins = new ArrayList<Admin>();
        admins = adminDAO.getAll();
        return admins;
    }

    public void update(Admin admin) {
        AdminDAO adminDAO = new AdminDAOImpl();
        adminDAO.update(admin);
    }

    public void delete(Admin admin) {
        AdminDAO adminDAO = new AdminDAOImpl();
        adminDAO.delete(admin);
    }

    public Integer insert(Admin admin) {
        AdminDAO adminDAO = new AdminDAOImpl();
        return adminDAO.insert(admin);
    }
}
