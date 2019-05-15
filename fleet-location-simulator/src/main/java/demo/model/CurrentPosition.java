package demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CurrentPosition {

    private String vin;
    private Point location;
    private VehicleStatus vehicleStatus = VehicleStatus.NONE;
    private Double speed;
    private Double heading;
    private FaultCode faultCode;

    public CurrentPosition(String vin, Point location, VehicleStatus vehicleStatus, Double speed, Double heading, FaultCode faultCode) {
        this.vin = vin;
        this.location = location;
        this.vehicleStatus = vehicleStatus;
        this.speed = speed;
        this.heading = heading;
        this.faultCode = faultCode;
    }
}
