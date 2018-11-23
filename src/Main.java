import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

/**
 * Created by Sarah and Sienna
 * COMP 3721
 * LW A1
 */
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       BloomReport report;
	   FloweringTree  frank, bms, crab;
	   ArrayList<FloweringTrees> treeList; 
	   Observer observer;
	
	   
		frank = new FloweringTree("Franklin");
		bms = new FloweringTree("BlueMist");
		crab = new FloweringTree("Crabapple");
		treeList = new ArrayList<FloweringTrees>();
	    treeList.add(frank);
	    treeList.add(bms);
	    treeList.add(crab);
		report = new BloomReport();
		report.addFloweringTrees(frank, bms, crab);
		observer=new Bumblebee();
 	   
		boolean b=report.isSubscriber(observer);
 	
 	   System.out.println(b);
 	
 	  
 	    
    }
}
