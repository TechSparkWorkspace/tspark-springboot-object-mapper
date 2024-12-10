package org.techspark.investment;

import org.techspark.investment.dto.InvestmentDTO;

import java.util.List;

public interface InvestmentService {
    List<InvestmentDTO> getAllInvestments();
    InvestmentDTO createInvestment(InvestmentDTO investmentDTO);
}
