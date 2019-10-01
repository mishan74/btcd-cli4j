package com.neemre.btcdcli4j.core.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Balances {
    private BigDecimal total;
    private BigDecimal spendable;
    private BigDecimal pending;

    public Balances(BigDecimal total, BigDecimal spendable, BigDecimal pending) {
        this.total = total;
        this.spendable = spendable;
        this.pending = pending;
    }
}
