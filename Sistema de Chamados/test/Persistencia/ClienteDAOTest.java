/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import java.util.HashMap;
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
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
    }
    private ClienteDAO cDao; 
    private ClienteEmpresa ce; 
    
    
    @Before
    public void setUp() {
        ce = new ClienteEmpresa(1, new Empresa(0, "empresa_Test"), 1234659871, "Test", 154238920);
        cDao = new ClienteDAO();
        
    }
    
    @Test
    public void testValidarCPF() {
        System.out.println("validarCPF");
        ce.getCpf();
        assertEquals(ce.getCpf(),1234659871);
        System.out.println(ce.getCpf());
    }

    @Test(expected = Exception.class)
    public void testValidarCPFNegativo() throws Exception {
        System.out.println("validarCPFNegativo");
        ce = new ClienteEmpresa(1, new Empresa(0, "empresa_Test"), -1234659871, "Test", 154238920); 
        ce.getCpf();
        cDao = new ClienteDAO();
        assertEquals(ce.getCpf(),-1234659871);
        System.out.println(ce.getCpf());
    }
    
      
    @Test
    public void testGerarCodigo() {
        System.out.println("gerarCodigo");
        cDao.gerarCodigo();
        assertEquals(ce.getCodigo(), 1,00);
        System.out.println(ce.getCodigo());
    }
    
    
    @Test
    public void testVoltaCashCliente() {
        
        HashMap<Long, ClienteEmpresa> cliente_empresa = cDao.voltaCashCliente();
        assertEquals(cDao.voltaCashCliente(),cliente_empresa);
        
    }

    
    @Test
    public void testPut() {
        System.out.println("put");
        ce.setCodigo(cDao.gerarCodigo());
        cDao.put(ce);
        }

    @Test
    public void testGet() {
        System.out.println("get");
        assertEquals(cDao.get(Long.MIN_VALUE),null);
    }

    
    @Test
    public void testPersit() {
        System.out.println("persit");
        cDao.persit();
    }
    
    @After
    public void remove() {
        cDao = null;
        ce = null;
    }
    
}
