package com.example.exercise23.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int statusId;
    private String statusCode;

    @ManyToMany(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    @JoinTable(name ="status_cars" ,
        joinColumns = @JoinColumn(name = "status_id"),
        inverseJoinColumns = @JoinColumn(name = "car_id"))


    private Collection<Car> cars;

    public Status() {
    }

    public Status(int statusId, String statusCode, Collection<Car> cars) {
        this.statusId = statusId;
        this.statusCode = statusCode;
        this.cars = cars;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Collection<Car> getCars() {
        return cars;
    }

    public void setCars(Collection<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return Objects.equals(getStatusCode(), status.getStatusCode()) && Objects.equals(getCars(), status.getCars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatusCode(), getCars());
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusId=" + statusId +
                ", statusCode='" + statusCode + '\'' +
                ", cars=" + cars +
                '}';
    }
}
