

public class LEDAlert implements IAlerter {
  public boolean ledGlows;

  public void alert() {
    this.ledGlows = true;
  }

}