package inc.robotics.app.service;

import inc.robotics.app.model.dto.RobotDto;
import inc.robotics.app.model.request.RobotRequest;
import inc.robotics.app.model.response.ApiResponse;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Copyright 2022 @asharn
 * @author Ashish Karn
 * @updated_at 2022-11-04T22:21:53+0530
 * @created_at 2022-11-04T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Service
public interface RobotService {
    List<RobotDto> getRobot();
    RobotDto getRobotById(Integer id);
    ApiResponse addRobot(RobotRequest robotRequest);

    ApiResponse updateRobot(RobotRequest robotRequest);

    String deleteRobotById(Integer id);
}
