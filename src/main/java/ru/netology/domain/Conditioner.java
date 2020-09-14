package ru.netology.domain;

public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    // Создаем метод для увеличения температуры
    public void increaseCurrentTemperature() {
        // Если текущая температура достигнет значения максимальной температуры, заканчиваем выполнение функции
        if (currentTemperature == maxTemperature) { return; }
        // Каждый раз после прохождения функции, увеличиваем текущую температуру на 1 (++)
        this.currentTemperature++;
    }

    // Создаем метод для уменьшения температуры
    public void decreaseCurrentTemperature() {
        // Если текущая температура достигнет значения минимальной температуры, заканчиваем выполнение функции
        if (currentTemperature == minTemperature) { return; }
        // Каждый раз после прохождения функции, уменьшаем текущую температуру на 1 (++)
        this.currentTemperature--;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMaxTemperature() { return maxTemperature; }
    public void setMaxTemperature(int maxTemperature) { this.maxTemperature = maxTemperature; }

    public int getMinTemperature() { return minTemperature; }
    public void setMinTemperature(int minTemperature) { this.minTemperature = minTemperature; }

    public int getCurrentTemperature() {
        return currentTemperature;
    }
    public void setCurrentTemperature(int currentTemperature) {
        // Если текукщая температура становится больше максимальной, то
        // текущая температура принимает значение максимальной температуры, и
        // Прекращается выполнение функции
        if (currentTemperature > maxTemperature) {
            this.currentTemperature = maxTemperature;
            return;
        }
        // Если текукщая температура становится меньше минимальной, то
        // текущая температура принимает значение минимальной температуры, и
        // Прекращается выполнение функции
        if (currentTemperature < minTemperature) {
            this.currentTemperature = minTemperature;
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() { return on; }
    public void setOn(boolean on) { this.on = on; }
}
