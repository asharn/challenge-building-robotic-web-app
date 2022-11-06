package inc.robotics.app.repository;

import inc.robotics.app.model.entity.Robot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Copyright 2022 @asharn
 * @author Ashish Karn
 * @updated_at 2022-11-04T22:21:53+0530
 * @created_at 2022-11-04T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Repository
public interface RobotRepository extends CrudRepository<Robot,Integer> {
}
