package com.orbund.galactic.be.common.entities.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class SampleEntity extends BaseEntity{

    private static final long serialVersionUID = 5712987464243373687L;

    @Column(nullable = false)
    private String sample;

}
