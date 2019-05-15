package demo.model;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Denotes a point on the globe.
 */
@Data

public class Point {
    private Double latitude;
    private Double longitude;
    public Point(Double lat, Double longitude) {
        this.latitude = lat;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Point [lat/lang:" + latitude + "," + longitude + "]";
    }

}
