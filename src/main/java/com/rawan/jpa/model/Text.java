package com.rawan.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "texts")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
@PrimaryKeyJoinColumn(name = "text_id")
public class Text extends Resource {

  private String content;
}
