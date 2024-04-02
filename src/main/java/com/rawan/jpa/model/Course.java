package com.rawan.jpa.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = true)
public class Course extends BaseEntity {

  private String title;
  private String description;

  @ManyToMany(cascade = CascadeType.ALL)
  @JoinTable(
    name = "authors_courses",
    joinColumns = { @JoinColumn(name = "author_id") },
    inverseJoinColumns = { @JoinColumn(name = "course_id") }
  )
  private List<Author> authors;

  @OneToMany(mappedBy = "course")
  private List<Section> sections;
}
