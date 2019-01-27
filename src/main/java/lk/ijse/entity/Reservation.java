package lk.ijse.entity;


import javax.persistence.*;

@Entity
@Table(name = "Reservation")
public class Reservation {
    @Id
    @GeneratedValue
    @Column(name = "reservationId")
    private Integer reservationId;

    @Column(name = "custName")
    private  Integer custName;

    @Column(name = "tel")
    private String tel;

    @Column(name = "fromDate")
    private String fromDate;

    @Column(name = "pickUpTime")
    private String pickUpTime;

    public Reservation() {
    }

    public Reservation(Integer custName, String tel, String fromDate, String pickUpTime) {
        this.custName = custName;
        this.tel = tel;
        this.fromDate = fromDate;
        this.pickUpTime = pickUpTime;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public Integer getCustName() {
        return custName;
    }

    public void setCustName(Integer custName) {
        this.custName = custName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", custName=" + custName +
                ", tel='" + tel + '\'' +
                ", fromDate='" + fromDate + '\'' +
                ", pickUpTime='" + pickUpTime + '\'' +
                '}';
    }
}
