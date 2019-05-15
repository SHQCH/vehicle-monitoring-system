package demo;

import javax.persistence.Embeddable;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * the default unit of vechile locations
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Embeddable
@RequiredArgsConstructor
public class UnitFault {

    private final String vin;
    private Long spn;
    private Long fmi;

    @SuppressWarnings("unused")
    private UnitFault() {
        this.vin = "";
    }

}