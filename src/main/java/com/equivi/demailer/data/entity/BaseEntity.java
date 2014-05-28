package com.equivi.demailer.data.entity;

import javax.persistence.*;
import java.io.Serializable;


@MappedSuperclass
public abstract class BaseEntity implements Serializable {


    private static final long serialVersionUID = -1829668163582245326L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Version
    private Long version;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
