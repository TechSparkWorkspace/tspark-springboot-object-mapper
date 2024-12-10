package org.techspark.investment;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.techspark.investment.dto.InvestmentDTO;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/investments")
public class InvestmentController {

    private final InvestmentService investmentService;

    @GetMapping
    public List<InvestmentDTO> getAllInvestments() {
        return investmentService.getAllInvestments();
    }

    @PostMapping
    public InvestmentDTO createInvestment(@RequestBody InvestmentDTO investmentDTO) {
        return investmentService.createInvestment(investmentDTO);
    }

}
