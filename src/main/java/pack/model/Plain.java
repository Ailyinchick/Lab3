package pack.model;

import javax.persistence.*;

@Entity
public class Plain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int(11) default 0")
    private int id;
    private int capacity;
    private int c_capacity;
    private int flyrange;
    private int fuelconsume;
    private String type;


    public static Plain getBigPlain() {
        return new Plain(200, 300, 600, 30, "Big");
    }

    public static Plain getSmallPlain() {
        return new Plain(100, 150, 300, 15, "Small");
    }

    private Plain(int capacity, int c_capacity, int flyrange, int fuelconsume, String type) {
        this.capacity = capacity;
        this.c_capacity = c_capacity;
        this.flyrange = flyrange;
        this.fuelconsume = fuelconsume;
        this.type = type;
    }

    public Plain() {
    }

    @Override
    public String toString() {
        return "Plain{" +
                "id=" + id +
                ", capasity=" + capacity +
                ", c_capasity=" + c_capacity +
                ", flyrange=" + flyrange +
                ", fuelconsume=" + fuelconsume +
                ", type='" + type + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapasity() {
        return capacity;
    }

    public void setCapasity(int capasity) {
        this.capacity = capasity;
    }

    public int getC_capasity() {
        return c_capacity;
    }

    public void setC_capasity(int c_capasity) {
        this.c_capacity = c_capasity;
    }

    public int getFlyrange() {
        return flyrange;
    }

    public void setFlyrange(int flyrange) {
        this.flyrange = flyrange;
    }

    public int getFuelconsume() {
        return fuelconsume;
    }

    public void setFuelconsume(int fuelconsume) {
        this.fuelconsume = fuelconsume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
