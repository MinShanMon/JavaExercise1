package InterfaccePolymorphism;

public class NUSCovid19Kit implements ICovid19Kit, IDengueKit {
    @Override
    public boolean isDenguePositive(Sample s){
        return false;
    }
    @Override
    public double dengueTestConfidence(Sample s){
        return 19;
    }
    @Override
    public boolean isCovid19Positive(Sample s){
        return true;
    }
    @Override
    public double covid19TestConfidence(Sample s){
        return 11;
    }
}
