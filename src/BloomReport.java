import java.util.ArrayList;

/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public class BloomReport {

    private ArrayList<Observer> observerList = new ArrayList<>();

    private ArrayList<FloweringTrees> floweringTreeList = new ArrayList<>();

    public BloomReport(){}

    public void sendUpdates(){
        ArrayList<FloweringTrees> blooming = new ArrayList<FloweringTrees>();
        for(Observer sub: observerList){
            for(FloweringTrees tree: floweringTreeList){
                if(tree.getBlossomState()) {
                    blooming.add(tree);
                }
            }
            sub.updates(blooming);
        }

    }

    public void addFloweringTrees(FloweringTrees ... trees){
        for(FloweringTrees tree: trees){
            floweringTreeList.add(tree);
        }
    }

    public void addSubscribers(Observer newSubscriber){
        observerList.add(newSubscriber);
    }

    public void unsubscribe(Observer unsub){
        observerList.remove(unsub);
    }

    public void extinctPlant(FloweringTrees extTree){
        floweringTreeList.remove(extTree);
    }


}
