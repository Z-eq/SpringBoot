package com.zeq.springboot.data;

import com.zeq.springboot.entity.AppUser;

import java.util.List;
import java.util.Optional;

public interface AppUserDao {

    /** Dao API is used to set function methods **/

    AppUser persist(AppUser appuser);
    Optional findById(int userId);  // Why name Optional ?
    List<AppUser> findAll();
    List<AppUser> findByFirstName( String firstName);
   void remove(AppUser appuser);
    AppUser save(AppUser appuser);



}
