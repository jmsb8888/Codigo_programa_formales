/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import models.Node;
import models.Gramar;
import java.util.*;
/**
 *
 * @author julian
 */
public class TreeGeneralDerivation {
    private Gramar grammar;
    private Node root;

    public Node getRoot() {
        return root;
    }
    
    public TreeGeneralDerivation(Gramar grammar) {
        this.grammar = grammar;
    }
    
    public void runBuild(){
        root = new Node(grammar.getStartSymbol());
        buildTree(root);
        buildChildrenTree();
    }
    
    public void buildTree(Node root1) {
        if(isSymbolNoTerminal(root1.getValue())){
            List<Node> listChildren = getChildrensInTree(root1.getValue());
            for (int i = 0; i < listChildren.size(); i++) {
                root1.addChild(listChildren.get(i));
            }
        }
    }
    
    public void buildChildrenTree() {
        for (int j = 0; j < root.getChildren().size(); j++) {
            buildTree(root.getChildren().get(j));
            for (int i = 0; i < root.getChildren().get(j).getChildren().size(); i++) {
                buildTree(root.getChildren().get(j).getChildren().get(i));
                for (int k = 0; k < root.getChildren().get(j).getChildren().get(i).getChildren().size(); k++) {
                    buildTree(root.getChildren().get(j).getChildren().get(i).getChildren().get(k));
                    for (int h = 0; h < root.getChildren().get(j).getChildren().get(i).getChildren().get(k).getChildren().size(); h++) {
                        root.getChildren().get(j).getChildren().get(i).getChildren().get(k).getChildren().get(h);
                    }
                }
            }
        }
    }
    
    public boolean isInProductions(String node){
        for (String key : grammar.getProductions().keySet()) {
            String aux = key;
            if((aux).equals(node)){
                return true;
            }
        }
        return false;
    }
    
    public boolean isSymbolNoTerminal(String node) {
        for (int i = 0; i < node.length(); i++) {
            for (int j = 0; j < grammar.getSymbolNoTerminal().size(); j++) {
                char c1 = node.charAt(i);
                char c2 = grammar.getSymbolNoTerminal().get(j).charAt(0);
                if (c1 == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    public List<Node> getChildrensInTree(String node){
        List<Node> children = new ArrayList<Node>();
        for (int i = 0; i < node.length(); i++) {            
            for (int j = 0; j < grammar.getSymbolNoTerminal().size(); j++) {
                char c1 = node.charAt(i);
                char c2 = grammar.getSymbolNoTerminal().get(j).charAt(0);
                if (c1 == c2) {
                    if(isInProductions(c2+"")){
                    for (int k = 0; k < grammar.getProduction(grammar.getSymbolNoTerminal().get(j)).size(); k++) {
                        String aux= node.substring(0, i) + grammar.getProduction(grammar.getSymbolNoTerminal().get(j)).get(k) + node.substring(i+1, node.length());
                        children.add(new Node(aux));
                    }}
                }
            }
        }
        return children;
    }
    
    public Gramar getGrammar() {
        return grammar;
    }

    public void setGrammar(Gramar grammar) {
        this.grammar = grammar;
    }
    
    
    
}
