package org.techspark.investment;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.techspark.investment.dto.InvestmentDTO;
import org.techspark.investment.model.Investment;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface InvestmentMapper {

    @Mapping(source = "targetAmount", target = "targetAmount")
    @Mapping(source = "currentAmount", target = "currentAmount")
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "targetDate", ignore = true)
    InvestmentDTO toInvestmentDto(Investment investment);

    List<InvestmentDTO> toInvestmentDtoList(List<Investment> investments);

    Investment toInvestmentEntity(InvestmentDTO investmentDTO);
}
