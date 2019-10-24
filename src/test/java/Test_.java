import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test_ {

    @Test
    public void test_multiplcar(){
        Sumar suma=mock(Sumar.class);
        when(suma.sumar(2,3)).thenReturn(5);

        Multiplicar multiplicar=new MultiplicarImplementado();
        multiplicar.setSumar(suma);
        Assert.assertEquals(multiplicar.mul(2,3,3),15);
    }

    @Test
    public void test_suma(){
        Sumar suma=new SumarImplementado();
        Assert.assertEquals(suma.sumar(2,3),5);
    }
}
