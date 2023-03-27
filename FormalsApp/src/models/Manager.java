/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


/**
 *
 * @author julian
 */
public class Manager {
    private Gramar gramar;
    private DerivationWord derivationWord;
    private TreeGeneralDerivation treeGeneralDerivation;
    
    
    public Manager() {
        this.gramar = new Gramar();
        this.derivationWord = new DerivationWord(gramar);
        this.treeGeneralDerivation = new TreeGeneralDerivation(gramar);
    }
    
    
    
    public Gramar getGramar() {
        return gramar;
    }

    public void setGramar(Gramar gramar) {
        this.gramar = gramar;
    }

    public DerivationWord getDerivationWord() {
        return derivationWord;
    }

    public void setDerivationWord(DerivationWord derivationWord) {
        this.derivationWord = derivationWord;
    }

    public TreeGeneralDerivation getTreeGeneralDerivation() {
        return treeGeneralDerivation;
    }

    public void setTreeGeneralDerivation(TreeGeneralDerivation treeGeneralDerivation) {
        this.treeGeneralDerivation = treeGeneralDerivation;
    }

   
    
    
    
}
