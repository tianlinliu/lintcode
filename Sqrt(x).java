class Sqrt(x) {
    /**
     * Time: O(logN)
     * Space: O(1)
     *
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        if (x <= 0) {
            return 0;
        }

        long low = 1;
        long high = x;
        while (low + 1 < high) {
            long mid = low + (high - low) / 2;
            if (mid * mid < x) {
                low = mid;
            } else {
                high = mid;
            }
        }
        if (high * high <= x) {
            return (int)high;
        } else {
            return (int)low;
        }
    }
}
