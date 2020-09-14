package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(36);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(25);
        conditioner.increaseCurrentTemperature();
        assertEquals(26, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(36);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(25);
        conditioner.decreaseCurrentTemperature();
        assertEquals(24, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldIncreaseToMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(36);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(36);
        conditioner.increaseCurrentTemperature();
        assertEquals(36, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldDecreaseToMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(36);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(15);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldCurrentOverMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(36);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(37);
        conditioner.increaseCurrentTemperature();
        assertEquals(36, conditioner.getCurrentTemperature());
    }

    @Test
    public void shouldCurrentUnderMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(36);
        conditioner.setMinTemperature(15);
        conditioner.setCurrentTemperature(14);
        conditioner.decreaseCurrentTemperature();
        assertEquals(15, conditioner.getCurrentTemperature());
    }
}