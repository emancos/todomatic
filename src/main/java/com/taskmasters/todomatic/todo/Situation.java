package com.taskmasters.todomatic.todo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Situation {

  PENDING("Pending"),
  IN_PROGRESS("In progress"),
  COMPLETED("Completed");

  private final String status;
}