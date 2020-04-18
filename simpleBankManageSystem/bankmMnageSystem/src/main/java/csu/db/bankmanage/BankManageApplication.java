package csu.db.bankmanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("csu.db.bankmanage.persistence")
@SpringBootApplication()
public class BankManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankManageApplication.class, args);
    }

}
