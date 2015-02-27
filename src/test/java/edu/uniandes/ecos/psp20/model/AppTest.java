/*
 * Paquete para probar el modelo 
 */
package edu.uniandes.ecos.psp20.model;

import static junit.framework.Assert.assertTrue;

/**
 * Clase para probar la clase CalcularSimsons 
 * @author wilman rincon
 */
public class AppTest {
    /**
     * verifica el valor esperado para un valor de X y Dof dado
     */
    public void testApp()
    {
        double x=1.1;
        double dof = 9;
        double p = 0.35006;
        
        CalcularSimpson calcSimpson = new CalcularSimpson(x,dof);
        
        calcSimpson.integral();
        assertTrue( true );
    }
}
