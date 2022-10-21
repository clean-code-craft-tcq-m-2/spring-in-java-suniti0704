package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        if (numbers.size() == 0) {
            return new Stats(Float.NaN, Float.NaN, Float.NaN);
        }
        float min = Collections.min(numbers);
        float max = Collections.max(numbers);
        float average = getAverage(numbers);

        return new Stats(min, max, average);
    }



    private static float getAverage(List<Float> list) {
        float sum = 0;
        for (float i: list) {
            sum += i;
        }
        return list.size() > 0 ? (float) sum / list.size() : 0;
    }

    public static class Stats {
        public Float min;
        public Flot max;
        public Float average;

        private List<Float> numbers;

        public Stats(float min, float max, float average) {
            this.min = min;
            this.max = max;
            this.average = average;
        }
    }
}
