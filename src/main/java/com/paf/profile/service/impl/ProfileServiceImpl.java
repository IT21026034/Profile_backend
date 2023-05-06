package com.paf.profile.service.impl;

import com.paf.profile.common.dto.request.FoodProfileRequest;
import com.paf.profile.common.entity.FoodProfile;
import com.paf.profile.repository.ProfileRepository;
import com.paf.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Optional;

/**
 * application business logic impl.
 *
 * @author DULMI
 */
@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileRepository repository;


    @Override
    public FoodProfile getUserProfile(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public void updateSaveUserProfile(FoodProfileRequest request) {
        Optional<FoodProfile> foodProfile = repository.findById(request.getId());
        FoodProfile profile;
        if (ObjectUtils.isEmpty(foodProfile)) {

            profile = dtoMapper(request);
        } else {
            profile = dtoMapper(request);
        }
        repository.save(profile);
    }

    @Override
    public void deleteProfile(Integer id) {
        repository.deleteById(id);
    }

    private FoodProfile dtoMapper(FoodProfileRequest request) {
        FoodProfile profile = new FoodProfile();
        profile.setAge(request.getAge());
        profile.setLocation(request.getLocation());
        profile.setBio(request.getBio());
        profile.setProfilePictureUrl(request.getProfilePictureUrl());
        profile.setCreatedBy(request.getCreatedBy());
        profile.setUsername(request.getUsername());
        profile.setUserId(request.getUserId());
        return profile;
    }

}
