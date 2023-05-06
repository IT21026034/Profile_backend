package com.paf.profile.common.dto.request;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * request profile
 *
 * @author DULMI
 */
@Data
public class FoodProfileRequest {
    private Integer id;
    private Integer userId;
    private String username;
    private String bio;
    private int age;
    private String location;
    private String profilePictureUrl;
    private Integer createdBy;

}
