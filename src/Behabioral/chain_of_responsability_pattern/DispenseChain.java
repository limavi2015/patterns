package Behabioral.chain_of_responsability_pattern;

public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}