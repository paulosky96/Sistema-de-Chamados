/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import entidade.Empresa;
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
public class ControleClientesTest {
    
    private ControleClientes controle_cl;
    
    public ControleClientesTest() {
    }
    
    
    
    @Before
    public void setUp() {
        controle_cl = new ControleClientes();
    }
    
    @After
    public void tearDown() {
        controle_cl = null;
    }

    
    @Test
    public void testGetClienteDAO() {
        assertTrue(controle_cl.getClienteDAO()!=null);
        
    }

    
    @Test
    public void testCadastrarCliente() {
        controle_cl.cadastrarCliente();
        controle_cl.fecharTelaCliente();
    }

    
    @Test
    public void testIncluiNovoCliente() {
        assertNotNull(controle_cl.incluiNovoCliente(new Empresa(0, "Nome_empresa"), 0, "Cliente_Nome", 0));
        
    }
    
    
    @Test
    public void testIncluiNovoCliente_Vazio() throws Exception {
        controle_cl.incluiNovoCliente(null,0, null, 0);
        
    }
    
    
    
    @Test
    public void testFecharTelaCliente() {
        controle_cl.cadastrarCliente();
        controle_cl.fecharTelaCliente();
    }
    
}
