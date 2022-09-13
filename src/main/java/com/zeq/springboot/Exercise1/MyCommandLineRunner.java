package com.zeq.springboot.Exercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;

@Transactional
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from springboot");

        AppUser appuser = new AppUser("Zeq9", "Zeq", "Alidemaj",
                LocalDate.parse("1980-06-25"),true);

        entityManager.persist(appuser);
        System.out.println(appuser);


    }
}
