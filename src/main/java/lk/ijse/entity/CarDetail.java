package lk.ijse.entity;


import javax.persistence.*;

@Entity
@Table(name = "CarDetail")
public class CarDetail {

    @Id
    @GeneratedValue()
    @Column(name = "carId")
    private Integer carId;

    @Column(name = "carName")
    private String carName;

    public CarDetail() {
    }

    public CarDetail(String carName) {
        this.carName = carName;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "CarDetail{" +
                "carId=" + carId +
                ", carName='" + carName + '\'' +
                '}';
    }
}
