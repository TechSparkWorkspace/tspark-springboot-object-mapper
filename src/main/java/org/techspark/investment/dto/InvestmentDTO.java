package org.techspark.investment.dto;

import lombok.Data;

@Data
public class InvestmentDTO {

    private String goalName;
    private double targetAmount;
    private double currentAmount;
}
