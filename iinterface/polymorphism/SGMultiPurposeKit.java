package iinterface.polymorphism;

public class SGMultiPurposeKit implements ICovid19Kit {
    @Override
    public boolean isCovid19Positive(Sample s){
        return true;
    }
    @Override
    public double covid19TestConfidence(Sample s){
        return 11;
    }
}
