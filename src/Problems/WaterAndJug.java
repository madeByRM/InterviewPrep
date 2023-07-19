package Problems;

public class WaterAndJug {
    public static boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        if (jug1Capacity + jug2Capacity < targetCapacity) {
            return false;
        }
        if (jug1Capacity == targetCapacity || jug2Capacity == targetCapacity ||
                jug1Capacity + jug2Capacity == targetCapacity)  {
            return true;
        }

        return targetCapacity % GCD(jug1Capacity, jug2Capacity) == 0;
    }

    private static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
