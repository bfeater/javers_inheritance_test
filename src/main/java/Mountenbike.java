public class Mountenbike extends Bicycle {

  private int seatHeight;

  public Mountenbike(int gears, int seatHeight) {
    super(gears);
    this.seatHeight = seatHeight;
  }

  public int getSeatHeight() {
    return seatHeight;
  }

  public void setSeatHeight(int seatHeight) {
    this.seatHeight = seatHeight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;

    Mountenbike that = (Mountenbike) o;

    if (seatHeight != that.seatHeight) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + seatHeight;
    return result;
  }

  @Override
  public String toString() {
    return "Mountenbike{" +
        "seatHeight=" + seatHeight +
        "} " + super.toString();
  }
}
