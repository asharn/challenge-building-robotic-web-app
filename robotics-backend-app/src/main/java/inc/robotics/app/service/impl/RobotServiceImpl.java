package inc.robotics.app.service.impl;

import inc.robotics.app.mapper.RobotMapper;
import inc.robotics.app.model.dto.RobotDto;
import inc.robotics.app.model.entity.Robot;
import inc.robotics.app.model.request.RobotRequest;
import inc.robotics.app.model.response.ApiResponse;
import inc.robotics.app.repository.RobotRepository;
import inc.robotics.app.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * Copyright 2022 @asharn
 * @author Ashish Karn
 * @updated_at 2022-11-04T22:21:53+0530
 * @created_at 2022-11-04T22:21:53+0530
 * @since Java-11
 * @version v1.0.0
 */
@Service
public class RobotServiceImpl implements RobotService {

    @Autowired
    private RobotRepository robotRepository;

    @Autowired
    private RobotMapper robotMapper;

    @Override
    public List<RobotDto> getRobot() {
        List<RobotDto> robotDtos = new ArrayList<>();
        List<Robot> robots = (List<Robot>) robotRepository.findAll();
        if(!CollectionUtils.isEmpty(robots)){
            robotDtos = robotMapper.map(robots);
        }
        return robotDtos;
    }

    @Override
    public RobotDto getRobotById(Integer id) {
        RobotDto robotDto = null;
        Optional<Robot> robot = robotRepository.findById(id);
        if(robot.isPresent()){
            robotDto = robotMapper.robotToRobotDto(robot.get());
        }
        return robotDto;
    }

    @Override
    public ApiResponse addRobot(RobotRequest robotRequest) {
        ApiResponse apiResponse =  new ApiResponse();
        apiResponse.setStatusCode(4000);
        apiResponse.setStatusMessage("Fail");
        if(Objects.isNull(robotRequest.getName())){
            apiResponse.setData("Robot name is mandatory.");
        }else if(Objects.isNull(robotRequest.getColor())){
            apiResponse.setData("Robot color is mandatory.");
        }else if(Objects.isNull(robotRequest.getMass())){
            apiResponse.setData("Robot mass is mandatory.");
        }else if(Objects.isNull(robotRequest.getState())){
            apiResponse.setData("Robot state is mandatory.");
        }else{
            RobotDto robotDto = new RobotDto();
            robotDto.setName(robotRequest.getName());
            robotDto.setColor(robotRequest.getColor());
            robotDto.setState(robotRequest.getState());
            robotDto.setMass(robotRequest.getMass());
            robotDto.setBuildAt(new Date());
            robotDto.setUpdatedAt(new Date());
            robotDto.setIsLightSensing(robotRequest.getIsLightSensing());
            robotDto.setIsSoundSensing(robotRequest.getIsSoundSensing());
            robotDto.setIsPressureSensing(robotRequest.getIsPressureSensing());
            robotDto.setIsMobilityDegreeOfFreedom(robotRequest.getIsMobilityDegreeOfFreedom());
            robotDto.setIsTemperatureSensing(robotRequest.getIsTemperatureSensing());
            Robot robot = robotRepository.save(robotMapper.robotDtpToRobot(robotDto));
            apiResponse.setStatusCode(1000);
            apiResponse.setStatusMessage("Success");
            apiResponse.setData(robotMapper.robotToRobotDto(robot));
        }
        return apiResponse;
    }

    @Override
    public ApiResponse updateRobot(RobotRequest robotRequest) {
        ApiResponse apiResponse =  new ApiResponse();
        apiResponse.setStatusCode(4000);
        apiResponse.setStatusMessage("Fail");
        if(Objects.isNull(robotRequest.getId())){
            apiResponse.setData("Robot id is mandatory.");
        }else if(Objects.isNull(robotRequest.getName())){
            apiResponse.setData("Robot name is mandatory.");
        }else if(Objects.isNull(robotRequest.getColor())){
            apiResponse.setData("Robot color is mandatory.");
        }else if(Objects.isNull(robotRequest.getMass())){
            apiResponse.setData("Robot mass is mandatory.");
        }else if(Objects.isNull(robotRequest.getState())){
            apiResponse.setData("Robot state is mandatory.");
        }else if(Objects.isNull(robotRequest.getIsLightSensing())){
            apiResponse.setData("Robot lighting sensing is mandatory.");
        }else if(Objects.isNull(robotRequest.getIsSoundSensing())){
            apiResponse.setData("Robot sound sensing is mandatory.");
        }else if(Objects.isNull(robotRequest.getIsPressureSensing())){
            apiResponse.setData("Robot pressure sensing is mandatory.");
        }else if(Objects.isNull(robotRequest.getIsTemperatureSensing())){
            apiResponse.setData("Robot temperature sensing is mandatory.");
        }else if(Objects.isNull(robotRequest.getIsMobilityDegreeOfFreedom())){
            apiResponse.setData("Robot mobility degree of freedom is mandatory.");
        }else if(!robotRepository.existsById(robotRequest.getId())) {
            apiResponse.setData("Robot id doesn't found in the system.");
        }else{
            Optional<Robot> robotOptional = robotRepository.findById(robotRequest.getId());
            Robot robot = null;
            if(robotOptional.isPresent()){
                robot = robotOptional.get();
                robot.setName(robotRequest.getName());
                robot.setColor(robotRequest.getColor());
                robot.setMass(robotRequest.getMass());
                robot.setState(robotRequest.getState());
                robot.setUpdatedAt(new Date());
                robot.setIsLightSensing(robotRequest.getIsLightSensing());
                robot.setIsSoundSensing(robotRequest.getIsSoundSensing());
                robot.setIsPressureSensing(robotRequest.getIsPressureSensing());
                robot.setIsMobilityDegreeOfFreedom(robotRequest.getIsMobilityDegreeOfFreedom());
                robot.setIsTemperatureSensing(robotRequest.getIsTemperatureSensing());
                robot = robotRepository.save(robot);
            }

            apiResponse.setStatusCode(1000);
            apiResponse.setStatusMessage("Success");
            apiResponse.setData(robotMapper.robotToRobotDto(robot));
        }
        return apiResponse;
    }

    @Override
    public String deleteRobotById(Integer id) {
        if(!robotRepository.existsById(id)) {
            return "Mentioned robots doesn't exist in the system.";
        }else{
            Optional<Robot> robotOptional = robotRepository.findById(id);
            if(robotOptional.isPresent()){
                Robot robot = robotOptional.get();
                robot.setState("DAMAGED");
                robotRepository.save(robot);
            }
            return "Robot deleted successfully.";
        }
    }
}
