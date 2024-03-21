package CollectionFramework.ArrayList;

import java.awt.*;
import java.util.TreeSet;

class Coordinates implements Comparable{

    int x, y;
    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        Coordinates p = (Coordinates) o;

        if(p.x>this.x){
            return 1;
        } else if (p.x<this.x) {
            return -1;
        }
        else {
            if(p.y>this.y){return 1;}
            else if (p.y<this.y) {return -1;}
            else return 0;
        }
    }
    @Override
    public String toString(){
        return this.x+","+this.y;
    }



}

public class TreeSetAndComparable {
    public static void main(String[] args) {

        TreeSet<Coordinates> ts = new TreeSet<>();
        ts.add(new Coordinates(5,3));
        ts.add(new Coordinates(1,0));
        ts.add(new Coordinates(5,4));
        ts.add(new Coordinates(0,7));
        ts.add(new Coordinates(8,0));
        ts.add(new Coordinates(8,3));

        System.out.println(ts);

    }

}
