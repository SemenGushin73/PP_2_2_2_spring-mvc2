package web.model;

import java.util.Objects;

public class Car {

    private String model;

    private String color;

    private String plate;

    public Car() {
    }

    public Car(String model, String color, String plate) {
        this.model = model;
        this.color = color;
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", plate='" + plate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(plate, car.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, plate);
    }
}