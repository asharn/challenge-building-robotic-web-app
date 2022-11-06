package inc.robotics.app.service.impl;

import inc.robotics.app.mapper.RobotMapper;
import inc.robotics.app.model.dto.RobotDto;
import inc.robotics.app.model.entity.Robot;
import inc.robotics.app.repository.RobotRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class RobotServiceImplUnitTest {

    public RobotServiceImplUnitTest() {
        super();
    }

    @InjectMocks
    private RobotServiceImpl robotServiceImpl;

    @Mock
    private RobotRepository robotRepository;

    @Mock
    private RobotMapper robotMapper;

    @Test
    public void getMatches(){
        List<Robot> robots = getRobot(3);
        when(robotRepository.findAll()).thenReturn(robots);
        List<RobotDto> robotDtos = robotServiceImpl.getRobot();
        Assert.assertNotNull(robotDtos);
        Assert.assertEquals(robots.size(), robotDtos.size());
    }

    @Test
    public void getMatchesByRound(){
        List<Robot> robots = getRobot(1);
        when(robotRepository.findById(1)).thenReturn(Optional.ofNullable(robots.get(0)));
        RobotDto robotDto = robotServiceImpl.getRobotById(1);
        Assert.assertNotNull(robotDto);
    }

    /**
     * This method will help to create Robot related DTO Objects.
     * @return List<RobotDto>
     * @param mass int
     */
    private List<Robot> getRobot(int mass) {
        List<Robot> robots = new ArrayList<>();
        Robot robot = new Robot();
        robot.setId(1);
        robots.add(robot);
        return robots;
    }

}
