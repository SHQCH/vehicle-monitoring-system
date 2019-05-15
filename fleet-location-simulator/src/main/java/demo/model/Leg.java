package demo.model;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Leg {
    private Integer id;
    private Point startPosition;
    private Point endPosition;
    private Double length;
    private Double heading;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Point getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Point startPosition) {
        this.startPosition = startPosition;
    }

    public Point getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Point endPosition) {
        this.endPosition = endPosition;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeading() {
        return heading;
    }

    public void setHeading(Double heading) {
        this.heading = heading;
    }
}