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
         registro.setCodigo(0);
    }
    
    @After
    public void tearDown() {
        registro = null;
    }

    
    @Test
    public void Test_RegistroChamado_Contructor_1(){
        
        RegistroChamado test = new RegistroChamado(null, new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10") ,
                new Tecnico("Test", 1230));
    }
    
    @Test
    public void Test_RegistroChamado_Contructor_2(){
        
        RegistroChamado test = new RegistroChamado("Assunto", null ,
                new Tecnico("Test", 1230));
    }
    
    @Test
    public void Test_RegistroChamado_Contructor_3(){
        
        RegistroChamado test = new RegistroChamado("Assunto", new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10") ,
                null);
    }
    
    
    @Test
    public void Test_RegistroChamado_Contructor_4(){
        
        RegistroChamado test = new RegistroChamado(" ", new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10") ,
                new Tecnico("Test", 1230));
    }
    
    
    
    
    
    
    @Test
    public void testGetCodigo() {//espera-se que o codigo exista apos o objeto ser contruido
        assertTrue(registro.getCodigo()!=null  );
    }

   
    @Test
    public void testSetCodigo() {
        registro.setCodigo(123);
        assertTrue(123==registro.getCodigo());
    }
    
    @Test
    public void testSetCodigo_Negativo() throws Exception{
        registro.setCodigo(-12312);
        
    }
    
    
    @Test
    public void testGetChamado() {
        assertTrue(registro.getChamado()!= null);
    }

    
    @Test
    public void testSetChamado() {
        registro.setChamado(new Chamado("titulo", "descricao", 0, new Tecnico("nome_tecnico", 0)
                , new ClienteEmpresa(Integer.SIZE, new Empresa(0, "Nome_empresa"), 0, "Nome_cliente", 0),
                "linux", "7", "oracle"));
        
        assertTrue(registro.getChamado()!=null);
    }

    
    @Test
    public void testGetHora() {
        assertTrue(!registro.getHora().isEmpty());
        
    }

   
    @Test
    public void testSetHora() {
       registro.setHora("23:00");
        assertEquals(registro.getHora(), "23:00");
    }

    
    @Test
    public void testGetData() {
        assertTrue(!registro.getData().isEmpty());
    }

    /**
     * Test of setData method, of class RegistroChamado.
     */
    @Test
    public void testSetData() {
        registro.setData("19/3/2000");
        assertEquals(registro.getData(), "19/3/2000");
    }

    
    @Test
    public void testGetAssunto() {
        assertEquals(registro.getAssunto(), "Assunto");
    }

    
    @Test
    public void testSetAssunto() {
        registro.setAssunto("Teste_assunto");
        assertEquals("Teste_assunto", registro.getAssunto());
    }

    
    @Test
    public void testGetTecnico() {
        assertTrue(registro.getTecnico()!=null);
    }

    
    @Test
    public void testSetTecnico() {
        registro.setTecnico(null);
        assertTrue(registro.getTecnico()==null);
        registro.setTecnico(new Tecnico("Renan", 0));

    }
    
}
