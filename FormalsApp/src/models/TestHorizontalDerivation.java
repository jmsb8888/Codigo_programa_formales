package models;

import models.Gramar;
import models.DerivationWord;

public class TestHorizontalDerivation {
    public static void main(String[] args) {
        Gramar grammar= new Gramar();
        grammar.addProduction("S", "aA");
        grammar.addProduction("A", "aA");
        grammar.addProduction("A", "bA");
        grammar.addProduction("A", "b");
        grammar.setStartSymbol("S");
        grammar.getSymbolNoTerminal().add("S");
        grammar.getSymbolNoTerminal().add("A");
        grammar.getSymbolTerminal().add("a");
        grammar.getSymbolTerminal().add("b");

        DerivationWord word= new DerivationWord(grammar);
        word.deriveWord("babab");
        System.out.println(word.getHorizontalDerivation());
    }
}
