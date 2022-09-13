package com.zeq.springboot.Exercise1;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto_increment identity!
    private int userId;
    @Column(nullable = false)
    private String userName;
    @Column(length = 55, nullable = false)
    private String firstName;
    @Column(length = 100)
    private String lastName;

    public AppUser(String userName, String firstName, String lastName, LocalDate birthDate, boolean active) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.active = active;
    }

    private LocalDate birthDate;
    private boolean active;

    private String password;

    public AppUser() {
    }

    public AppUser(int userId, String userName, String firstName, String lastName, LocalDate birthDate, boolean active, String password) {
        this.userId = userId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.active = active;
        this.password = password;
    }

    public int getuserId() {
        return userId;
    }

    public void setuserId(int userId) {
        this.userId = userId;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return getuserId() == appUser.getuserId() && isActive() == appUser.isActive() && Objects.equals(getuserName(), appUser.getuserName()) && Objects.equals(getFirstName(), appUser.getFirstName()) && Objects.equals(getLastName(), appUser.getLastName()) && Objects.equals(getBirthDate(), appUser.getBirthDate()) && Objects.equals(getPassword(), appUser.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getuserId(), getuserName(), getFirstName(), getLastName(), getBirthDate(), isActive(), getPassword());
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", active=" + active +
                ", password='" + password + '\'' +
                '}';
    }
}

