package org.techspark.investment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.techspark.investment.model.Investment;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
