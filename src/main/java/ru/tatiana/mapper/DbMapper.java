package ru.tatiana.mapper;

import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;
import org.springframework.jdbc.core.RowMapper;
import ru.tatiana.entity.MyDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Mapper
//public class DbMapper implements RowMapper<MyDB> {
//    public MyDB mapRow(ResultSet resultSet, int i) throws SQLException{
//        MyDB myDB = new MyDB();
//
//        myDB.setId(resultSet.getInt("id"));
//        myDB.setPriority(resultSet.getString("priority"));
//        myDB.setStatus(resultSet.getString("status"));
//        myDB.setTask(resultSet.getString("task"));
//        return myDB;
//    }
//}

public interface DbMapper{
    MyDB myDb = new MyDB();
    public Integer id = myDb.getId();
    public String task = myDb.getTask();
    public String priority = myDb.getPriority();
    public String status = myDb.getStatus();

    @Select("select * from users")
    List<MyDB> findAll();

    @Select("select * from users where id=#{id}")
    MyDB getById(int id);

//    @Select("INSERT INTO users(task, priority, status) VALUES (?, ?, ?)")
//    void save_new(MyDB myDB);
//
//    @Select("UPDATE users SET task=#{task}, priority=#{priority}, status=#{status} WHERE id =#{id}")
//    void update(MyDB myDB);

    @Select("DELETE FROM users WHERE id=#{id}")
    void delete(int id);
}