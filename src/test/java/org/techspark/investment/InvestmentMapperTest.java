package org.techspark.investment;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.techspark.investment.dto.InvestmentDTO;
import org.techspark.investment.model.Investment;

import static org.junit.jupiter.api.Assertions.assertEquals;


class InvestmentMapperTest {

    private final InvestmentMapper mapper = Mappers.getMapper(InvestmentMapper.class);


    @Test
    void toInvestmentDto() {
        Investment investment = new Investment();
        investment.setId(1L);
        investment.setGoalName("Save for a car");
        investment.setTargetAmount(20000);
        investment.setCurrentAmount(5000);
        investment.setTargetDate("2025-01-01");

        InvestmentDTO dto = mapper.toInvestmentDto(investment);

        assertEquals("Save for a car", dto.getGoalName());
        assertEquals(20000, dto.getTargetAmount());
        assertEquals(5000, dto.getCurrentAmount());
    }

    @Test
    void toInvestmentEntity() {
        InvestmentDTO dto = new InvestmentDTO();
        dto.setGoalName("Save for a car");
        dto.setTargetAmount(20000);
        dto.setCurrentAmount(5000);

        Investment investment = mapper.toInvestmentEntity(dto);

        assertEquals("Save for a car", investment.getGoalName());
        assertEquals(20000, investment.getTargetAmount());
        assertEquals(5000, investment.getCurrentAmount());
    }
}