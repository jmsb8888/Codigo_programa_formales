/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.*;
/**
 */
public class Gramar {
    private Map<String, List<String>> productions;
    private String startSymbol;
    private ArrayList<String> symbolTerminal;
    private ArrayList<String> symbolNoTerminal;
   
    
    public Gramar() {
        productions = new HashMap<>();
        symbolTerminal = new ArrayList<>();
        symbolNoTerminal = new ArrayList<>();
        startSymbol = "";
    }

    public void addProduction(String leftSide, String rightSide) {
        if (!productions.containsKey(leftSide)) {
            productions.put(leftSide, new ArrayList<>());
        }
        productions.get(leftSide).add(rightSide);
    }

    public void setStartSymbol(String startSymbol) {
        this.startSymbol = startSymbol;
    }

    public String getStartSymbol() {
        return startSymbol;
    }

    public List<String> getProduction(String symbol) {
        return productions.get(symbol);
    }

    public Map<String, List<String>> getProductions() {
        return productions;
    }
    
    public boolean isTerminal(String symbol) {
        return !productions.containsKey(symbol);
    }

    public ArrayList<String> getSymbolTerminal() {
        return symbolTerminal;
    }

    public void setSymbolTerminal(ArrayList<String> symbolTerminal) {
        this.symbolTerminal = symbolTerminal;
    }

    public ArrayList<String> getSymbolNoTerminal() {
        return symbolNoTerminal;
    }
    public String getSymbolNoTerminalInd(int count) {
       return  symbolNoTerminal.get(count);
    }

    public void setSymbolNoTerminal(ArrayList<String> symbolNoTerminal) {
        this.symbolNoTerminal = symbolNoTerminal;
    }
    
    
    
}
