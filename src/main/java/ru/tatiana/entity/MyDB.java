package ru.tatiana.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

//@Entity
//@Table(name="users")
//public class MyDB {
//
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @Column(name = "task")
//    @ApiModelProperty(value = "task", example="to do")
//    private String task;
//    @Column(name = "priority")
//    @ApiModelProperty(value= "priority", example="low")
//    private String priority;
//    @Column(name = "status")
//    @ApiModelProperty(value="status", example="done")
//    private String status;
//
//    public MyDB() { }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTask() {
//        return task;
//    }
//
//    public void setTask(String task) {
//        this.task = task;
//    }
//
//    public String getPriority() {
//        return priority;
//    }
//
//    public void setPriority(String priority) {
//        this.priority = priority;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//}



//@Entity
//@Table(name="users")
public class MyDB {

//
    private Integer id;
    @ApiModelProperty(value = "task", example="to do")
    private String task;
    @ApiModelProperty(value= "priority", example="low")
    private String priority;
    @ApiModelProperty(value="status", example="done")
    private String status;

    public MyDB() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}