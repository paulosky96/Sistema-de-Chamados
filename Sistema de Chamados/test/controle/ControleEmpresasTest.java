/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Empresa;
import javax.swing.JOptionPane;
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
public class ControleEmpresasTest {
    
    private ControleEmpresas controle_e;
    
    public ControleEmpresasTest() {
    }
    
    
    
    @Before
    public void setUp() {
        controle_e = new ControleEmpresas();
        
        
    }
    
    @After
    public void tearDown() {
       
        controle_e = null;
        
    }

    
    @Test
    public void testRetorna() {
        assertNotNull(controle_e.retorna(1, "Empresa 1"));
    }
    
    @Test
    public void testRetorna_EmpresaInexistente() {
        assertNull(controle_e.retorna(10, "Empresa_Inexistente"));
    }
    
    
    
    
    
    @Test
    public void testValidar_4() {
        
        assertEquals(4 ,controle_e.validar(5, "random"));
        
        
    }
    
    
    
    @Test
    public void testValidar_3() {
        
        assertEquals(3 ,controle_e.validar(123, "Empresa_Teste"));
        
        
    }
    
    
    
    
    @Test
    public void testInserir_EmpresaExistente() {
        
        assertNull(controle_e.inserir(5, "Empresa_Teste") );
        
         
    }
    
    
           

    /**
     * Test of checar method, of class ControleEmpresas.
     */
    @Test
    public void testChecar() {
        assertTrue( controle_e.checar( new Long(1) ,"Empresa 1")  );
    }

    
    @Test
    public void testCadastrarEmpresa() {
        controle_e.cadastrarEmpresa();
        controle_e.fecharTela();
    }

    
    @Test
    public void testFecharTela() {
        controle_e.cadastrarEmpresa();
        controle_e.fecharTela();
    }
    
}
