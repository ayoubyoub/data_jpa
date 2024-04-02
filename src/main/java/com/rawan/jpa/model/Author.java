package com.rawan.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "authors")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = true)
public class Author extends BaseEntity {

  private String first_name;
  private String last_name;

  @NotEmpty
  @Email
  @Column(name = "email", unique = true, nullable = false, length = 35)
  private String email;

  @ManyToMany(mappedBy = "authors")
  private List<Course> courses;
}
