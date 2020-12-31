package com.fincityltd.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CreditAccount extends BaseEntity {

    BigDecimal creditLimit;

}
