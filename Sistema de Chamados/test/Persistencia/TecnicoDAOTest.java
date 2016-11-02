/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.RegistroChamado;
import entidade.Tecnico;
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
public class TecnicoDAOTest {
    
    private Tecnico tecnico;
    private TecnicoDAO tDao;
        
    public TecnicoDAOTest() {
    }
    
    @Before
    public void setUp() {
        tecnico = new Tecnico("Haroldo", 30142098);
        tDao= new TecnicoDAO();
    }

    @Test
    public void testGerarCodigo() {
        System.out.println("gerarCodigo");
        assertNotNull(tDao.gerarCodigo());
    }

    
    @Test
    public void testVoltaCashTecnico() {
        System.out.println("voltaCashTecnico");
        HashMap<Integer, Tecnico> voltaCashTecnico = tDao.voltaCashTecnico();
        assertEquals(tDao.voltaCashTecnico(), voltaCashTecnico);
        }

    
    @Test
    public void testPut() {
        System.out.println("put");
        tDao.put(tecnico);
        }

   
    @Test
    public void testGet() {
        assertEquals(tDao.get(Integer.SIZE), null);
    }

    
    @Test
    public void testPersit() {
        System.out.println("persit");
        tDao.persit();
    }
    
    @After
    public void remove() {
        tDao= null;
        tecnico=null;
    }    
}
