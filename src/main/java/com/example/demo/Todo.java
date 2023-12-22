package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Todo {

        public Todo(String description, boolean done) {
            this.description = description;
            this.done = done;
        }

        @Id
        @GeneratedValue
        private Long id;

        private String description;

        private boolean done;


}
