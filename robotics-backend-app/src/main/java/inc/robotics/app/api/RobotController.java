package inc.robotics.app.api;

import inc.robotics.app.contants.RestURIConstants;
import inc.robotics.app.model.request.RobotRequest;
import inc.robotics.app.model.response.ApiResponse;
import inc.robotics.app.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright 2022 @asharn
 * @author Ashish Karn
 * @updated_at 2022-11-04T22:21:53+0530
 * @created_at 2022-11-04T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@RestController
public class RobotController {

    @Autowired
    private RobotService robotService;

    @GetMapping("/")
    public ResponseEntity<String> defaultMethod() {
        return new ResponseEntity<>("Welcome to the Robotic Inc...!!!", HttpStatus.OK);
    }

    @GetMapping(RestURIConstants.ROBOT)
    public ResponseEntity<ApiResponse> getRobots() {
        ApiResponse apiResponse =  new ApiResponse();
        apiResponse.setStatusCode(1000);
        apiResponse.setStatusMessage("Success");
        apiResponse.setData(robotService.getRobot());
        return new ResponseEntity<>(apiResponse,HttpStatus.OK);
    }

    @GetMapping(RestURIConstants.ROBOT+RestURIConstants.ID)
    public ResponseEntity<ApiResponse> getRobotById(@PathVariable Integer id) {
        ApiResponse apiResponse =  new ApiResponse();
        apiResponse.setStatusCode(1000);
        apiResponse.setStatusMessage("Success");
        apiResponse.setData(robotService.getRobotById(id));
        return new ResponseEntity<>(apiResponse,HttpStatus.OK);
    }


    @PostMapping(value = RestURIConstants.ROBOT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> addRobot(@RequestBody RobotRequest robotRequest) {
        ApiResponse apiResponse = robotService.addRobot(robotRequest);
        return new ResponseEntity<>(apiResponse,apiResponse.getStatusCode()==1000?HttpStatus.OK:HttpStatus.NOT_ACCEPTABLE);
    }

    @PutMapping(value = RestURIConstants.ROBOT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ApiResponse> updateRobot(@RequestBody RobotRequest robotRequest) {
        ApiResponse apiResponse = robotService.updateRobot(robotRequest);
        return new ResponseEntity<>(apiResponse,apiResponse.getStatusCode()==1000?HttpStatus.OK:HttpStatus.NOT_ACCEPTABLE);
    }


    @DeleteMapping(RestURIConstants.ROBOT+RestURIConstants.ID)
    public ResponseEntity<ApiResponse> deleteRobotById(@PathVariable Integer id) {
        ApiResponse apiResponse =  new ApiResponse();
        apiResponse.setStatusCode(1000);
        apiResponse.setStatusMessage("Success");
        apiResponse.setData(robotService.deleteRobotById(id));
        return new ResponseEntity<>(apiResponse,HttpStatus.OK);
    }


}
