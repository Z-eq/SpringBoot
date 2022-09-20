package com.example.exercise23.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Car {

    @Id
    private int carId;
    private String regNumber;
    private String brand;
    private String model;
    private LocalDate regDate;
    @ManyToOne
    @JoinColumn(name = "owner_user_id")
    private AppUser owner;

    public Car() {
    }

    public Car(int carId, String regNumber, String brand, String model, LocalDate regDate, AppUser owner) {
        this.carId = carId;
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.regDate = regDate;
        this.owner = owner;
    }

    public int getcarId() {
        return carId;
    }

    public void setcarId(int carId) {
        this.carId = carId;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public AppUser getOwner() {
        return owner;
    }

    public void setOwner(AppUser owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getcarId() == car.getcarId() && Objects.equals(getRegNumber(), car.getRegNumber()) && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getRegDate(), car.getRegDate()) && Objects.equals(getOwner(), car.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getcarId(), getRegNumber(), getBrand(), getModel(), getRegDate(), getOwner());
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", regNumber='" + regNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", regDate=" + regDate +
                ", owner=" + owner +
                '}';
    }
}
