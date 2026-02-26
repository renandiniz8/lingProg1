public class ex4 {
    public static void main(String[] args) {

    double P1, E1, E2, X, SUB, API, EXF, MED, HIP1, HIP2, HIP3; 

    P1 = 6;
    E1 = 5;
    E2 = 5;
    X = 0;
    SUB = 9;
    API = 8;
    EXF = 0;
    
    HIP1 = ((P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + SUB * 0.15) * 0.5);
    
    if ((P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB *0.15)) > 5.9) {
        HIP2 = (P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB *0.15));
    } else {
        HIP2 = 0;
    } 

    MED = (( HIP1 + HIP2) / ((P1 * 0.5 + E1 * 0.2 + E2 * 0.3 + X + (SUB * 0.15))) * API * 0.5);

    if (MED < EXF) {
        HIP3 = EXF;
    } else {
        HIP3 = MED;
    }
    System.out.println(HIP3);

    }    
}