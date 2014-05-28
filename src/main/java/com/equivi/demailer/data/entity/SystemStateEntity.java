package com.equivi.demailer.data.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "config01_system_state")
public class SystemStateEntity extends AuditableEntity {

    private static final long serialVersionUID = 4706645681222621190L;

    private String state_name;

    private String state_value;

    public String getState_name() {
        return state_name;
    }

    public void setState_name(String state_name) {
        this.state_name = state_name;
    }

    public String getState_value() {
        return state_value;
    }

    public void setState_value(String state_value) {
        this.state_value = state_value;
    }
}
