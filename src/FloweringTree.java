import java.util.ArrayList;

/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public class FloweringTree implements Bloomable{

    private String name;
    private boolean blossoming;
    private ArrayList<BloomReport> reporters;

    public FloweringTree(String treeName){
        name = treeName;
        blossoming=false;
        reporters=new ArrayList<>();
    }//FloweringTree
    @Override
    
    public void addReporter(BloomReport newReporter) {
    	if(reporters.indexOf(newReporter)!=-1)
    		reporters.add(newReporter);
    }//addReporter
    
    @Override
    public void removeReporter(BloomReport toRemove) {
    	reporters.remove(toRemove);
    }//addReporter
    
    @Override
    public String getName(){
        return name;
    }//getName

    @Override
    
    public boolean getBloomState(){
        return blossoming;
    }//getBlossomState

    @Override
    public void setBloomState(boolean bState){
        blossoming = bState;
        if(reporters!=null) {
        	for(BloomReport r:reporters) {
        		 r.notifySubscribers();
        	}
        }  
    }//setBlossomState

}
