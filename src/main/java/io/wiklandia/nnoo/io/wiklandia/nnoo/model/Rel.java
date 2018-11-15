package io.wiklandia.nnoo.io.wiklandia.nnoo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@Entity
@ToString(callSuper = true)
public class Rel extends BaseEntity{

    @ManyToOne
    private Obj from;

    @ManyToOne
    private Obj to;
}
