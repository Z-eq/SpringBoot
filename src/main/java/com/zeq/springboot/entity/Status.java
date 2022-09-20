package com.zeq.springboot.entity;

import java.util.Collection;
import java.util.Objects;

public class Status {

    private int statusId;
    private String statusCode;
    private Collection<Car> ownedCars;

    public Status() {
    }

    public Status(int statusId, String statusCode, Collection<Car> ownedCars) {
        this.statusId = statusId;
        this.statusCode = statusCode;
        this.ownedCars = ownedCars;
    }

    public Status(String statusCode, Collection<Car> ownedCars) {
        this.statusCode = statusCode;
        this.ownedCars = ownedCars;
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

    public Collection<Car> getOwnedCars() {
        return ownedCars;
    }

    public void setOwnedCars(Collection<Car> ownedCars) {
        this.ownedCars = ownedCars;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Status status = (Status) o;
        return getStatusId() == status.getStatusId() && Objects.equals(getStatusCode(), status.getStatusCode()) && Objects.equals(getOwnedCars(), status.getOwnedCars());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStatusId(), getStatusCode(), getOwnedCars());
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusId=" + statusId +
                ", statusCode='" + statusCode + '\'' +
                ", ownedCars=" + ownedCars +
                '}';
    }
}
