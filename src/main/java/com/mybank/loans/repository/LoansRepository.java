package com.mybank.loans.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mybank.loans.entity.Loans;

public interface LoansRepository extends JpaRepository<Loans, Long> {

	Optional<Loans> findByMobileNumber(String mobileNumber);

	Optional<Loans> findByLoanNumber(String loanNumber);
}
