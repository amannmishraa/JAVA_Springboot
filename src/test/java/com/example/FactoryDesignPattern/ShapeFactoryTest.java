package com.example.FactoryDesignPattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {

    private final ShapeFactory factory = new ShapeFactory();

    @Test
    void shouldReturnCircleObject() {
        Shape shape = factory.getShape("CIRCLE");

        assertNotNull(shape);
        assertTrue(shape instanceof Circle);
    }

    @Test
    void shouldReturnRectangleObject() {
        Shape shape = factory.getShape("RECTANGLE");

        assertNotNull(shape);
        assertTrue(shape instanceof Rectangle);
    }

    @Test
    void shouldReturnNullForInvalidShape() {
        Shape shape = factory.getShape("TRIANGLE");

        assertNull(shape);
    }

    @Test
    void shouldReturnNullWhenInputIsNull() {
        Shape shape = factory.getShape(null);

        assertNull(shape);
    }
}