package com.paf.profile.service;

import com.paf.profile.common.dto.request.FoodProfileRequest;
import com.paf.profile.common.entity.FoodProfile;

/**
 * application business logic.
 *
 * @author DULMI
 */
public interface ProfileService {
    FoodProfile getUserProfile(String username);

    void updateSaveUserProfile(FoodProfileRequest request);

    void deleteProfile(Integer id);

}