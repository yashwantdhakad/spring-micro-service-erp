package com.monash.erp.wms.entity;

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
public class ProductReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productReviewId;
    private String productStoreId;
    private String productId;
    private String userLoginId;
    private String statusId;
    private String postedAnonymous;
    private LocalDateTime postedDateTime;
    private String productRating;
    private String productReview;
public void setId(Long id) {
        this.id = id;
    }
public void setProductReviewId(String productReviewId) {
        this.productReviewId = productReviewId;
    }
public void setProductStoreId(String productStoreId) {
        this.productStoreId = productStoreId;
    }
public void setProductId(String productId) {
        this.productId = productId;
    }
public void setUserLoginId(String userLoginId) {
        this.userLoginId = userLoginId;
    }
public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
public void setPostedAnonymous(String postedAnonymous) {
        this.postedAnonymous = postedAnonymous;
    }
public void setPostedDateTime(LocalDateTime postedDateTime) {
        this.postedDateTime = postedDateTime;
    }
public void setProductRating(String productRating) {
        this.productRating = productRating;
    }
public void setProductReview(String productReview) {
        this.productReview = productReview;
    }

}
