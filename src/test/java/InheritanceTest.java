import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.junit.Test;

import java.util.ArrayList;

public class InheritanceTest {

  @Test
  public void test() {
    Store store0 = new Store(new ArrayList<Bicycle>());
    store0.getBicycles().add(new Mountenbike(10, 5));
    Store store1 = new Store(new ArrayList<Bicycle>());
    store1.getBicycles().add(new Bicycle(5));

    Javers javers = JaversBuilder.javers().build();
    Diff diff = javers.compare(store0, store1);
    // here I would expect a Diff with a ListChange containing
    //   one ValueRemoved (the Mountenbike(10, 5)) and
    //   one ValueAdded (the Bicycle(5))
    // but I get an IllegalArgumentException, because Javers compares store0.bicycles[0]
    // with store1.bicycles[0] based upon store0.bicycles[0] type, ignoring that the objects
    // have different types; I think the comparison misses a type check
  }

}
