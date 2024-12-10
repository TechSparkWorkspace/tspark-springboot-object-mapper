package org.techspark.investment.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.techspark.investment.InvestmentMapper;
import org.techspark.investment.InvestmentRepository;
import org.techspark.investment.InvestmentService;
import org.techspark.investment.dto.InvestmentDTO;
import org.techspark.investment.model.Investment;

import java.io.Serial;
import java.util.List;

@Service
@AllArgsConstructor
public class InvestmentServiceImpl implements InvestmentService {

    private final InvestmentRepository investmentRepository;
    private final InvestmentMapper investmentMapper;

    @Override
    public List<InvestmentDTO> getAllInvestments() {
        List<Investment> investments = investmentRepository.findAll();
        return investmentMapper.toInvestmentDtoList(investments);
    }

    @Override
    public InvestmentDTO createInvestment(InvestmentDTO investmentDTO) {
        Investment investment = investmentMapper.toInvestmentEntity(investmentDTO);
        investment = investmentRepository.save(investment);
        return investmentMapper.toInvestmentDto(investment);
    }
}
