/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Empresa;
import java.util.Collection;
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
public class EmpresaDAOTest {
    
    private Empresa empresa;
    private EmpresaDAO eDao;
    
    public EmpresaDAOTest() {
    }
    
    
    @Before
    public void setUp() {
        empresa = new Empresa(123,"ABC");
        eDao= new EmpresaDAO();
    }
    
    
    @Test
    public void testPut() {
        System.out.println("put");
        eDao.put(empresa);
        }

    /**
     * Test of persit method, of class EmpresaDAO.
     */
    @Test
    public void testPersit() {
        System.out.println("persist");
        eDao.persit();
        
    }

    /**
     * Test of getEmpresas method, of class EmpresaDAO.
     */
    @Test
    public void testGetEmpresas() {
        System.out.println("getEmpresas");
        assertNotNull(eDao.getEmpresas());
        
    }

    @Test
    public void testVoltaEmpresa() {
        System.out.println("voltaEmpresa");
        HashMap<Long, Empresa> emp = eDao.voltaEmpresa();
        assertEquals(eDao.voltaEmpresa(),emp);
        System.out.println(eDao.voltaEmpresa());
    }
    
    @After
    public void remove() {
        empresa = null;
        eDao = null;
    }
    
}
