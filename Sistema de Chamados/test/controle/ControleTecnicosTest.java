/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Tecnico;
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
public class ControleTecnicosTest {
    
    private ControleTecnicos controle_t;
    
    public ControleTecnicosTest() {
    }
    
    
    @Before
    public void setUp() {
        controle_t = new ControleTecnicos();
    }
    
    @After
    public void tearDown() {
        controle_t=null;
    }

    
    @Test
    public void testInserir() {
        String nome = "Teste";
        long id = 1;
        
        assertTrue(controle_t.inserir(id, nome)!=null);
        
        
    }

    
    @Test
    public void testCadastrarTecnico() {
        controle_t.cadastrarTecnico();
        controle_t.fecharTelaTecnico();
    }

    /**
     * Test of fecharTelaTecnico method, of class ControleTecnicos.
     */
    @Test
    public void testFecharTelaTecnico() {
        controle_t.cadastrarTecnico();
        controle_t.fecharTelaTecnico();
    }
    
}
