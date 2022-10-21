

public class EmailAlert implements IAlerter {
  public boolean emailSent;

  public void alert() {
    this.emailSent = true;
  }
}