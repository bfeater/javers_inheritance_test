import java.util.List;

public class Store {

  private List<Bicycle> bicycles;

  public Store(List<Bicycle> bicycles) {
    this.bicycles = bicycles;
  }

  public List<Bicycle> getBicycles() {
    return bicycles;
  }

  public void setBicycles(List<Bicycle> bicycles) {
    this.bicycles = bicycles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Store store = (Store) o;

    if (bicycles != null ? !bicycles.equals(store.bicycles) : store.bicycles != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return bicycles != null ? bicycles.hashCode() : 0;
  }

  @Override
  public String toString() {
    return "Store{" +
        "bicycles=" + bicycles +
        '}';
  }
}
