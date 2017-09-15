package com.webforms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="User")
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(name="NAME", nullable=false)
    private String name;

    @Column(name="AGE", nullable=false)
    private Integer age;

    @Column(name="SALARY", nullable=false)
    private double salary;


}