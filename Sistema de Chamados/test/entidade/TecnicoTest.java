/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import entidade.Tecnico;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31442412
 */
public class TecnicoTest {
    
    private Tecnico tecnico;
    
    public TecnicoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        tecnico = new Tecnico("Roberto", 123);
        
    }
    
    @After
    public void remove() {
        tecnico = null;
    }

    /**
     * Test of toString method, of class Tecnico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals(tecnico.toString(),"Roberto");
        System.out.println(tecnico.toString());
        
    }
    
    
    @Test
    public void TestConstrutor_NomeComNumero() throws Exception{
        tecnico = new Tecnico("Robert0",123);
        
    }
    
    @Test
    public void TestConstrutor_NomeComCaractereDiferente() throws Exception{
        tecnico = new Tecnico("Rober!0",123);
        
    }
    
    @Test
    public void TestConstrutor_TelefoneNegativo() throws Exception{
        tecnico = new Tecnico("Roberto",-123);
        
    }
    
    @Test
    public void TestConstrutor_NomeTecnicoVazio() throws Exception{
        tecnico = new Tecnico("",123);
        
    }
}
