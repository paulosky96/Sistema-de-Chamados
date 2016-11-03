/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 157
 */
public class ControladorPrincipalTest {
    
    private ControladorPrincipal controle_p;
    
    public ControladorPrincipalTest() {
    }
    
    
    
    @Before
    public void setUp() {
        controle_p = new ControladorPrincipal();
    }
    
    @After
    public void tearDown() {
        controle_p =null;
    }

    
    @Test
    public void testStart() {
        controle_p.start();
        
    }

    
    @Test
    public void testGetCtrEmpresa() {
        assertTrue(controle_p.getCtrEmpresa()!=null);
    }

    
    @Test
    public void testSetCtrEmpresa() {
        controle_p.setCtrEmpresa(null );
        assertTrue(controle_p.getCtrEmpresa()==null);
    }

    
    @Test
    public void testGetCtrChamados() {
        assertTrue(controle_p.getCtrChamados()!=null);
        
    }

    
    @Test
    public void testSetCtrChamados() {
        controle_p.setCtrChamados(null );
        
        assertTrue(controle_p.getCtrChamados()==null);

        
    }

    
    @Test
    public void testGetCtrClientes() {
        assertTrue(controle_p.getCtrClientes()!=null);
    }

    /**
     * Test of setCtrClientes method, of class ControladorPrincipal.
     */
    @Test
    public void testSetCtrClientes() {
        controle_p.setCtrClientes(null );
        
        assertTrue(controle_p.getCtrClientes()==null);

    }

    
    @Test
    public void testGetCtrTecnicos() {
        assertTrue(controle_p.getCtrTecnicos()!=null);

    }

    
    @Test
    public void testSetCtrTecnicos() {
        controle_p.setCtrTecnicos(null );
        
         assertTrue(controle_p.getCtrTecnicos()==null);

    }
    
}
