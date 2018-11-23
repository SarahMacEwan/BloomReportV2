import java.util.ArrayList;
/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public interface BloomObserver {

    public void update(ArrayList<Bloomable> currentlyInBloom);

    public void subscribe(BloomReport report);

    public void unsubscribe(BloomReport report);
    
    public ArrayList<Bloomable> getTreesInBloom();

}//BloomObserver
