package inc.robotics.app.model.request;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.Date;

@Data
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class RobotRequest {
    private Integer id;
    private String name;
    private Integer mass;
    private String color;
    private String state;
    private Date buildAt;
    private Date updatedAt;
    private Boolean isLightSensing;
    private Boolean isSoundSensing;
    private Boolean isTemperatureSensing;
    private Boolean isPressureSensing;
    private Boolean isMobilityDegreeOfFreedom;
}
