
public class StatsChecker {
  private float maxThreshold;
  private IAlerter alerters[];

  public StatsChecker(Float maxThreshold, IAlerter[] alerters) {
    this.maxThreshold = maxThreshold;
    this.alerters = alerters;
  }

  public void checkAndAlert(List<Float> numberList) {
    Statistics.Stats stats = Statistics.getStatistics(numberList);

    if (stats.max > maxThreshold) {
        for (IAlerter alerter : alerters) {
            alerter.alert();
        }
    }
  }

}