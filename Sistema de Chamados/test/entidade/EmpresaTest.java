/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import entidade.Empresa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuário
 */
public class EmpresaTest {
    
    private Empresa empresa;
    
    public EmpresaTest() {
    }
    
    
    @Before
    public void setUp() {
        empresa = new Empresa(123,"ABC");
        
    }
    
    @Test
    public void testGetNumeroContrato() {
        System.out.println("getNumeroContrato");
        empresa.getNumeroContrato();
        assertEquals(empresa.getNumeroContrato(),123);
        System.out.println(empresa.getNumeroContrato());
    }
    
    @Test
    public void testSetNumeroContrato() {
        System.out.println("\n" + "setNumeroContrato");
        empresa.setNumeroContrato(7);
        assertEquals(empresa.getNumeroContrato(),7);
        System.out.println(empresa.getNumeroContrato());
    }
    
    @Test
    public void testGetNomeEmpresa() {
        System.out.println("\n" + "getNomeEmpresa");
        empresa.getNomeEmpresa();
        assertEquals(empresa.getNomeEmpresa(),"ABC");
        System.out.println(empresa.getNomeEmpresa());
        
    }
    
    @Test
    public void testSetNomeEmpresa() {
        System.out.println("\n" + "setNomeEmpresa");
        empresa.setNomeEmpresa("BCD");
        assertEquals(empresa.getNomeEmpresa(),"BCD");
        System.out.println(empresa.getNomeEmpresa());
        
    }
   
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals(empresa.toString(), "123 - ABC");
        System.out.println(empresa.toString());
        
    }
    
    @Test
    public void TestConstrutorContratoNegativo() throws Exception{
        empresa = new Empresa(-1,"ABC");
    }
    
    @Test
    public void TestSetContratoNegativo() throws Exception{
        empresa.setNumeroContrato(-1);
        assertEquals(empresa.getNumeroContrato(),-1);
    }
    
    @Test
    public void TestConstrutor_NomeEmpresaVazio() throws Exception{
        empresa = new Empresa(123,"");
        
    }
    
    @After
    public void remove() {
        empresa = null;
        
    }
}
