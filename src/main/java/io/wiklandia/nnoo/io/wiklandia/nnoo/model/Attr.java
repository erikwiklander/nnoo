package io.wiklandia.nnoo.io.wiklandia.nnoo.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Wither;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
@ToString(callSuper = true)
public class Attr extends BaseEntity {
    @ManyToOne
    private Obj obj;

    @ManyToOne
    private Val val;
}
