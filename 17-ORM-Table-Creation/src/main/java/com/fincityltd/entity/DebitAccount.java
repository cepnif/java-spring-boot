package com.fincityltd.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class DebitAccount extends BaseEntity{

    private BigDecimal overdraftFee;
}
