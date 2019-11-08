package ru.tatiana.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.metadata.PostgresTableMetaDataProvider;
//import ru.tatiana.dao.DbDao;
//import ru.tatiana.dao.DbDaoImpl;
//import ru.tatiana.service.DbService;
//import ru.tatiana.service.DbServiceImpl;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//@EnableSwagger2
//@Configuration
//public class SpringConfig {
//    @Bean
//    public JdbcTemplate getJdbcTemplate(){
//        return new JdbcTemplate(getDataSource());
//    }
//
//    @Bean
//    public DataSource getDataSource(){
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
////        Connection con = DriverManager.getConnection();
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/try_swagger");
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("postgres");
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        return dataSource;
//    }
//
//    @Bean
//    public DbDao getDbDao() { return new DbDaoImpl(getJdbcTemplate()); }
//
//}



