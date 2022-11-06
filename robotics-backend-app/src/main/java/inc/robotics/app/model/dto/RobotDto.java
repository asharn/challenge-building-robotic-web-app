package inc.robotics.app.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.Date;

/**
 * Copyright 2022 @asharn
 * @author Ashish Karn
 * @updated_at 2022-11-04T22:21:53+0530
 * @created_at 2022-11-04T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class RobotDto {
    private Integer id;
    private String name;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date buildAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;
    private Integer mass;
    private String color;
    private Boolean isLightSensing;
    private Boolean isSoundSensing;
    private Boolean isTemperatureSensing;
    private Boolean isPressureSensing;
    private Boolean isMobilityDegreeOfFreedom;

}
