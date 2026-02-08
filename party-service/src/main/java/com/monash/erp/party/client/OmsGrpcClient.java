package com.monash.erp.party.client;

import com.monash.erp.party.dto.EnumerationDto;
import com.monash.erp.oms.common.grpc.EnumerationGrpcServiceGrpc;
import com.monash.erp.oms.common.grpc.EnumerationTypeRequest;
import com.monash.erp.oms.common.grpc.EnumerationListResponse;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OmsGrpcClient {

    @GrpcClient("oms-service")
    private EnumerationGrpcServiceGrpc.EnumerationGrpcServiceBlockingStub enumerationStub;

    public List<EnumerationDto> getEnumerationsByType(String enumTypeId) {
        EnumerationTypeRequest request = EnumerationTypeRequest.newBuilder()
                .setEnumTypeId(enumTypeId)
                .build();

        EnumerationListResponse response = enumerationStub.getEnumerationsByType(request);

        return response.getEnumerationsList().stream()
                .map(this::toEnumerationDto)
                .collect(Collectors.toList());
    }

    private EnumerationDto toEnumerationDto(com.monash.erp.oms.common.grpc.EnumerationResponse grpcEnum) {
        return EnumerationDto.builder()
                .enumId(grpcEnum.getEnumId())
                .enumTypeId(grpcEnum.getEnumTypeId())
                .enumCode(grpcEnum.getEnumCode())
                .sequenceId(grpcEnum.getSequenceId())
                .description(grpcEnum.getDescription())
                .build();
    }
}
