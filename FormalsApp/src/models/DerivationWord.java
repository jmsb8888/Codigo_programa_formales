package models;

import java.util.ArrayList;
import java.util.List;

public class DerivationWord {
    private final String  SEPARATOR =" --> ";


    private Gramar gramar;
    private ArrayList<String> horizontalDerivation;
    
    public DerivationWord(Gramar gramar) {
        this.gramar = gramar;
        horizontalDerivation = new ArrayList();
    }
    
    public boolean IsValidateWord(String wordForDerive){
        String wordValidated="";
        if(isValidateAxiom(wordForDerive)){
            for (int i = 0; i < wordForDerive.length(); i++) {
                wordValidated += checkIteration(wordForDerive, i);
            }
        }
        return wordValidated.equals(wordForDerive);
    }
    
    public String deriveWord(String wordForDerive){
        String wordValidated="";
        if(isValidateAxiom(wordForDerive)){
            for (int i = 0; i < wordForDerive.length(); i++) {
                wordValidated += checkIteration(wordForDerive, i);
            }
        }

        return wordValidated;
    }

    public String getHorizontalDerivation() {
        String horizontalTree="";
        for (String a : horizontalDerivation) {
            horizontalTree +=a;
        }
        return horizontalTree;
    }


    private boolean isValidateAxiom(String wordForCheck){
        for(int i=0;i<gramar.getProductions().size();i++){
            for (String production:gramar.getProduction(gramar.getStartSymbol())) {
                if(production.contains(String.valueOf(wordForCheck.charAt(0)))){
                    return true;
                }
            }
        }return false;
    }

    private String checkIteration(String word, int numberLetter) {
        List<String> symbolsNoTerminals = gramar.getSymbolNoTerminal();
        for (int j = 0; j < symbolsNoTerminals.size(); j++) {
        List<String> currentProductions = gramar.getProduction(symbolsNoTerminals.get(j));
        if(numberLetter==0) return initIteration(word, numberLetter);

        for (int i = 0; i < currentProductions.size(); i++) {
            if (currentProductions.get(i).contains(String.valueOf(word.charAt(numberLetter)))) {
                if (numberLetter == word.length()) {
                    return finalIteration(currentProductions, word, numberLetter, i);
                } else {
                    horizontalDerivation.add(SEPARATOR);
                    horizontalDerivation.add(word.substring(0, numberLetter) + currentProductions.get(i));
                    return String.valueOf(word.charAt(numberLetter));
                }
            }
        }
        }
        return null;
    }

    private String initIteration(String word, int numberLetter){
        horizontalDerivation.add(gramar.getStartSymbol());
        horizontalDerivation.add(SEPARATOR);
        horizontalDerivation.add(gramar.getProductions().get(gramar.getStartSymbol()).get(0));
        return String.valueOf(word.charAt(numberLetter));
    }

    private String finalIteration(List<String> currentProductions, String word, int numberLetter, int currentPosition){
        if (currentProductions.get(currentPosition).equals(String.valueOf(word.charAt(numberLetter)))) {
            horizontalDerivation.add(SEPARATOR);
            horizontalDerivation.add(word.substring(0, numberLetter) + currentProductions.get(currentPosition));
            return String.valueOf(word.charAt(numberLetter));
        }return null;
    }

    public Gramar getGramar() {
        return gramar;
    }

    public void setGramar(Gramar gramar) {
        this.gramar = gramar;
    }


}