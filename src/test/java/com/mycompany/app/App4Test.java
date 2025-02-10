package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class App4Test
{
    @Test
    public void testAppConstructor() {
        App4 app1 = new App4();
        App4 app2 = new App4();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        App4 app = new App4();
        assertEquals("Hello World123", app.getMessage());
    }
}
