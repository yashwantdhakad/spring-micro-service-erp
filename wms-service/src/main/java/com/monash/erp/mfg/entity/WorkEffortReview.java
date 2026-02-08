package com.monash.erp.mfg.entity;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
public class WorkEffortReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String workEffortId;
    private String userLoginId;
    private LocalDateTime reviewDate;
    private String statusId;
    private String postedAnonymous;
    private String rating;
    private String reviewText;
public void setId(Long id) {
        this.id = id;
    }
public void setWorkEffortId(String workEffortId) {
        this.workEffortId = workEffortId;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setReviewDate(LocalDateTime reviewDate) {
        this.reviewDate = reviewDate;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setPostedAnonymous(String postedAnonymous) {
        this.postedAnonymous = postedAnonymous;
    }
public void setRating(String rating) {
        this.rating = rating;
    }
public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

}
