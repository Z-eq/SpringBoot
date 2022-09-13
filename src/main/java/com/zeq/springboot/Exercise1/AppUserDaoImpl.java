package com.zeq.springboot.Exercise1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class AppUserDaoImpl implements AppUserDao {

    @PersistenceContext
    private EntityManager entityManager;

    //


    @Override
    public AppUser persist(AppUser appuser) {
        return null;
    }

    @Override
    public Optional findById(int userId) {
        if (userId <=0) throw new IllegalArgumentException(" Appuser is null");
        AppUser appUser = entityManager.find(AppUser.class, userId);  // To find by ID only - Ex SELECT  FROM appuser WHERE ID = ?
        return Optional.ofNullable(appUser);
    }

    @Override
    public List<AppUser> findAll() {
        return null;
    }

    @Override
    public List<AppUser> findByFirstName(String firstName) {
        return null;
    }

    @Override
    public void remove(AppUser appuser) {

    }
    @Transactional
    @Override
    public AppUser save(AppUser appuser) {

        if (appuser == null) throw new IllegalArgumentException( "appuser not found");
        entityManager.persist(appuser);
        return appuser;
    }


}



