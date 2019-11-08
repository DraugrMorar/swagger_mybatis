package ru.tatiana.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.tatiana.entity.MyDB;
import ru.tatiana.mapper.DbMapper;
//import ru.tatiana.entity.MyDB;
//import ru.tatiana.service.DbService;

import java.util.List;


//@RestController
//@RequestMapping("/")
//@Api(value="toDo", description = "operations")
//public class Controller {
//
//    @Autowired
//    public DbService dbService;
//
//    @GetMapping ("/toDoList")
//    @ApiOperation(value="Show all to do list")
//    public List<MyDB> getInfo(){
//        List<MyDB> res = dbService.findAll();
//        return res;
//    }
//
//    @GetMapping ("/task/{id}")
//    @ApiOperation(value = "show one task")
//    public MyDB getById(@PathVariable("id") int id){
//        MyDB res = dbService.getById(id);
//        return res;
//    }
//
//    @PostMapping("/addTask")
//    @ApiOperation(value = "add task")
//    public MyDB addTask(@ModelAttribute("user") MyDB myDB) throws Exception {
//        dbService.save_new(myDB);
//        return myDB;
//    }
//
//    @DeleteMapping("/delete/{id}")
//    @ApiOperation(value = "delete task")
//    public void deleteTask(@PathVariable("id") int id){
//        dbService.delete(id);
//    }
//
//    @PostMapping("/updateTask")
//    @ApiOperation(value = "Update to do list")
//    public void updateUser(@ModelAttribute("user") MyDB myDB){
//        dbService.update(myDB);
//    }
//
//}



@RestController
@RequestMapping("/")
@Api(value="toDo", description = "operations")
public class Controller {

//    @Autowired
//    public DbService dbService;

    private DbMapper dbMapper;

    public Controller(DbMapper dbMapper){
        this.dbMapper = dbMapper;
    }

    @GetMapping ("/toDoList")
    @ApiOperation(value="Show all to do list")
    public List<MyDB> getInfo(){
        return dbMapper.findAll();
    }

}