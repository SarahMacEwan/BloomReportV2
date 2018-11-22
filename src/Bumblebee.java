import java.util.ArrayList;

/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public class Bumblebee implements Observer {

    private ArrayList<FloweringTrees> treesInBloom;

    public Bumblebee(){}

    @Override
    public void updates(ArrayList<FloweringTrees> currentlyInBloom) {
        treesInBloom = currentlyInBloom;
    }

    @Override
    public void subscribe(BloomReport report) {
        report.addSubscribers(this);
    }

    @Override
    public void unsubscribe(BloomReport report) {
        report.unsubscribe(this);
    }

    public ArrayList<FloweringTrees> getTreesInBloom(){
        return treesInBloom;
    }
}
