package ss10_OOP_overview;

public class Main {
    public static void main(String[] args) {
        Phanso phanso1 = new Phanso();
        Phanso phansokhac = new Phanso();
        phanso1.inputData();
        phanso1.outputResult();
        phansokhac.inputData();
        phansokhac.outputResult();
        phansokhac.calSum(phansokhac);

    }
}
