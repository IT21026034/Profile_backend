package com.paf.profile.repository;

import com.paf.profile.common.entity.FoodProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * application data handle.
 *
 * @author DULMI
 */
@EnableJpaRepositories
public interface ProfileRepository extends JpaRepository<FoodProfile, Integer> {
    FoodProfile findByUsername(String username);

}
