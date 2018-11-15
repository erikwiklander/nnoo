package io.wiklandia.nnoo.io.wiklandia.nnoo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@ToString(callSuper = true)
public class Val extends BaseEntity {
    private String string;
    private LocalDate localDate;
    private BigDecimal bigDecimal;
    private Integer integer;
}
