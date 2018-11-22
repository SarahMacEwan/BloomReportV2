import java.util.ArrayList;

/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public interface Observer {

    public void updates(ArrayList<FloweringTrees> currentlyInBloom);

    public void subscribe(BloomReport report);

    public void unsubscribe(BloomReport report);

}
