import org.junit.Test;
import static org.junit.Assert.*;

public class CuentaTest {

    
    public void test0014_SimulacionConLimiteDescubierto() {

        Cuenta cuenta12345 = new Cuenta("12345", 50.0);
        Cuenta cuenta67890 = new Cuenta("67890", 0.0);

        cuenta12345.retirar(200.0);
        cuenta67890.retirar(350.0);
        cuenta12345.ingresar(100.0);
        cuenta67890.retirar(200.0);
        cuenta67890.retirar(150.0);
        cuenta12345.retirar(200.0);
        cuenta67890.ingresar(50.0);
        cuenta67890.retirar(100.0);

        assertEquals(-250.0, cuenta12345.getSaldo(), 0.01);
        assertEquals(-450.0, cuenta67890.getSaldo(), 0.01);
    }
}