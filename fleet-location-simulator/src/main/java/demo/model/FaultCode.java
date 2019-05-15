package demo.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class FaultCode {

    private String engineMake;
    private String faultCode;
    private String faultCodeId;
    private String faultCodeClassification;
    private String description;
    private String repairInstructions;
    private String fmi;
    private String sa;
    private String spn;

    public FaultCode() {

    }

    public String getEngineMake() {
        return engineMake;
    }

    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    public String getFaultCode() {
        return faultCode;
    }

    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    public String getFaultCodeId() {
        return faultCodeId;
    }

    public void setFaultCodeId(String faultCodeId) {
        this.faultCodeId = faultCodeId;
    }

    public String getFaultCodeClassification() {
        return faultCodeClassification;
    }

    public void setFaultCodeClassification(String faultCodeClassification) {
        this.faultCodeClassification = faultCodeClassification;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRepairInstructions() {
        return repairInstructions;
    }

    public void setRepairInstructions(String repairInstructions) {
        this.repairInstructions = repairInstructions;
    }

    public String getFmi() {
        return fmi;
    }

    public void setFmi(String fmi) {
        this.fmi = fmi;
    }

    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa;
    }

    public String getSpn() {
        return spn;
    }

    public void setSpn(String spn) {
        this.spn = spn;
    }
}
