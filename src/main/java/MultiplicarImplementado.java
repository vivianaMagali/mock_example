public class MultiplicarImplementado implements Multiplicar{

    Sumar suma;

    public void setSumar(Sumar suma) {
        this.suma=suma;
    }

    public int mul(int a, int b, int c) {
        return (suma.sumar(a,b))*c;
    }
}
