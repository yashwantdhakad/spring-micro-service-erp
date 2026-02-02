package com.monash.erp.wms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(
        name = "product",
        indexes = {
                @Index(name = "idx_product_product_id", columnList = "product_id"),
                @Index(name = "idx_product_product_name", columnList = "product_name"),
                @Index(name = "idx_product_internal_name", columnList = "internal_name"),
                @Index(name = "idx_product_product_type_id", columnList = "product_type_id"),
                @Index(name = "idx_product_primary_category_id", columnList = "primary_product_category_id")
        }
)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, unique = true)
    private String productId;

    @Column(length = 20)
    private String productTypeId;

    @Column(length = 20)
    private String primaryProductCategoryId;

    @Column(length = 20)
    private String manufacturerPartyId;

    @Column(length = 20)
    private String facilityId;

    private LocalDateTime introductionDate;
    private LocalDateTime supportDiscontinuationDate;
    private LocalDateTime salesDiscontinuationDate;
    private LocalDateTime releaseDate;

    @Column(length = 1)
    private String salesDiscWhenNotAvail;

    @Column(length = 255)
    private String internalName;

    @Column(length = 100)
    private String brandName;

    @Column(length = 255)
    private String comments;

    @Column(length = 100)
    private String productName;

    @Column(length = 255)
    private String description;

    @Lob
    @Column(columnDefinition = "LONGTEXT")
    private String longDescription;

    @Column(columnDefinition = "TEXT")
    private String priceDetailText;

    @Column(columnDefinition = "TEXT")
    private String smallImageUrl;

    @Column(columnDefinition = "TEXT")
    private String mediumImageUrl;

    @Column(columnDefinition = "TEXT")
    private String largeImageUrl;

    @Column(columnDefinition = "TEXT")
    private String detailImageUrl;

    @Column(columnDefinition = "TEXT")
    private String originalImageUrl;

    @Column(columnDefinition = "TEXT")
    private String detailScreen;

    @Column(columnDefinition = "TEXT")
    private String inventoryMessage;

    @Column(length = 1)
    private String requireInventory;

    @Column(length = 20)
    private String quantityUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal quantityIncluded;

    @Column(precision = 20, scale = 0)
    private BigDecimal piecesIncluded;

    @Column(length = 1)
    private String requireAmount;

    @Column(precision = 18, scale = 2)
    private BigDecimal fixedAmount;

    @Column(length = 20)
    private String amountUomTypeId;

    @Column(length = 20)
    private String weightUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal weight;

    @Column(length = 20)
    private String heightUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal productHeight;

    @Column(precision = 18, scale = 6)
    private BigDecimal shippingHeight;

    @Column(length = 20)
    private String widthUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal productWidth;

    @Column(precision = 18, scale = 6)
    private BigDecimal shippingWidth;

    @Column(length = 20)
    private String depthUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal productDepth;

    @Column(precision = 18, scale = 6)
    private BigDecimal shippingDepth;

    @Column(precision = 18, scale = 6)
    private BigDecimal productRating;

    @Column(length = 20)
    private String ratingTypeEnum;

    @Column(length = 1)
    private String returnable;

    @Column(length = 1)
    private String taxable;

    @Column(length = 1)
    private String chargeShipping;

    @Column(length = 1)
    private String autoCreateKeywords;

    @Column(length = 1)
    private String includeInPromotions;

    @Column(length = 1)
    private String isVirtual;

    @Column(length = 1)
    private String isVariant;

    @Column(length = 20)
    private String virtualVariantMethodEnum;

    @Column(length = 20)
    private String originGeoId;

    @Column(length = 20)
    private String requirementMethodEnumId;

    @Column(precision = 20, scale = 0)
    private BigDecimal billOfMaterialLevel;

    @Column(precision = 18, scale = 6)
    private BigDecimal reservMaxPersons;

    @Column(name = "RESERV2ND_P_P_PERC", precision = 18, scale = 6)
    private BigDecimal reserv2ndPPPerc;

    @Column(name = "RESERV_NTH_P_P_PERC", precision = 18, scale = 6)
    private BigDecimal reservNthPPPerc;

    @Column(length = 20)
    private String configId;

    private LocalDateTime createdDate;

    @Column(length = 250)
    private String createdByUserLogin;

    private LocalDateTime lastModifiedDate;

    @Column(length = 250)
    private String lastModifiedByUserLogin;

    @Column(length = 1)
    private String inShippingBox;

    @Column(length = 20)
    private String defaultShipmentBoxTypeId;

    private LocalDateTime lastUpdatedStamp;
    private LocalDateTime lastUpdatedTxStamp;
    private LocalDateTime createdStamp;
    private LocalDateTime createdTxStamp;

    @Column(length = 1)
    private String isChemical;

    @Column(length = 1)
    private String serialized;

    @Column(length = 1)
    private String shelfLife;

    @Column(length = 20)
    private String externalId;

    @Column(precision = 18, scale = 6)
    private BigDecimal defaultLeadTimeDays;

    @Column(columnDefinition = "TEXT")
    private String receivingNote;

    @Column(precision = 18, scale = 6)
    private BigDecimal productWeight;

    @Column(length = 20)
    private String diameterUomId;

    @Column(precision = 18, scale = 6)
    private BigDecimal productDiameter;

    @Column(precision = 20, scale = 0)
    private BigDecimal annualFlightHours;

    @Column(length = 1)
    private String hasSleeves;

    @Column(length = 1)
    private String lifeLimitation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(String productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getPrimaryProductCategoryId() {
        return primaryProductCategoryId;
    }

    public void setPrimaryProductCategoryId(String primaryProductCategoryId) {
        this.primaryProductCategoryId = primaryProductCategoryId;
    }

    public String getManufacturerPartyId() {
        return manufacturerPartyId;
    }

    public void setManufacturerPartyId(String manufacturerPartyId) {
        this.manufacturerPartyId = manufacturerPartyId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public LocalDateTime getIntroductionDate() {
        return introductionDate;
    }

    public void setIntroductionDate(LocalDateTime introductionDate) {
        this.introductionDate = introductionDate;
    }

    public LocalDateTime getSupportDiscontinuationDate() {
        return supportDiscontinuationDate;
    }

    public void setSupportDiscontinuationDate(LocalDateTime supportDiscontinuationDate) {
        this.supportDiscontinuationDate = supportDiscontinuationDate;
    }

    public LocalDateTime getSalesDiscontinuationDate() {
        return salesDiscontinuationDate;
    }

    public void setSalesDiscontinuationDate(LocalDateTime salesDiscontinuationDate) {
        this.salesDiscontinuationDate = salesDiscontinuationDate;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSalesDiscWhenNotAvail() {
        return salesDiscWhenNotAvail;
    }

    public void setSalesDiscWhenNotAvail(String salesDiscWhenNotAvail) {
        this.salesDiscWhenNotAvail = salesDiscWhenNotAvail;
    }

    public String getInternalName() {
        return internalName;
    }

    public void setInternalName(String internalName) {
        this.internalName = internalName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public String getPriceDetailText() {
        return priceDetailText;
    }

    public void setPriceDetailText(String priceDetailText) {
        this.priceDetailText = priceDetailText;
    }

    public String getSmallImageUrl() {
        return smallImageUrl;
    }

    public void setSmallImageUrl(String smallImageUrl) {
        this.smallImageUrl = smallImageUrl;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public void setLargeImageUrl(String largeImageUrl) {
        this.largeImageUrl = largeImageUrl;
    }

    public String getDetailImageUrl() {
        return detailImageUrl;
    }

    public void setDetailImageUrl(String detailImageUrl) {
        this.detailImageUrl = detailImageUrl;
    }

    public String getOriginalImageUrl() {
        return originalImageUrl;
    }

    public void setOriginalImageUrl(String originalImageUrl) {
        this.originalImageUrl = originalImageUrl;
    }

    public String getDetailScreen() {
        return detailScreen;
    }

    public void setDetailScreen(String detailScreen) {
        this.detailScreen = detailScreen;
    }

    public String getInventoryMessage() {
        return inventoryMessage;
    }

    public void setInventoryMessage(String inventoryMessage) {
        this.inventoryMessage = inventoryMessage;
    }

    public String getRequireInventory() {
        return requireInventory;
    }

    public void setRequireInventory(String requireInventory) {
        this.requireInventory = requireInventory;
    }

    public String getQuantityUomId() {
        return quantityUomId;
    }

    public void setQuantityUomId(String quantityUomId) {
        this.quantityUomId = quantityUomId;
    }

    public BigDecimal getQuantityIncluded() {
        return quantityIncluded;
    }

    public void setQuantityIncluded(BigDecimal quantityIncluded) {
        this.quantityIncluded = quantityIncluded;
    }

    public BigDecimal getPiecesIncluded() {
        return piecesIncluded;
    }

    public void setPiecesIncluded(BigDecimal piecesIncluded) {
        this.piecesIncluded = piecesIncluded;
    }

    public String getRequireAmount() {
        return requireAmount;
    }

    public void setRequireAmount(String requireAmount) {
        this.requireAmount = requireAmount;
    }

    public BigDecimal getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(BigDecimal fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public String getAmountUomTypeId() {
        return amountUomTypeId;
    }

    public void setAmountUomTypeId(String amountUomTypeId) {
        this.amountUomTypeId = amountUomTypeId;
    }

    public String getWeightUomId() {
        return weightUomId;
    }

    public void setWeightUomId(String weightUomId) {
        this.weightUomId = weightUomId;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getHeightUomId() {
        return heightUomId;
    }

    public void setHeightUomId(String heightUomId) {
        this.heightUomId = heightUomId;
    }

    public BigDecimal getProductHeight() {
        return productHeight;
    }

    public void setProductHeight(BigDecimal productHeight) {
        this.productHeight = productHeight;
    }

    public BigDecimal getShippingHeight() {
        return shippingHeight;
    }

    public void setShippingHeight(BigDecimal shippingHeight) {
        this.shippingHeight = shippingHeight;
    }

    public String getWidthUomId() {
        return widthUomId;
    }

    public void setWidthUomId(String widthUomId) {
        this.widthUomId = widthUomId;
    }

    public BigDecimal getProductWidth() {
        return productWidth;
    }

    public void setProductWidth(BigDecimal productWidth) {
        this.productWidth = productWidth;
    }

    public BigDecimal getShippingWidth() {
        return shippingWidth;
    }

    public void setShippingWidth(BigDecimal shippingWidth) {
        this.shippingWidth = shippingWidth;
    }

    public String getDepthUomId() {
        return depthUomId;
    }

    public void setDepthUomId(String depthUomId) {
        this.depthUomId = depthUomId;
    }

    public BigDecimal getProductDepth() {
        return productDepth;
    }

    public void setProductDepth(BigDecimal productDepth) {
        this.productDepth = productDepth;
    }

    public BigDecimal getShippingDepth() {
        return shippingDepth;
    }

    public void setShippingDepth(BigDecimal shippingDepth) {
        this.shippingDepth = shippingDepth;
    }

    public BigDecimal getProductRating() {
        return productRating;
    }

    public void setProductRating(BigDecimal productRating) {
        this.productRating = productRating;
    }

    public String getRatingTypeEnum() {
        return ratingTypeEnum;
    }

    public void setRatingTypeEnum(String ratingTypeEnum) {
        this.ratingTypeEnum = ratingTypeEnum;
    }

    public String getReturnable() {
        return returnable;
    }

    public void setReturnable(String returnable) {
        this.returnable = returnable;
    }

    public String getTaxable() {
        return taxable;
    }

    public void setTaxable(String taxable) {
        this.taxable = taxable;
    }

    public String getChargeShipping() {
        return chargeShipping;
    }

    public void setChargeShipping(String chargeShipping) {
        this.chargeShipping = chargeShipping;
    }

    public String getAutoCreateKeywords() {
        return autoCreateKeywords;
    }

    public void setAutoCreateKeywords(String autoCreateKeywords) {
        this.autoCreateKeywords = autoCreateKeywords;
    }

    public String getIncludeInPromotions() {
        return includeInPromotions;
    }

    public void setIncludeInPromotions(String includeInPromotions) {
        this.includeInPromotions = includeInPromotions;
    }

    public String getIsVirtual() {
        return isVirtual;
    }

    public void setIsVirtual(String isVirtual) {
        this.isVirtual = isVirtual;
    }

    public String getIsVariant() {
        return isVariant;
    }

    public void setIsVariant(String isVariant) {
        this.isVariant = isVariant;
    }

    public String getVirtualVariantMethodEnum() {
        return virtualVariantMethodEnum;
    }

    public void setVirtualVariantMethodEnum(String virtualVariantMethodEnum) {
        this.virtualVariantMethodEnum = virtualVariantMethodEnum;
    }

    public String getOriginGeoId() {
        return originGeoId;
    }

    public void setOriginGeoId(String originGeoId) {
        this.originGeoId = originGeoId;
    }

    public String getRequirementMethodEnumId() {
        return requirementMethodEnumId;
    }

    public void setRequirementMethodEnumId(String requirementMethodEnumId) {
        this.requirementMethodEnumId = requirementMethodEnumId;
    }

    public BigDecimal getBillOfMaterialLevel() {
        return billOfMaterialLevel;
    }

    public void setBillOfMaterialLevel(BigDecimal billOfMaterialLevel) {
        this.billOfMaterialLevel = billOfMaterialLevel;
    }

    public BigDecimal getReservMaxPersons() {
        return reservMaxPersons;
    }

    public void setReservMaxPersons(BigDecimal reservMaxPersons) {
        this.reservMaxPersons = reservMaxPersons;
    }

    public BigDecimal getReserv2ndPPPerc() {
        return reserv2ndPPPerc;
    }

    public void setReserv2ndPPPerc(BigDecimal reserv2ndPPPerc) {
        this.reserv2ndPPPerc = reserv2ndPPPerc;
    }

    public BigDecimal getReservNthPPPerc() {
        return reservNthPPPerc;
    }

    public void setReservNthPPPerc(BigDecimal reservNthPPPerc) {
        this.reservNthPPPerc = reservNthPPPerc;
    }

    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByUserLogin() {
        return createdByUserLogin;
    }

    public void setCreatedByUserLogin(String createdByUserLogin) {
        this.createdByUserLogin = createdByUserLogin;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByUserLogin() {
        return lastModifiedByUserLogin;
    }

    public void setLastModifiedByUserLogin(String lastModifiedByUserLogin) {
        this.lastModifiedByUserLogin = lastModifiedByUserLogin;
    }

    public String getInShippingBox() {
        return inShippingBox;
    }

    public void setInShippingBox(String inShippingBox) {
        this.inShippingBox = inShippingBox;
    }

    public String getDefaultShipmentBoxTypeId() {
        return defaultShipmentBoxTypeId;
    }

    public void setDefaultShipmentBoxTypeId(String defaultShipmentBoxTypeId) {
        this.defaultShipmentBoxTypeId = defaultShipmentBoxTypeId;
    }

    public LocalDateTime getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(LocalDateTime lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public LocalDateTime getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(LocalDateTime lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public LocalDateTime getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(LocalDateTime createdStamp) {
        this.createdStamp = createdStamp;
    }

    public LocalDateTime getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(LocalDateTime createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public String getIsChemical() {
        return isChemical;
    }

    public void setIsChemical(String isChemical) {
        this.isChemical = isChemical;
    }

    public String getSerialized() {
        return serialized;
    }

    public void setSerialized(String serialized) {
        this.serialized = serialized;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public BigDecimal getDefaultLeadTimeDays() {
        return defaultLeadTimeDays;
    }

    public void setDefaultLeadTimeDays(BigDecimal defaultLeadTimeDays) {
        this.defaultLeadTimeDays = defaultLeadTimeDays;
    }

    public String getReceivingNote() {
        return receivingNote;
    }

    public void setReceivingNote(String receivingNote) {
        this.receivingNote = receivingNote;
    }

    public BigDecimal getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(BigDecimal productWeight) {
        this.productWeight = productWeight;
    }

    public String getDiameterUomId() {
        return diameterUomId;
    }

    public void setDiameterUomId(String diameterUomId) {
        this.diameterUomId = diameterUomId;
    }

    public BigDecimal getProductDiameter() {
        return productDiameter;
    }

    public void setProductDiameter(BigDecimal productDiameter) {
        this.productDiameter = productDiameter;
    }

    public BigDecimal getAnnualFlightHours() {
        return annualFlightHours;
    }

    public void setAnnualFlightHours(BigDecimal annualFlightHours) {
        this.annualFlightHours = annualFlightHours;
    }

    public String getHasSleeves() {
        return hasSleeves;
    }

    public void setHasSleeves(String hasSleeves) {
        this.hasSleeves = hasSleeves;
    }

    public String getLifeLimitation() {
        return lifeLimitation;
    }

    public void setLifeLimitation(String lifeLimitation) {
        this.lifeLimitation = lifeLimitation;
    }
}
