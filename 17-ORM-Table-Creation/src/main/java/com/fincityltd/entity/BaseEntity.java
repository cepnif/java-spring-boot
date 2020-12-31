package com.fincityltd.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.math.BigDecimal;

@MappedSuperclass
public class BaseEntity {

    @Id
    private Long id;
    private String owner;
    private BigDecimal balance;
    private BigDecimal interestRate;
}
