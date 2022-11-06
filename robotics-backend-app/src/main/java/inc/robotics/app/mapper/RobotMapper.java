package inc.robotics.app.mapper;

import inc.robotics.app.model.dto.RobotDto;
import inc.robotics.app.model.entity.Robot;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Copyright 2022 @asharn
 * @author Ashish Karn
 * @updated_at 2022-11-04T22:21:53+0530
 * @created_at 2022-11-04T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Mapper(componentModel = "spring")
public interface RobotMapper{
    List<RobotDto> map(List<Robot> robos);

    Robot robotDtpToRobot(RobotDto robotDto);
    RobotDto robotToRobotDto(Robot robot);

}
