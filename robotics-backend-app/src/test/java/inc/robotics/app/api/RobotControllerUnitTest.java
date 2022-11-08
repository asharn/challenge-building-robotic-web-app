package inc.robotics.app.api;

import inc.robotics.app.model.dto.RobotDto;
import inc.robotics.app.model.response.ApiResponse;
import inc.robotics.app.service.RobotService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class RobotControllerUnitTest {

    @InjectMocks
    private RobotController robotController;

    @Mock
    private RobotService robotService;

    @Test
    public void getRobots(){
        List<RobotDto> robotDtos = getRobotDtos(3);
        when(robotService.getRobot()).thenReturn(robotDtos);
        ResponseEntity<ApiResponse> response = robotController.getRobots();
        Assert.assertNotNull(response);
        Assert.assertSame(robotDtos, Objects.requireNonNull(response.getBody()).getData());
    }

    @Test
    public void getRobotById(){
        List<RobotDto> robotDtos = getRobotDtos(1);
        when(robotService.getRobotById(1)).thenReturn(robotDtos.get(0));
        ResponseEntity<ApiResponse> response = robotController.getRobotById(1);
        Assert.assertNotNull(response);
        Assert.assertSame(robotDtos.get(0), Objects.requireNonNull(response.getBody()).getData());
    }

    /**
     * This method will help to create Robot related DTO Objects.
     * @return List<RobotDto>
     * @param round int
     */
    private List<RobotDto> getRobotDtos(int round) {
        List<RobotDto> robotDtos = new ArrayList<>();
        RobotDto robotDto = new RobotDto();
        robotDto.setId(1);
        robotDtos.add(robotDto);
        return robotDtos;
    }

}
