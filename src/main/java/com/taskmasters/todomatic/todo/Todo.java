package com.taskmasters.todomatic.todo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "todos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false, length = 100)
  private String title;
  @Column(nullable = false, length = 250)
  private String description;
  @Column(nullable = false)
  private Instant term;
  private Instant completionDate;
  @Column(nullable = false)
  private Situation situation;
}
