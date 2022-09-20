package com.zeq.springboot.Exercise1;

import com.zeq.springboot.data.AppUserDao;
import com.zeq.springboot.entity.AppUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase (replace = AutoConfigureTestDatabase.Replace.NONE) //COnfigures TEt DB
    @AutoConfigureTestEntityManager
@DirtiesContext
@Transactional
class AppUserDaoImplTest {
    @Autowired
    AppUserDao appUserDao;

    @Autowired
    TestEntityManager entityManager;


    @Test
    void save() {

        AppUser appuser = new AppUser("Test1", "Test",
                "testsson", LocalDate.parse("1900-01-01"), true);

        appUserDao.save(appuser);

        assertNotEquals(0, appuser.getuserId());

    }

    @Test
    void findById() {

        AppUser appuser = new AppUser( "Test22","t1","t2",LocalDate.MAX,false);

        entityManager.persist(appuser);
        entityManager.clear();
        int id= appuser.getuserId();


        Optional<AppUser> appUserDaoById = appUserDao.findById(id);

        assertTrue(appUserDaoById.isPresent());
        assertEquals(id,appUserDaoById.get().getuserId());
    }
}