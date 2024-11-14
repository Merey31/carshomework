public class Car {
    private String make;
    private String model;
    private int year;
    private int speed = 0;

    Car(String a, String b, int c) {
        make = a;
        model = b;
        year = c;
    }

    //gets:
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    //sets
    public void setMake(String a) {
        if(a.isEmpty()) {
            System.out.println("Марка не может быть пустой.");
        } else {
            make = a;
        }
    }

    public void setModel(String b) {
        if(b.isEmpty()) {
            System.out.println("Модель не может быть пустой.");
        } else {
            model = b;
        }
    }

    public void setYear(int c) {
        if(c < 2000 || c > 2024) {
            System.out.println("Некорректный год выпуска.");
        } else {
            year = c;
        }
    }

    public void accelerate(int increment) {
        if(increment > 0) {
            speed += increment;
        } else {
            System.out.println("Значение ускорения должно быть положительным.");
        }
    }

    public void brake(int decrement) {
        if(decrement > 0 || (speed - decrement) > 0) {
            speed -= decrement;
        } else {
            System.out.println("Значение замедления должно быть положительным.");
        }
    }

    public void printCarInfo() {
        System.out.println("Марка: " + make);
        System.out.println("Модель: " + model);
        System.out.println("Год выпуска: " + year);
        System.out.println("Текущая скорость: " + speed);

    }
}
