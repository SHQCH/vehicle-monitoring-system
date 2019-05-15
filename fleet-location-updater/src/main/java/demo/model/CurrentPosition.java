package demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CurrentPosition {

	private String vin;
	private Point location;
	private VehicleStatus vehicleStatus = VehicleStatus.NONE;
	private Double speed;
	private Double heading;
	private FaultCode faultCode;
	private ServiceLocation serviceLocation;

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public VehicleStatus getVehicleStatus() {
		return vehicleStatus;
	}

	public void setVehicleStatus(VehicleStatus vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public Double getHeading() {
		return heading;
	}

	public void setHeading(Double heading) {
		this.heading = heading;
	}

	public FaultCode getFaultCode() {
		return faultCode;
	}

	public void setFaultCode(FaultCode faultCode) {
		this.faultCode = faultCode;
	}

	public ServiceLocation getServiceLocation() {
		return serviceLocation;
	}

	public void setServiceLocation(ServiceLocation serviceLocation) {
		this.serviceLocation = serviceLocation;
	}
}
