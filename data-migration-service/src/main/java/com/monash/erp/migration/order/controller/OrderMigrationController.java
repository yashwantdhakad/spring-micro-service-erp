package com.monash.erp.migration.order.controller;

import java.time.Instant;
import java.util.Set;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.explore.JobExplorer;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/migrations/orders")
public class OrderMigrationController {

    private final JobLauncher jobLauncher;
    private final JobExplorer jobExplorer;
    private final Job orderAdjustmentMigrationJob;
    private final Job orderAdjustmentAttributeMigrationJob;
    private final Job orderAdjustmentBillingMigrationJob;
    private final Job orderAttributeMigrationJob;
    private final Job orderContactMechMigrationJob;
    private final Job orderContentMigrationJob;
    private final Job orderDeliveryScheduleMigrationJob;
    private final Job orderHeaderMigrationJob;
    private final Job orderHeaderWorkEffortMigrationJob;
    private final Job orderInventoryItemApplMigrationJob;
    private final Job orderItemMigrationJob;
    private final Job orderItemAssocMigrationJob;
    private final Job orderItemAssociationMigrationJob;
    private final Job orderItemAttributeMigrationJob;
    private final Job orderItemBillingMigrationJob;
    private final Job orderItemChangeMigrationJob;
    private final Job orderItemContactMechMigrationJob;
    private final Job orderItemGroupMigrationJob;
    private final Job orderItemInventoryResMigrationJob;
    private final Job orderItemNoteMigrationJob;
    private final Job orderItemPriceInfoMigrationJob;
    private final Job orderItemQAOverrideMigrationJob;
    private final Job orderItemRoleMigrationJob;
    private final Job orderItemShipGroupMigrationJob;
    private final Job orderItemShipGroupAssocMigrationJob;
    private final Job orderItemShipGrpInvResMigrationJob;
    private final Job orderItemWorkEffortMigrationJob;
    private final Job orderLabelMigrationJob;
    private final Job orderNotificationMigrationJob;
    private final Job orderPaymentPreferenceMigrationJob;
    private final Job orderProductPromoCodeMigrationJob;
    private final Job orderRequirementCommitmentMigrationJob;
    private final Job orderRoleMigrationJob;
    private final Job orderShipmentMigrationJob;
    private final Job orderShipmentPreferenceMigrationJob;
    private final Job orderStatusMigrationJob;
    private final Job orderSummaryEntryMigrationJob;
    private final Job orderTermMigrationJob;
    private final Job orderTermAttributeMigrationJob;
    private final Job orderWorkEffortApplMigrationJob;

    public OrderMigrationController(
            JobLauncher jobLauncher,
            JobExplorer jobExplorer,
            @Qualifier("orderAdjustmentMigrationJob") Job orderAdjustmentMigrationJob,
            @Qualifier("orderAdjustmentAttributeMigrationJob") Job orderAdjustmentAttributeMigrationJob,
            @Qualifier("orderAdjustmentBillingMigrationJob") Job orderAdjustmentBillingMigrationJob,
            @Qualifier("orderAttributeMigrationJob") Job orderAttributeMigrationJob,
            @Qualifier("orderContactMechMigrationJob") Job orderContactMechMigrationJob,
            @Qualifier("orderContentMigrationJob") Job orderContentMigrationJob,
            @Qualifier("orderDeliveryScheduleMigrationJob") Job orderDeliveryScheduleMigrationJob,
            @Qualifier("orderHeaderMigrationJob") Job orderHeaderMigrationJob,
            @Qualifier("orderHeaderWorkEffortMigrationJob") Job orderHeaderWorkEffortMigrationJob,
            @Qualifier("orderInventoryItemApplMigrationJob") Job orderInventoryItemApplMigrationJob,
            @Qualifier("orderItemMigrationJob") Job orderItemMigrationJob,
            @Qualifier("orderItemAssocMigrationJob") Job orderItemAssocMigrationJob,
            @Qualifier("orderItemAssociationMigrationJob") Job orderItemAssociationMigrationJob,
            @Qualifier("orderItemAttributeMigrationJob") Job orderItemAttributeMigrationJob,
            @Qualifier("orderItemBillingMigrationJob") Job orderItemBillingMigrationJob,
            @Qualifier("orderItemChangeMigrationJob") Job orderItemChangeMigrationJob,
            @Qualifier("orderItemContactMechMigrationJob") Job orderItemContactMechMigrationJob,
            @Qualifier("orderItemGroupMigrationJob") Job orderItemGroupMigrationJob,
            @Qualifier("orderItemInventoryResMigrationJob") Job orderItemInventoryResMigrationJob,
            @Qualifier("orderItemNoteMigrationJob") Job orderItemNoteMigrationJob,
            @Qualifier("orderItemPriceInfoMigrationJob") Job orderItemPriceInfoMigrationJob,
            @Qualifier("orderItemQAOverrideMigrationJob") Job orderItemQAOverrideMigrationJob,
            @Qualifier("orderItemRoleMigrationJob") Job orderItemRoleMigrationJob,
            @Qualifier("orderItemShipGroupMigrationJob") Job orderItemShipGroupMigrationJob,
            @Qualifier("orderItemShipGroupAssocMigrationJob") Job orderItemShipGroupAssocMigrationJob,
            @Qualifier("orderItemShipGrpInvResMigrationJob") Job orderItemShipGrpInvResMigrationJob,
            @Qualifier("orderItemWorkEffortMigrationJob") Job orderItemWorkEffortMigrationJob,
            @Qualifier("orderLabelMigrationJob") Job orderLabelMigrationJob,
            @Qualifier("orderNotificationMigrationJob") Job orderNotificationMigrationJob,
            @Qualifier("orderPaymentPreferenceMigrationJob") Job orderPaymentPreferenceMigrationJob,
            @Qualifier("orderProductPromoCodeMigrationJob") Job orderProductPromoCodeMigrationJob,
            @Qualifier("orderRequirementCommitmentMigrationJob") Job orderRequirementCommitmentMigrationJob,
            @Qualifier("orderRoleMigrationJob") Job orderRoleMigrationJob,
            @Qualifier("orderShipmentMigrationJob") Job orderShipmentMigrationJob,
            @Qualifier("orderShipmentPreferenceMigrationJob") Job orderShipmentPreferenceMigrationJob,
            @Qualifier("orderStatusMigrationJob") Job orderStatusMigrationJob,
            @Qualifier("orderSummaryEntryMigrationJob") Job orderSummaryEntryMigrationJob,
            @Qualifier("orderTermMigrationJob") Job orderTermMigrationJob,
            @Qualifier("orderTermAttributeMigrationJob") Job orderTermAttributeMigrationJob,
            @Qualifier("orderWorkEffortApplMigrationJob") Job orderWorkEffortApplMigrationJob
    ) {
        this.jobLauncher = jobLauncher;
        this.jobExplorer = jobExplorer;
        this.orderAdjustmentMigrationJob = orderAdjustmentMigrationJob;
        this.orderAdjustmentAttributeMigrationJob = orderAdjustmentAttributeMigrationJob;
        this.orderAdjustmentBillingMigrationJob = orderAdjustmentBillingMigrationJob;
        this.orderAttributeMigrationJob = orderAttributeMigrationJob;
        this.orderContactMechMigrationJob = orderContactMechMigrationJob;
        this.orderContentMigrationJob = orderContentMigrationJob;
        this.orderDeliveryScheduleMigrationJob = orderDeliveryScheduleMigrationJob;
        this.orderHeaderMigrationJob = orderHeaderMigrationJob;
        this.orderHeaderWorkEffortMigrationJob = orderHeaderWorkEffortMigrationJob;
        this.orderInventoryItemApplMigrationJob = orderInventoryItemApplMigrationJob;
        this.orderItemMigrationJob = orderItemMigrationJob;
        this.orderItemAssocMigrationJob = orderItemAssocMigrationJob;
        this.orderItemAssociationMigrationJob = orderItemAssociationMigrationJob;
        this.orderItemAttributeMigrationJob = orderItemAttributeMigrationJob;
        this.orderItemBillingMigrationJob = orderItemBillingMigrationJob;
        this.orderItemChangeMigrationJob = orderItemChangeMigrationJob;
        this.orderItemContactMechMigrationJob = orderItemContactMechMigrationJob;
        this.orderItemGroupMigrationJob = orderItemGroupMigrationJob;
        this.orderItemInventoryResMigrationJob = orderItemInventoryResMigrationJob;
        this.orderItemNoteMigrationJob = orderItemNoteMigrationJob;
        this.orderItemPriceInfoMigrationJob = orderItemPriceInfoMigrationJob;
        this.orderItemQAOverrideMigrationJob = orderItemQAOverrideMigrationJob;
        this.orderItemRoleMigrationJob = orderItemRoleMigrationJob;
        this.orderItemShipGroupMigrationJob = orderItemShipGroupMigrationJob;
        this.orderItemShipGroupAssocMigrationJob = orderItemShipGroupAssocMigrationJob;
        this.orderItemShipGrpInvResMigrationJob = orderItemShipGrpInvResMigrationJob;
        this.orderItemWorkEffortMigrationJob = orderItemWorkEffortMigrationJob;
        this.orderLabelMigrationJob = orderLabelMigrationJob;
        this.orderNotificationMigrationJob = orderNotificationMigrationJob;
        this.orderPaymentPreferenceMigrationJob = orderPaymentPreferenceMigrationJob;
        this.orderProductPromoCodeMigrationJob = orderProductPromoCodeMigrationJob;
        this.orderRequirementCommitmentMigrationJob = orderRequirementCommitmentMigrationJob;
        this.orderRoleMigrationJob = orderRoleMigrationJob;
        this.orderShipmentMigrationJob = orderShipmentMigrationJob;
        this.orderShipmentPreferenceMigrationJob = orderShipmentPreferenceMigrationJob;
        this.orderStatusMigrationJob = orderStatusMigrationJob;
        this.orderSummaryEntryMigrationJob = orderSummaryEntryMigrationJob;
        this.orderTermMigrationJob = orderTermMigrationJob;
        this.orderTermAttributeMigrationJob = orderTermAttributeMigrationJob;
        this.orderWorkEffortApplMigrationJob = orderWorkEffortApplMigrationJob;
    }

    @PostMapping("/order-adjustment/run")
    public ResponseEntity<MigrationResponse> runOrderAdjustment() {
        return runJob(orderAdjustmentMigrationJob);
    }

    @PostMapping("/order-adjustment-attribute/run")
    public ResponseEntity<MigrationResponse> runOrderAdjustmentAttribute() {
        return runJob(orderAdjustmentAttributeMigrationJob);
    }

    @PostMapping("/order-adjustment-billing/run")
    public ResponseEntity<MigrationResponse> runOrderAdjustmentBilling() {
        return runJob(orderAdjustmentBillingMigrationJob);
    }

    @PostMapping("/order-attribute/run")
    public ResponseEntity<MigrationResponse> runOrderAttribute() {
        return runJob(orderAttributeMigrationJob);
    }

    @PostMapping("/order-contact-mech/run")
    public ResponseEntity<MigrationResponse> runOrderContactMech() {
        return runJob(orderContactMechMigrationJob);
    }

    @PostMapping("/order-content/run")
    public ResponseEntity<MigrationResponse> runOrderContent() {
        return runJob(orderContentMigrationJob);
    }

    @PostMapping("/order-delivery-schedule/run")
    public ResponseEntity<MigrationResponse> runOrderDeliverySchedule() {
        return runJob(orderDeliveryScheduleMigrationJob);
    }

    @PostMapping("/order-header/run")
    public ResponseEntity<MigrationResponse> runOrderHeader() {
        return runJob(orderHeaderMigrationJob);
    }

    @PostMapping("/order-header-work-effort/run")
    public ResponseEntity<MigrationResponse> runOrderHeaderWorkEffort() {
        return runJob(orderHeaderWorkEffortMigrationJob);
    }

    @PostMapping("/order-inventory-item-appl/run")
    public ResponseEntity<MigrationResponse> runOrderInventoryItemAppl() {
        return runJob(orderInventoryItemApplMigrationJob);
    }

    @PostMapping("/order-item/run")
    public ResponseEntity<MigrationResponse> runOrderItem() {
        return runJob(orderItemMigrationJob);
    }

    @PostMapping("/order-item-assoc/run")
    public ResponseEntity<MigrationResponse> runOrderItemAssoc() {
        return runJob(orderItemAssocMigrationJob);
    }

    @PostMapping("/order-item-association/run")
    public ResponseEntity<MigrationResponse> runOrderItemAssociation() {
        return runJob(orderItemAssociationMigrationJob);
    }

    @PostMapping("/order-item-attribute/run")
    public ResponseEntity<MigrationResponse> runOrderItemAttribute() {
        return runJob(orderItemAttributeMigrationJob);
    }

    @PostMapping("/order-item-billing/run")
    public ResponseEntity<MigrationResponse> runOrderItemBilling() {
        return runJob(orderItemBillingMigrationJob);
    }

    @PostMapping("/order-item-change/run")
    public ResponseEntity<MigrationResponse> runOrderItemChange() {
        return runJob(orderItemChangeMigrationJob);
    }

    @PostMapping("/order-item-contact-mech/run")
    public ResponseEntity<MigrationResponse> runOrderItemContactMech() {
        return runJob(orderItemContactMechMigrationJob);
    }

    @PostMapping("/order-item-group/run")
    public ResponseEntity<MigrationResponse> runOrderItemGroup() {
        return runJob(orderItemGroupMigrationJob);
    }

    @PostMapping("/order-item-inventory-res/run")
    public ResponseEntity<MigrationResponse> runOrderItemInventoryRes() {
        return runJob(orderItemInventoryResMigrationJob);
    }

    @PostMapping("/order-item-note/run")
    public ResponseEntity<MigrationResponse> runOrderItemNote() {
        return runJob(orderItemNoteMigrationJob);
    }

    @PostMapping("/order-item-price-info/run")
    public ResponseEntity<MigrationResponse> runOrderItemPriceInfo() {
        return runJob(orderItemPriceInfoMigrationJob);
    }

    @PostMapping("/order-item-q-a-override/run")
    public ResponseEntity<MigrationResponse> runOrderItemQAOverride() {
        return runJob(orderItemQAOverrideMigrationJob);
    }

    @PostMapping("/order-item-role/run")
    public ResponseEntity<MigrationResponse> runOrderItemRole() {
        return runJob(orderItemRoleMigrationJob);
    }

    @PostMapping("/order-item-ship-group/run")
    public ResponseEntity<MigrationResponse> runOrderItemShipGroup() {
        return runJob(orderItemShipGroupMigrationJob);
    }

    @PostMapping("/order-item-ship-group-assoc/run")
    public ResponseEntity<MigrationResponse> runOrderItemShipGroupAssoc() {
        return runJob(orderItemShipGroupAssocMigrationJob);
    }

    @PostMapping("/order-item-ship-grp-inv-res/run")
    public ResponseEntity<MigrationResponse> runOrderItemShipGrpInvRes() {
        return runJob(orderItemShipGrpInvResMigrationJob);
    }

    @PostMapping("/order-item-work-effort/run")
    public ResponseEntity<MigrationResponse> runOrderItemWorkEffort() {
        return runJob(orderItemWorkEffortMigrationJob);
    }

    @PostMapping("/order-label/run")
    public ResponseEntity<MigrationResponse> runOrderLabel() {
        return runJob(orderLabelMigrationJob);
    }

    @PostMapping("/order-notification/run")
    public ResponseEntity<MigrationResponse> runOrderNotification() {
        return runJob(orderNotificationMigrationJob);
    }

    @PostMapping("/order-payment-preference/run")
    public ResponseEntity<MigrationResponse> runOrderPaymentPreference() {
        return runJob(orderPaymentPreferenceMigrationJob);
    }

    @PostMapping("/order-product-promo-code/run")
    public ResponseEntity<MigrationResponse> runOrderProductPromoCode() {
        return runJob(orderProductPromoCodeMigrationJob);
    }

    @PostMapping("/order-requirement-commitment/run")
    public ResponseEntity<MigrationResponse> runOrderRequirementCommitment() {
        return runJob(orderRequirementCommitmentMigrationJob);
    }

    @PostMapping("/order-role/run")
    public ResponseEntity<MigrationResponse> runOrderRole() {
        return runJob(orderRoleMigrationJob);
    }

    @PostMapping("/order-shipment/run")
    public ResponseEntity<MigrationResponse> runOrderShipment() {
        return runJob(orderShipmentMigrationJob);
    }

    @PostMapping("/order-shipment-preference/run")
    public ResponseEntity<MigrationResponse> runOrderShipmentPreference() {
        return runJob(orderShipmentPreferenceMigrationJob);
    }

    @PostMapping("/order-status/run")
    public ResponseEntity<MigrationResponse> runOrderStatus() {
        return runJob(orderStatusMigrationJob);
    }

    @PostMapping("/order-summary-entry/run")
    public ResponseEntity<MigrationResponse> runOrderSummaryEntry() {
        return runJob(orderSummaryEntryMigrationJob);
    }

    @PostMapping("/order-term/run")
    public ResponseEntity<MigrationResponse> runOrderTerm() {
        return runJob(orderTermMigrationJob);
    }

    @PostMapping("/order-term-attribute/run")
    public ResponseEntity<MigrationResponse> runOrderTermAttribute() {
        return runJob(orderTermAttributeMigrationJob);
    }

    @PostMapping("/order-work-effort-appl/run")
    public ResponseEntity<MigrationResponse> runOrderWorkEffortAppl() {
        return runJob(orderWorkEffortApplMigrationJob);
    }

    @PostMapping("/run-all")
    public ResponseEntity<MigrationBatchResponse> runAll() {
        MigrationBatchResponse response = new MigrationBatchResponse();
        try {
            response.orderAdjustment = runJobInternal(orderAdjustmentMigrationJob);
            response.orderAdjustmentAttribute = runJobInternal(orderAdjustmentAttributeMigrationJob);
            response.orderAdjustmentBilling = runJobInternal(orderAdjustmentBillingMigrationJob);
            response.orderAttribute = runJobInternal(orderAttributeMigrationJob);
            response.orderContactMech = runJobInternal(orderContactMechMigrationJob);
            response.orderContent = runJobInternal(orderContentMigrationJob);
            response.orderDeliverySchedule = runJobInternal(orderDeliveryScheduleMigrationJob);
            response.orderHeader = runJobInternal(orderHeaderMigrationJob);
            response.orderHeaderWorkEffort = runJobInternal(orderHeaderWorkEffortMigrationJob);
            response.orderInventoryItemAppl = runJobInternal(orderInventoryItemApplMigrationJob);
            response.orderItem = runJobInternal(orderItemMigrationJob);
            response.orderItemAssoc = runJobInternal(orderItemAssocMigrationJob);
            response.orderItemAssociation = runJobInternal(orderItemAssociationMigrationJob);
            response.orderItemAttribute = runJobInternal(orderItemAttributeMigrationJob);
            response.orderItemBilling = runJobInternal(orderItemBillingMigrationJob);
            response.orderItemChange = runJobInternal(orderItemChangeMigrationJob);
            response.orderItemContactMech = runJobInternal(orderItemContactMechMigrationJob);
            response.orderItemGroup = runJobInternal(orderItemGroupMigrationJob);
            response.orderItemInventoryRes = runJobInternal(orderItemInventoryResMigrationJob);
            response.orderItemNote = runJobInternal(orderItemNoteMigrationJob);
            response.orderItemPriceInfo = runJobInternal(orderItemPriceInfoMigrationJob);
            response.orderItemQAOverride = runJobInternal(orderItemQAOverrideMigrationJob);
            response.orderItemRole = runJobInternal(orderItemRoleMigrationJob);
            response.orderItemShipGroup = runJobInternal(orderItemShipGroupMigrationJob);
            response.orderItemShipGroupAssoc = runJobInternal(orderItemShipGroupAssocMigrationJob);
            response.orderItemShipGrpInvRes = runJobInternal(orderItemShipGrpInvResMigrationJob);
            response.orderItemWorkEffort = runJobInternal(orderItemWorkEffortMigrationJob);
            response.orderLabel = runJobInternal(orderLabelMigrationJob);
            response.orderNotification = runJobInternal(orderNotificationMigrationJob);
            response.orderPaymentPreference = runJobInternal(orderPaymentPreferenceMigrationJob);
            response.orderProductPromoCode = runJobInternal(orderProductPromoCodeMigrationJob);
            response.orderRequirementCommitment = runJobInternal(orderRequirementCommitmentMigrationJob);
            response.orderRole = runJobInternal(orderRoleMigrationJob);
            response.orderShipment = runJobInternal(orderShipmentMigrationJob);
            response.orderShipmentPreference = runJobInternal(orderShipmentPreferenceMigrationJob);
            response.orderStatus = runJobInternal(orderStatusMigrationJob);
            response.orderSummaryEntry = runJobInternal(orderSummaryEntryMigrationJob);
            response.orderTerm = runJobInternal(orderTermMigrationJob);
            response.orderTermAttribute = runJobInternal(orderTermAttributeMigrationJob);
            response.orderWorkEffortAppl = runJobInternal(orderWorkEffortApplMigrationJob);
            return ResponseEntity.ok(response);
        } catch (IllegalStateException ex) {
            response.error = ex.getMessage();
            return ResponseEntity.status(HttpStatus.CONFLICT).body(response);
        } catch (Exception ex) {
            response.error = ex.getMessage();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    private ResponseEntity<MigrationResponse> runJob(Job job) {
        Set<JobExecution> running = jobExplorer.findRunningJobExecutions(job.getName());
        if (!running.isEmpty()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new MigrationResponse(null, "RUNNING", "Job is already running"));
        }
        try {
            JobParametersBuilder params = new JobParametersBuilder();
            params.addLong("run.id", Instant.now().toEpochMilli());
            JobExecution execution = jobLauncher.run(job, params.toJobParameters());
            return ResponseEntity.ok(new MigrationResponse(
                    execution.getId(),
                    execution.getStatus().name(),
                    "Started"
            ));
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new MigrationResponse(null, "FAILED", ex.getMessage()));
        }
    }

    private MigrationResponse runJobInternal(Job job) throws Exception {
        Set<JobExecution> running = jobExplorer.findRunningJobExecutions(job.getName());
        if (!running.isEmpty()) {
            throw new IllegalStateException("Job is already running: " + job.getName());
        }
        JobParametersBuilder params = new JobParametersBuilder();
        params.addLong("run.id", Instant.now().toEpochMilli());
        JobExecution execution = jobLauncher.run(job, params.toJobParameters());
        return new MigrationResponse(execution.getId(), execution.getStatus().name(), "Started");
    }

    public record MigrationResponse(Long executionId, String status, String message) {
    }

    public static class MigrationBatchResponse {
        public MigrationResponse orderAdjustment;
        public MigrationResponse orderAdjustmentAttribute;
        public MigrationResponse orderAdjustmentBilling;
        public MigrationResponse orderAttribute;
        public MigrationResponse orderContactMech;
        public MigrationResponse orderContent;
        public MigrationResponse orderDeliverySchedule;
        public MigrationResponse orderHeader;
        public MigrationResponse orderHeaderWorkEffort;
        public MigrationResponse orderInventoryItemAppl;
        public MigrationResponse orderItem;
        public MigrationResponse orderItemAssoc;
        public MigrationResponse orderItemAssociation;
        public MigrationResponse orderItemAttribute;
        public MigrationResponse orderItemBilling;
        public MigrationResponse orderItemChange;
        public MigrationResponse orderItemContactMech;
        public MigrationResponse orderItemGroup;
        public MigrationResponse orderItemInventoryRes;
        public MigrationResponse orderItemNote;
        public MigrationResponse orderItemPriceInfo;
        public MigrationResponse orderItemQAOverride;
        public MigrationResponse orderItemRole;
        public MigrationResponse orderItemShipGroup;
        public MigrationResponse orderItemShipGroupAssoc;
        public MigrationResponse orderItemShipGrpInvRes;
        public MigrationResponse orderItemWorkEffort;
        public MigrationResponse orderLabel;
        public MigrationResponse orderNotification;
        public MigrationResponse orderPaymentPreference;
        public MigrationResponse orderProductPromoCode;
        public MigrationResponse orderRequirementCommitment;
        public MigrationResponse orderRole;
        public MigrationResponse orderShipment;
        public MigrationResponse orderShipmentPreference;
        public MigrationResponse orderStatus;
        public MigrationResponse orderSummaryEntry;
        public MigrationResponse orderTerm;
        public MigrationResponse orderTermAttribute;
        public MigrationResponse orderWorkEffortAppl;
        public String error;
    }
}