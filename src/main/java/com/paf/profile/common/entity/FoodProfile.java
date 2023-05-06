package com.paf.profile.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * data table.
 *
 * @author DULMI
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_food_profile")
public class FoodProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "username")
    private String username;
    @Column(name = "bio")
    private String bio;
    @Column(name = "age")
    private int age;
    @Column(name = "location")
    private String location;
    @Column(name = "profilePictureUrl")
    private String profilePictureUrl;

    @Column(name = "created_by")
    private Integer createdBy;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_by")
    private Integer updatedBy;

    @UpdateTimestamp
    @Column(name = "updated_at", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}
