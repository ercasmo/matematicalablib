package matematicalib.procesador;

import java.math.BigDecimal;
import java.math.MathContext;

public class ProcesadorAritmetica {
	public BigDecimal sumar(BigDecimal uno, BigDecimal dos) {
		return uno.add(dos, MathContext.DECIMAL128);
	}

	public BigDecimal restar(BigDecimal uno, BigDecimal dos) {
		return uno.subtract(dos, MathContext.DECIMAL128);
	}
	
	public BigDecimal multiplicar(BigDecimal uno, BigDecimal dos) {
		return uno.multiply(dos, MathContext.DECIMAL128);
	}
	
	public BigDecimal dividir(BigDecimal uno, BigDecimal dos) {
		return uno.divide(dos, MathContext.DECIMAL128);
	}
}
