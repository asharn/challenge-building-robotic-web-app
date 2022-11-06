package inc.robotics.app.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
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
@Entity
@Table(name = "robot")
public class Robot implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Temporal(TemporalType.DATE)
    private Date buildAt;
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
    private Integer mass;
    private String color;
    private String state;
    @Column(name = "is_light_sensing", columnDefinition = "TINYINT", nullable = false)
    private Boolean isLightSensing;
    @Column(name = "is_sound_sensing", columnDefinition = "TINYINT", nullable = false)
    private Boolean isSoundSensing;
    @Column(name = "is_temperature_sensing", columnDefinition = "TINYINT", nullable = false)
    private Boolean isTemperatureSensing;
    @Column(name = "is_pressure_sensing", columnDefinition = "TINYINT", nullable = false)
    private Boolean isPressureSensing;
    @Column(name = "is_mobility_degree_of_freedom", columnDefinition = "TINYINT", nullable = false)
    private Boolean isMobilityDegreeOfFreedom;

}
