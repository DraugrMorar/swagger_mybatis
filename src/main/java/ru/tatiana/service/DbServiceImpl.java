package ru.tatiana.service;

import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import ru.tatiana.dao.DbDao;
import ru.tatiana.entity.MyDB;
import java.util.List;

//@Service
//
//public class DbServiceImpl implements DbService {
//
//    @Autowired
//    public DbDao dbDao;
//
//    public List<MyDB> findAll() {
//        return dbDao.findAll();
//    }
//
//    public void save_new(MyDB user) { dbDao.save_new(user); }
//
//
//    public MyDB getById(int id) {
//        return dbDao.getById(id);
//    }
//
//
//    public void update(MyDB user) {
//        dbDao.update(user);
//    }
//
//
//    public void delete(int id) {
//        dbDao.delete(id);
//    }
//}
