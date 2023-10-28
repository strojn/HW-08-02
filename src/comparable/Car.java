package comparable;

public class Car implements Comparable {
    int speed;
    int price;
    String model;
    String color;

    public Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене + "і т.д"
    public int compareTo(Object o) {    // public int compareTo(Car o) {
        int difference;
        // speedDifference
        difference = this.speed - ((Car)o).speed;
        if (difference == 0)
        {
            // priceDifference
            difference = this.price - ((Car)o).price;
            if (difference == 0)
            {
                // colorDifference
                difference = this.color.compareTo(((Car)o).color);
                if (difference == 0)
                {
                    // modelDifference
                    difference = this.model.compareTo(((Car)o).model);
                }
            }
        }
        return difference;
    }
}
