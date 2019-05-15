package demo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceLocation {

    private String id;
    private String address1;
    private String address2;
    private String city;
    @JsonUnwrapped
    private final Point point;
    private String location;
    private String state;
    private String zip;
    private String type;

    @SuppressWarnings("unused")
    private ServiceLocation() {
        this.point = new Point(0d, 0d);
    }

    @JsonCreator
    public ServiceLocation(@JsonProperty("latitude") Double latitude, @JsonProperty("longitude") Double longitude) {
        this.point = new Point(latitude, longitude);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setType(String type) {
        this.type = type;
    }
}
