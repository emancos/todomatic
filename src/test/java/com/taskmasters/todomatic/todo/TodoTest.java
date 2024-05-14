package com.taskmasters.todomatic.todo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;

import org.junit.jupiter.api.Test;

class TodoTest {

    @Test
    void testGettersAndSetters() {
        // Cria um objeto para teste
        Todo todo = new Todo();

        // Define os valores
        Long id = 1L;
        String title = "Estudar para a prova";
        String description = "Revisar álgebra e geometria";
        Instant term = Instant.parse("2024-05-15T10:00:00Z");
        Instant completionDate = Instant.parse("2024-05-14T18:00:00Z");
        Situation situation = Situation.IN_PROGRESS;

        // Define os valores usando setters
        todo.setId(id);
        todo.setTitle(title);
        todo.setDescription(description);
        todo.setTerm(term);
        todo.setCompletionDate(completionDate);
        todo.setSituation(situation);

        // Testa os getters
        assertEquals(id, todo.getId());
        assertEquals(title, todo.getTitle());
        assertEquals(description, todo.getDescription());
        assertEquals(term, todo.getTerm());
        assertEquals(completionDate, todo.getCompletionDate());
        assertEquals(situation, todo.getSituation());
    }

    @Test
    void testNoArgsConstructor() {
        // Testa se o construtor padrão está criando um objeto não nulo
        Todo todo = new Todo();
        assertEquals(Todo.class, todo.getClass());
    }

    @Test
    void testAllArgsConstructor() {
        // Cria um objeto usando o construtor com argumentos
        Long id = 1L;
        String title = "Estudar para a prova";
        String description = "Revisar álgebra e geometria";
        Instant term = Instant.parse("2024-05-15T10:00:00Z");
        Instant completionDate = Instant.parse("2024-05-14T18:00:00Z");
        Situation situation = Situation.IN_PROGRESS;

        Todo todo = new Todo(id, title, description, term, completionDate, situation);

        // Testa se os valores foram atribuídos corretamente
        assertEquals(id, todo.getId());
        assertEquals(title, todo.getTitle());
        assertEquals(description, todo.getDescription());
        assertEquals(term, todo.getTerm());
        assertEquals(completionDate, todo.getCompletionDate());
        assertEquals(situation, todo.getSituation());
    }

    @Test
    void testToString() {
        // Cria um objeto para teste
        Todo todo = new Todo();

        // Define os valores
        Long id = 1L;
        String title = "Estudar para a prova";
        String description = "Revisar álgebra e geometria";
        Instant term = Instant.parse("2024-05-15T10:00:00Z");
        Instant completionDate = Instant.parse("2024-05-14T18:00:00Z");
        Situation situation = Situation.IN_PROGRESS;

        // Define os valores usando setters
        todo.setId(id);
        todo.setTitle(title);
        todo.setDescription(description);
        todo.setTerm(term);
        todo.setCompletionDate(completionDate);
        todo.setSituation(situation);

        // Testa o método toString()
        String expected = "Todo(id=1, title=Estudar para a prova, description=Revisar álgebra e geometria, term=2024-05-15T10:00:00Z, completionDate=2024-05-14T18:00:00Z, situation=IN_PROGRESS)";
        assertEquals(expected, todo.toString());
    }

}
