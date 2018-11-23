import java.util.ArrayList;
/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public class FloweringTree implements Bloomable{

    private String name;
    private boolean blossoming;
    private ArrayList<BloomReport> reports;

    public FloweringTree(String treeName){
        name = treeName;
        blossoming=false;
        reports=new ArrayList<>();
    }//FloweringTree
    @Override
    
    public void addReport(BloomReport newReport) {
    	if(reports.indexOf(newReport)==-1&& newReport!=null)
    		reports.add(newReport);
    }//addReporter
    
    @Override
    public void removeReport(BloomReport toRemove) {
    	reports.remove(toRemove);
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
        if(reports.size()!=0 && reports!=null) {
        	for(BloomReport r:reports) {
        		r.notifySubscribers();
        	}
        }  
    }//setBlossomState
    
    //Additional Methods for Testing
    public boolean hasRefToReport(BloomReport report) {
    	return reports.indexOf(report)!=-1;
    }
    
    public int numReports() {
    	return reports.size();
    }

}//FloweringTree
