package inc.robotics.app.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.Date;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RobotRequest {
    private Integer id;
    private String name;
    private Integer mass;
    private String color;
    private Date buildAt;
    private Date updatedAt;
    private Boolean isLightSensing;
    private Boolean isSoundSensing;
    private Boolean isTemperatureSensing;
    private Boolean isPressureSensing;
    private Boolean isMobilityDegreeOfFreedom;
}
