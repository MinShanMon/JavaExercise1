
package InterfaccePolymorphism;

public class mains {
    public static void testInterface(){
        Sample s = new Sample();
        ICovid19Kit kit;
        kit = new NUSCovid19Kit();
        System.out.println("Nus test" + kit.isCovid19Positive(s));
        kit = new SGMultiPurposeKit();
        System.out.println("SG test: " + kit.isCovid19Positive(s));
    }

    public static void main(String args[]){
        testInterface();
    }
}
