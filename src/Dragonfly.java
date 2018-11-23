import java.util.ArrayList;

/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public class Dragonfly implements Observer {

    private ArrayList<FloweringTrees> treesInBloom;

    public Dragonfly(){}

    @Override
    public void update(ArrayList<FloweringTrees> currentlyInBloom) {
    	treesInBloom = currentlyInBloom;	
    }

    @Override
    public void subscribe(BloomReport report) {
        report.addSubscriber(this);
    }

    @Override
    public void unsubscribe(BloomReport report) {
        report.removeSubscriber(this);
    }

    public ArrayList<FloweringTrees> getTreesInBloom(){
        return treesInBloom;
    }
}
