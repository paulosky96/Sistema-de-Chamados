/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

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
public class RegistroChamadoTest {
    private RegistroChamado registro;
    
    public RegistroChamadoTest() {
    }
    
    
    @Before
    public void setUp() {
         registro = new RegistroChamado("Assunto", new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10") ,
                new Tecnico("Test", 1230));
    }
    
    @After
    public void tearDown() {
        registro = null;
    }

    
    @Test(expected = Exception.class)
    public void Test_RegistroChamado_Contructor_1(){
        
        RegistroChamado test = new RegistroChamado(null, new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10") ,
                new Tecnico("Test", 1230));
    }
    
    @Test(expected = Exception.class)
    public void Test_RegistroChamado_Contructor_2(){
        
        RegistroChamado test = new RegistroChamado("Assunto", null ,
                new Tecnico("Test", 1230));
    }
    
    @Test(expected = Exception.class)
    public void Test_RegistroChamado_Contructor_3(){
        
        RegistroChamado test = new RegistroChamado("Assunto", new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10") ,
                null);
    }
    
    
    @Test(expected = Exception.class)
    public void Test_RegistroChamado_Contructor_4(){
        
        RegistroChamado test = new RegistroChamado(" ", new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10") ,
                new Tecnico("Test", 1230));
    }
    
    
    
    
    
    
    @Test
    public void testGetCodigo() {//espera-se que o codigo exista apos o objeto ser contruido
        assertTrue(registro.getCodigo()!=null);
    }

   
    @Test
    public void testSetCodigo() {
        registro.setCodigo(123);
        assertTrue(123==registro.getCodigo());
    }
    
    @Test(expected = Exception.class)
    public void testSetCodigo_Negativo() throws Exception{
        registro.setCodigo(-12312);
        
    }
    
    
    @Test
    public void testGetChamado() {
        assertTrue(registro.getChamado()!= null);
    }

    
//    @Test
//    public void testSetChamado() {
//        System.out.println("setChamado");
//        Chamado chamado = null;
//        RegistroChamado instance = null;
//        instance.setChamado(chamado);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getChamado method, of class RegistroChamado.
//     */
//
//    /**
//     * Test of getHora method, of class RegistroChamado.
//     */
//    @Test
//    public void testGetHora() {
//        System.out.println("getHora");
//        RegistroChamado instance = null;
//        String expResult = "";
//        String result = instance.getHora();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setHora method, of class RegistroChamado.
//     */
//    @Test
//    public void testSetHora() {
//        System.out.println("setHora");
//        String hora = "";
//        RegistroChamado instance = null;
//        instance.setHora(hora);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getData method, of class RegistroChamado.
//     */
//    @Test
//    public void testGetData() {
//        System.out.println("getData");
//        RegistroChamado instance = null;
//        String expResult = "";
//        String result = instance.getData();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setData method, of class RegistroChamado.
//     */
//    @Test
//    public void testSetData() {
//        System.out.println("setData");
//        String data = "";
//        RegistroChamado instance = null;
//        instance.setData(data);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAssunto method, of class RegistroChamado.
//     */
//    @Test
//    public void testGetAssunto() {
//        System.out.println("getAssunto");
//        RegistroChamado instance = null;
//        String expResult = "";
//        String result = instance.getAssunto();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setAssunto method, of class RegistroChamado.
//     */
//    @Test
//    public void testSetAssunto() {
//        System.out.println("setAssunto");
//        String assunto = "";
//        RegistroChamado instance = null;
//        instance.setAssunto(assunto);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTecnico method, of class RegistroChamado.
//     */
//    @Test
//    public void testGetTecnico() {
//        System.out.println("getTecnico");
//        RegistroChamado instance = null;
//        Tecnico expResult = null;
//        Tecnico result = instance.getTecnico();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.")
//    }
//
//    /**
//     * Test of setTecnico method, of class RegistroChamado.
//     */
//    @Test
//    public void testSetTecnico() {
//        System.out.println("setTecnico");
//        Tecnico tecnico = null;
//        RegistroChamado instance = null;
//        instance.setTecnico(tecnico);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
