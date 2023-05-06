package com.paf.profile.controller;

import com.paf.profile.common.dto.request.FoodProfileRequest;
import com.paf.profile.common.dto.response.CommonResponse;
import com.paf.profile.common.entity.FoodProfile;
import com.paf.profile.service.ProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * controller.
 *
 * @author DULMI
 */
@RestController
@RequestMapping("/user-profile")
public class ProfileController {
    private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);
    @Autowired
    private ProfileService profileService;


    @GetMapping(value = "/{username}")
    public CommonResponse getUserProfile(@PathVariable("username") String username) {
        FoodProfile user = profileService.getUserProfile(username);
        logger.info("get profile. Request: {}", user);
        CommonResponse response = new CommonResponse();
        response.setResponse(user);
        response.setStatus(HttpStatus.OK);
        return response;
    }

    @PostMapping(value = "/create")
    public CommonResponse saveOrUpdate(@RequestBody FoodProfileRequest request) {
        profileService.updateSaveUserProfile(request);
        logger.info(" profile. Request: {}");
        CommonResponse response = new CommonResponse();
        response.setStatus(HttpStatus.OK);
        return response;
    }


    @DeleteMapping(value = "/delete{id}")
    public CommonResponse deleteProfile(@RequestParam("id") Integer id) {
        profileService.deleteProfile(id);
        logger.info(" delete profile. Request: {}");
        CommonResponse response = new CommonResponse();
        response.setStatus(HttpStatus.OK);
        return response;
    }


}
