/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julian
 */
public class Arboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gramar grammar = new Gramar();
        grammar.addProduction("S", "aA");
        grammar.addProduction("A", "aA");
        grammar.addProduction("A", "bA");
        grammar.addProduction("A", "b");
        grammar.setStartSymbol("S");
        grammar.getSymbolNoTerminal().add("S");
        grammar.getSymbolNoTerminal().add("A");
        grammar.getSymbolNoTerminal().add("R");

        TreeGeneralDerivation tree = new TreeGeneralDerivation(grammar);
        
        
        tree.runBuild();
        System.out.println(tree.getRoot().getValue());
        for (int i = 0; i < tree.getRoot().getChildren().size(); i++) {
            System.out.println("-- : " + tree.getRoot().getChildren().get(i).getValue());
            for (int j = 0; j < tree.getRoot().getChildren().get(i).getChildren().size(); j++) {
                System.out.println("---- : " + tree.getRoot().getChildren().get(i).getChildren().get(j).getValue());
                for (int k = 0; k < tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().size(); k++) {
                    System.out.println("------ : " + tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().get(k).getValue());
                    for (int g = 0; g < tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().get(k).getChildren().size(); g++) {
                        System.out.println("-------- : " + tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().get(k).getChildren().get(g).getValue());
                    }
                }
            }
        }
        //System.out.println("llllllllllllllllllllllllllllllllllllllllllllllll");
//        ArrayList<String> treePrint = new ArrayList<>();
//        
//        treePrint.add(tree.getRoot().getValue());
//        for (int i = 0; i < tree.getRoot().getChildren().size(); i++) {
//            treePrint.add("\n-- : " + tree.getRoot().getChildren().get(i).getValue());
//            for (int j = 0; j < tree.getRoot().getChildren().get(i).getChildren().size(); j++) {
//                treePrint.add("\n---- : " + tree.getRoot().getChildren().get(i).getChildren().get(j).getValue());
//                for (int k = 0; k < tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().size(); k++) {
//                    treePrint.add("\n------ : " + tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().get(k).getValue());
//                    for (int g = 0; g < tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().get(k).getChildren().size(); g++) {
//                        treePrint.add("\n-------- : " + tree.getRoot().getChildren().get(i).getChildren().get(j).getChildren().get(k).getChildren().get(g).getValue());
//                    }
//                }
//            }
//        }
//        
//        for (int i = 0; i < treePrint.size(); i++) {
//            System.out.println(treePrint.get(i));
//        }
        
        
        
        
        
    }   
    
    
    

}
