package statisticker;

import java.util.List;

public class EmailAlert implements IAlerter {
  public boolean emailSent;

  public void alert() {
    this.emailSent = true;
  }
}