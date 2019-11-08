package ru.tatiana;

import org.apache.ibatis.type.MappedTypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.tatiana.entity.MyDB;
import tk.mybatis.spring.annotation.MapperScan;

@MappedTypes(MyDB.class)
@MapperScan("ru.tatiana.mapper")
@SpringBootApplication
public class SwaggerMain {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerMain.class, args);
    }
}
