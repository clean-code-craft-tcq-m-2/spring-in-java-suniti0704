package statisticker;

import java.util.List;

public class LEDAlert implements IAlerter {
  public boolean ledGlows;

  public void alert() {
    this.ledGlows = true;
  }

}