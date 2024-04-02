package com.rawan.jpa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "videos")
@DiscriminatorValue("VIDEO")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Video extends Resource {
    private String length;
}
