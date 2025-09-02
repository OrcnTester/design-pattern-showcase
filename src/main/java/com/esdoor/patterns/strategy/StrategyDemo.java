package com.esdoor.patterns.strategy;

interface TaxStrategy {
    double apply(double net);
}

class TrTax implements TaxStrategy { // örnek %20
    public double apply(double net) { return net * 1.20; }
}

class NoTax implements TaxStrategy {
    public double apply(double net) { return net; }
}

class PriceCalculator {
    private TaxStrategy strategy;
    public PriceCalculator(TaxStrategy strategy) { this.strategy = strategy; }
    public void setStrategy(TaxStrategy strategy) { this.strategy = strategy; }
    public double total(double net) { return strategy.apply(net); }
}

public class StrategyDemo {
    public static void main(String[] args) {
        PriceCalculator calc = new PriceCalculator(new TrTax());
        System.out.println("TR total: " + calc.total(1000)); // 1200.0
        calc.setStrategy(new NoTax());
        System.out.println("NoTax total: " + calc.total(1000)); // 1000.0
    }
}
