package hw;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.graph.*;

public class Main {

    public static void main(final String[] args) {

        final String CN = CountryCodes.CN;
        final String VN = CountryCodes.VN;
        final String LA = CountryCodes.LA;
        final String MM = CountryCodes.MM;
        final String NP = CountryCodes.NP;
        final String KG = CountryCodes.KG;

        final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);

        myMap.addVertex(CN);
        myMap.addVertex(VN);
        myMap.addVertex(LA);
        myMap.addVertex(MM);
        myMap.addVertex(NP);
        myMap.addVertex(KG);

        //Add edges for 5 countries that share a border with China

        myMap.addEdge(CN, VN);
        myMap.addEdge(CN, LA);
        myMap.addEdge(CN, MM);
        myMap.addEdge(CN, NP);
        myMap.addEdge(CN, KG);

        //Vietnam also shares a border with Laos
        myMap.addEdge(VN, LA);

        //Laos also shares a border with Myanmar
        myMap.addEdge(LA, MM);

        //System.out.println(myMap.toString());
        System.out.println(myMap);


    }
}
