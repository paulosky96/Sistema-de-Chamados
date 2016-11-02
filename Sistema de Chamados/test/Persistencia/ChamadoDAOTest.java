/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import java.util.Collection;
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
public class ChamadoDAOTest {
    
    public ChamadoDAOTest() {
    }
    private Chamado chamado;
    private ChamadoDAO chDao;
      
    @Before
    public void setUp() {
    chamado = new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10");
    chDao=new ChamadoDAO();
    }
    
    
    @Test
    public void testGerarCodigo() {
        System.out.println("gerarCodigo");
        assertNotNull(chDao.gerarCodigo());
        }

    
    @Test
    public void testGerarCodigoRegistroChamado() {
        System.out.println("gerarCodigoRegistroChamado");
        assertNotNull(chDao.gerarCodigoRegistroChamado());
        
        
    }

    
    @Test
    public void testPut() {
        System.out.println("put");
        chDao.put(chamado);
    }

    
    @Test
    public void testPutRegistro() {
        System.out.println("putRegistro");
        RegistroChamado registro = new RegistroChamado("Assunto", new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10") ,
                new Tecnico("Test", 1230));
        chDao.putRegistro(registro);
    }

    
    @Test
    public void testGet() {
        System.out.println("get");
        assertEquals(chDao.get(Integer.MIN_VALUE), null);
    }

    
    @Test
    public void testPersit() {
        System.out.println("persist");
        chDao.persit();
    }

    
    @Test
    public void testGetChamados() {
        System.out.println("getChamados");
        assertNotNull(chDao.getChamados());
        
    }

   
    @Test
    public void testGetRegistros() {
        System.out.println("getRegistros");
        assertNotNull(chDao.getRegistros());
    }
    
    @After
    public void remove() {
        chamado= null;
        chDao= null;
    }
    
}
