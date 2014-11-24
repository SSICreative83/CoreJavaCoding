/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interview.Storm8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author huijun
 */

//http://shashank.ramaprasad.com/tag/bay-bridges-challenge/
//http://bryceboe.com/2006/10/23/line-segment-intersection-algorithm/

//http://deepinthecode.com/2014/03/26/key-solving-codeevals-bay-bridges-challenge/

public class BayBridge {
    
    class Point {
        double x;
        double y;
        public Point(double x, double y){
            this.x = x;
            this.y = y;
        }
    }
    
    class Bridge {
        int id;
        Point point1;
        Point point2;
        public Bridge(int id, Point A, Point B){
            this.id = id;
            this.point1 = A;
            this.point2 = B;
        }
    }
    
    boolean counterClockWise(Point a, Point b, Point c){
        return (a.y - c.y) * (a.x - b.x) > (a.y - b.y) * (a.x - c.x);
    }
    
    boolean cross(Bridge b1, Bridge b2){
        return (counterClockWise(b1.point1, b2.point1, b2.point2) != counterClockWise(b1.point2, b2.point1, b2.point2)) &&
                (counterClockWise(b1.point1, b1.point2, b2.point1) != counterClockWise(b1.point1, b1.point2, b2.point2));
    }
    
    boolean feasible(ArrayList<Bridge> bridges){ //bridges is a subset of all bridges
        for(int i = 0; i < bridges.size(); i++){
            for(int j = i + 1; j < bridges.size(); j++){
                if(cross(bridges.get(i), bridges.get(j)))   return false;
            }
        }
        return true;
    }
    
    public ArrayList<Integer> bridges(File file) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        ArrayList<Bridge> allbridges = new ArrayList<>();
        
        String line;
        while ((line = br.readLine()) != null) {
            //System.out.println(line);
            String[] cur = line.split(":");
            int id = Integer.parseInt(cur[0]);            
            String points = cur[1].trim();
            points = points.substring(2, points.length() - 2);          
            String[] pointsArray = points.split(",");
            double x1 = Double.parseDouble(pointsArray[0]);
            double y1 = Double.parseDouble(pointsArray[1].substring(1, pointsArray[1].length() - 1));
            double x2 = Double.parseDouble(pointsArray[2].substring(2));
            double y2 = Double.parseDouble(pointsArray[3].substring(1));
            Point A = new Point(x1, y1);
            Point B = new Point(x2, y2);
            Bridge newBridge = new Bridge(id, A, B);
            allbridges.add(newBridge);
            
        }
        br.close(); 
        
        //get all subsets
        ArrayList<ArrayList<Bridge>> allsubsets = new ArrayList<>();
        ArrayList<Bridge> tmp = new ArrayList<>();
        allsubsets.add(tmp);
        
        dfs(allbridges, 0, allbridges.size() - 1, tmp, allsubsets);
        
        //sort all subsets
        Collections.sort(allsubsets, new lengthComparator());
        
        //return the first feasible subset (which is longest)
        ArrayList<Integer> result = new ArrayList<>();
        for(ArrayList<Bridge> subset : allsubsets){
            if(feasible(subset)){
                //System.out.println("this is feasible");
                //System.out.println(subset.size());
                for(Bridge bri : subset){
                    result.add(bri.id);
                }
                break;
            }
        }
        return result;
    }
    
    void dfs(ArrayList<Bridge> allbridges, int start, 
            int end, ArrayList<Bridge> tmp, ArrayList<ArrayList<Bridge>> allsubsets){
        if(start > end) return;
        
        for(int i = start; i <= end; i++){
            ArrayList<Bridge> ntmp = new ArrayList<>(tmp);
            ntmp.add(allbridges.get(i));
            allsubsets.add(ntmp);
            dfs(allbridges, i + 1, end, ntmp, allsubsets);
        }
    }
    
    public class lengthComparator implements Comparator<ArrayList>{

        @Override
        public int compare(ArrayList o1, ArrayList o2) {
            return o2.size()- o1.size() ;
        }
    
    }
    
    public static void main(String[] args)throws Exception{
        
        File f = new File(args[0]);
        //File f = new File("./src/Interview/Storm8/input.txt");
        BayBridge test = new BayBridge();
        ArrayList<Integer> result = test.bridges(f);
       // System.out.println(result.size());
        for(int i : result){
            System.out.println(i);
        }
    }
}
