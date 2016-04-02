package fp1;

/**
 *
 * @author Peter Cappello
 */
public class Complex {
    private final double real;
        private final double imag;
        
        Complex( double real, double imag ) {
            this.real = real;
            this.imag = imag;
        }
        
        Complex add( Complex operand ) {
            return new Complex( real + operand.real, imag + operand.imag );
        }
        
        Complex multiply( Complex operand ) {
            return new Complex( real * operand.real - imag * operand.imag, 
                                imag * operand.real + real * operand.imag );
        }
}
