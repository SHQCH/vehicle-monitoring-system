package demo.model;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * POJO to store position of the vehicle and some other data.
 */

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class PositionInfo {

    private String vin;
    private Point position;
    private VehicleStatus vehicleStatus = VehicleStatus.NONE;

    /**
     * kml path is composed of a series of legs (line segments) 1 .. n.
     * this member denotes the present leg (starting at leg 0)
     */
    private Leg leg;

    /**
     * Meters from start of leg
     */
    private Double distanceFromStart;

    /**
     * The speed in m/s
     */
    private Double speed;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Double getDistanceFromStart() {
        return distanceFromStart;
    }

    public void setDistanceFromStart(Double distanceFromStart) {
        this.distanceFromStart = distanceFromStart;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }
}
