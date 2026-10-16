
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TodoListTest {

    @Test
    void addAndList() {
        TodoList todoList = new TodoList();

        todoList.add(" task1 ");

        assertEquals(1, todoList.size());
        assertEquals("task1", todoList.getAll().getFirst());
    }

    @Test
    void remove() {
        TodoList todoList = new TodoList();

        todoList.add("a");
        todoList.add("b");

        assertTrue(todoList.remove(0));
        assertEquals(1, todoList.size());
        assertEquals("b", todoList.getAll().getFirst());

        assertFalse(todoList.remove(10));
        assertFalse(todoList.remove(-1));
    }

    @Test
    void addEmptyIgnored() {
        TodoList todoList = new TodoList();

        todoList.add("   ");
        todoList.add("");

        assertEquals(0, todoList.size());
    }

    @Test
    void addNullIgnored() {
        TodoList todoList = new TodoList();

        todoList.add(null);

        assertEquals(0, todoList.size());
    }
}
