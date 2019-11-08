package ru.tatiana.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
//import ru.tatiana.entity.MyDB;
import ru.tatiana.mapper.DbMapper;


import java.util.List;

//public class DbDaoImpl implements DbDao {
//
//    public final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public DbDaoImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    public List<MyDB> findAll() {
//        String sql = "SELECT * FROM users";
//        return jdbcTemplate.query(sql, new DbMapper());
//    }
//
//    public void save_new(MyDB myDB) {
//        String postgres = "INSERT INTO users(task, priority, status) VALUES (?, ?, ?)";
//        jdbcTemplate.update(postgres, myDB.getTask(), myDB.getPriority(), myDB.getStatus());
//    }
//
//
//    public MyDB getById(int id) {
//        String postgres = "SELECT * FROM users WHERE id=?";
//        return jdbcTemplate.queryForObject(postgres, new DbMapper(), id);
//    }
//
//
//    public void update(MyDB myDB) {
//        String postgres = "UPDATE users SET task=?, priority=?, status=? WHERE id =?";
//        jdbcTemplate.update(postgres, myDB.getTask(), myDB.getPriority(), myDB.getStatus(), myDB.getId());
//
//    }
//
//
//    public void delete(int id) {
//        String postgres = "DELETE FROM users WHERE id=?";
//        jdbcTemplate.update(postgres, id);
//    }
//}
