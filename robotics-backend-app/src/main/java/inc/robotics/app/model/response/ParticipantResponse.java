package inc.robotics.app.model.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
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
public class ParticipantResponse {
    private String firstName;
    private String lastName;
    private String email;
}
