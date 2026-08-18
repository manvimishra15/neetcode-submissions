class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        // Minimum capacity = maximum weight
        // Maximum capacity = sum of all weights
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                high = mid;       // try smaller capacity
            } else {
                low = mid + 1;    // need larger capacity
            }
        }

        return low;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int daysUsed = 1;
        int currentWeight = 0;

        for (int w : weights) {
            if (currentWeight + w > capacity) {
                daysUsed++;
                currentWeight = 0;
            }

            currentWeight += w;
        }

        return daysUsed <= days;
    }
}