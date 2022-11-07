package InterfaccePolymorphism;
public interface ICovid19Kit {
    public abstract boolean isCovid19Positive(Sample s);
    public abstract double covid19TestConfidence(Sample s);
}
