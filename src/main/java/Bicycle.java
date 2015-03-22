public class Bicycle {

  private int gears;

  public Bicycle(int gears) {
    this.gears = gears;
  }

  public int getGears() {
    return gears;
  }

  public void setGears(int gears) {
    this.gears = gears;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Bicycle bicycle = (Bicycle) o;

    if (gears != bicycle.gears) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return gears;
  }

  @Override
  public String toString() {
    return "Bicycle{" +
        "gears=" + gears +
        '}';
  }
}
