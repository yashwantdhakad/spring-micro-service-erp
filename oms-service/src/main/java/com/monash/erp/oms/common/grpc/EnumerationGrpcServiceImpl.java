package com.monash.erp.oms.common.grpc;

import com.monash.erp.oms.common.entity.Enumeration;
import com.monash.erp.oms.common.service.EnumerationService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
@RequiredArgsConstructor
public class EnumerationGrpcServiceImpl extends EnumerationGrpcServiceGrpc.EnumerationGrpcServiceImplBase {

    private final EnumerationService enumerationService;

    @Override
    public void getEnumerationsByType(EnumerationTypeRequest request,
            StreamObserver<EnumerationListResponse> responseObserver) {
        String enumTypeId = request.getEnumTypeId();
        List<Enumeration> enumerations = enumerationService.findByEnumTypeId(enumTypeId);

        List<EnumerationResponse> grpcEnumerations = enumerations.stream()
                .map(this::toGrpcEnumeration)
                .collect(Collectors.toList());

        EnumerationListResponse response = EnumerationListResponse.newBuilder()
                .addAllEnumerations(grpcEnumerations)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private EnumerationResponse toGrpcEnumeration(Enumeration enumEntity) {
        return EnumerationResponse.newBuilder()
                .setEnumId(enumEntity.getEnumId() != null ? enumEntity.getEnumId() : "")
                .setEnumTypeId(enumEntity.getEnumTypeId() != null ? enumEntity.getEnumTypeId() : "")
                .setEnumCode(enumEntity.getEnumCode() != null ? enumEntity.getEnumCode() : "")
                .setSequenceId(enumEntity.getSequenceId() != null ? enumEntity.getSequenceId() : "")
                .setDescription(enumEntity.getDescription() != null ? enumEntity.getDescription() : "")
                .build();
    }
}
