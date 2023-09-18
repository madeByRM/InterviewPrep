package Problems;

import java.util.Arrays;

public class CarFleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // Create an array of Car objects to store position and time data for each car
        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++) {
            // Calculate the time it takes for each car to reach the target and store it in the Car object
            cars[i] = new Car(position[i], (double)(target - position[i]) / speed[i]);
        }

        // Sort the array of Car objects based on the initial positions in decreasing order
        Arrays.sort(cars, (a, b) -> b.position - a.position);

        int fleets = 0;
        double currTime = 0;

        for (Car car : cars) {
            // If the time for the current car to reach the target is greater than the current time,
            // it means this car forms a new fleet that arrives later.
            if (car.time > currTime) {
                fleets++;
                currTime = car.time;
            }
        }
        return fleets;
    }
}

class Car {
    int position;
    double time;

    public Car(int position, double time) {
        this.position = position;
        this.time = time;
    }
}
