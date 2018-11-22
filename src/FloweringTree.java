/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public class FloweringTree implements FloweringTrees{

    private String name;
    private boolean blossoming = false;

    public FloweringTree(String treeName){
        name = treeName;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public boolean getBlossomState(){
        return blossoming;
    }

    @Override
    public void setBlossomState(boolean bState, BloomReport report){
        blossoming = bState;
        report.sendUpdates();
    }

}
