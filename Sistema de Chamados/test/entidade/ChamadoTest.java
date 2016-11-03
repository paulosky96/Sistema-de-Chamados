/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31530753
 */
public class ChamadoTest {
    
    private Chamado chamado;
    
    
    public ChamadoTest() {
    }
    
    
    
    @Before
    public void setUp() {
         chamado = new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10");
        chamado.setBancoDeDados("Oracle");
        chamado.setCausaProblema("DNS");
        chamado.setSolucaoProblema("DNS");
        chamado.setOperacao("Http GET");
        chamado.setDuracaoOperacao(10.1);
        
        
        
        
    }
    
    @After
    public void remove(){
        chamado = null;
    }

    
    @Test
    public void testGetTecnico() {
        System.out.println("getTecnico");
        
        
        assertNotNull(chamado.getTecnico());
        
    }

    
    @Test
    public void testGetCodigo() {
        
        assertEquals(12345, chamado.getCodigo() );
        
    }

    
    @Test
    public void testSetCodigo() {
        
        int test = 120938;
        chamado.setCodigo(test);
        
        assertEquals(chamado.getCodigo(), test);
        
    }

   
    @Test
    public void testSetTecnico() {
        chamado.setTecnico(new Tecnico("Paulosky", 12309));
        
        assertNotNull(chamado.getTecnico());
    }

    
    @Test
    public void testGetCliente() {
        assertNotNull(chamado.getCliente());
        
    }

    
    @Test
    public void testSetCliente() {
        ClienteEmpresa cliente = new ClienteEmpresa(1235, new Empresa(12345, "Empresa Teste"), 123456710, "Lucas", 1234);
        chamado.setCliente(cliente);
        assertEquals(cliente, chamado.getCliente());
        
    }

    
    @Test
    public void testGetStatus() {
        assertEquals(chamado.getStatus(),"Iniciado");
        
    }

    
    @Test
    public void testSetStatus() {
        chamado.setStatus("Terminando");
        assertEquals(chamado.getStatus(),"Terminando");
        
    }

    
    @Test
    public void testGetTipoProblema() {
        assertEquals(chamado.getTipoProblema(), "Problema de Rede");
        
    }

    
    @Test
    public void testSetTipoProblema() {
        
        chamado.setTipoProblema("Problema de DNS");
        
        assertEquals(chamado.getTipoProblema(), "Problema de DNS");
        
    }

    
    @Test
    public void testGetData() {
        String date  = chamado.getData();
        assertEquals(chamado.getData(), date);
        
    }

    
    @Test
    public void testSetData() {
        chamado.setData("09/10/1998");
        
        assertEquals(chamado.getData(), "09/10/1998");
        
    }

    
    @Test
    public void testGetHora() {
        String hora = chamado.getHora();
        assertEquals(chamado.getHora(), hora);
    }

    
    @Test
    public void testSetHora() {
        chamado.setHora("TesteHora");
        assertEquals("TesteHora", chamado.getHora());
    }

    
    @Test
    public void testGetTitulo() {
        
        
        assertEquals(chamado.getTitulo(), "Teste");
        
    }

    
    @Test
    public void testSetTitulo() {
        chamado.setTitulo("Teste_Titulo");
        
        assertEquals(chamado.getTitulo(), "Teste_Titulo");
        
    }

    
    @Test
    public void testGetDescricao() {
      assertEquals("Objeto teste", chamado.getDescricao());
    }

    
    @Test
    public void testSetDescricao() {
        chamado.setDescricao("Descricao_Teste");
        
        assertEquals(chamado.getDescricao(), "Descricao_Teste");
        
    }

    
    @Test
    public void testGetPrioridade() {
       
        
        assertEquals(chamado.getPrioridade(), 1);
    }

    
    @Test
    public void testSetPrioridade() {
        chamado.setPrioridade(2);
        assertEquals(chamado.getPrioridade(), 2);
    }

    
    @Test
    public void testGetSistemaOperacional() {
        assertEquals(chamado.getSistemaOperacional(), "WINDOWS");
        
    }

    
    @Test
    public void testSetSistemaOperacional() {
        chamado.setSistemaOperacional("LINUX");
        
        assertEquals(chamado.getSistemaOperacional(), "LINUX");
    }
    
    @Test
    public void TestSetSistemaOperacional_Errado(){
        chamado.setSistemaOperacional("Teste");
        
    }
    
    @Test
    public void testGetVersaoSO() {
        assertEquals(chamado.getVersaoSO(), "10");
        
    }

    
    @Test
    public void testSetVersaoSO() {
        chamado.setVersaoSO("8");
        assertEquals("8", chamado.getVersaoSO());
    }

    
    @Test
    public void testGetBancoDeDados() {
        assertEquals(chamado.getBancoDeDados(), "Oracle");
        
    }

    
    
    @Test
    public void testSetBancoDeDados() {
        chamado.setBancoDeDados("MYSQL");
        assertEquals("MYSQL", chamado.getBancoDeDados());
    }

    
    @Test
    public void testGetCausaProblema() {
        assertEquals(chamado.getCausaProblema(), "DNS");
        
    }

    
    @Test
    public void testSetCausaProblema() {
        chamado.setCausaProblema("ISP");
        
        assertEquals("ISP", chamado.getCausaProblema());
    }

    
    @Test
    public void testGetSolucaoProblema() {
        assertEquals(chamado.getSolucaoProblema(), "DNS");
        
    }

    
    @Test
    public void testSetSolucaoProblema() {
        chamado.setSolucaoProblema("ISP");
        
        assertEquals("ISP", chamado.getSolucaoProblema());
    }

    
    @Test
    public void testGetTipoConexao() {
        assertEquals(chamado.getTipoConexao(), "CaboModen");
        
    }

    
    @Test
    public void testSetTipoConexao() {
        chamado.setTipoConexao("Discada");
        
        assertEquals("Discada", chamado.getTipoConexao());
        
    }

    
    @Test
    public void testGetEnderecoRede() {
        assertEquals(chamado.getEnderecoRede(), "192.168.0.10");
    }

    
    @Test
    public void testSetEnderecoRede() {
        chamado.setEnderecoRede("192.168.0.11");
        
        assertEquals("192.168.0.11", chamado.getEnderecoRede());
    }

    
    @Test
    public void testGetOperacao() {
        assertEquals(chamado.getOperacao(), "Http GET");
        
    }

    
    @Test
    public void testSetOperacao() {
        chamado.setOperacao("Http POST");
        assertEquals("Http POST", chamado.getOperacao());
        
    }

    
    @Test
    public void testGetDuracaoOperacao() {
       
        assertTrue(10.1==chamado.getDuracaoOperacao());
        
    }

    
    @Test
    public void testSetDuracaoOperacao() {
        chamado.setDuracaoOperacao(5.2);
        
        assertTrue(5.2 == chamado.getDuracaoOperacao() );
    }

    
    @Test
    public void testEquals() {
        assertTrue(chamado.equals(new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10") ) ) ;
        
    }
    
    @Test
    public void testEquals_Errado(){
        assertFalse(chamado.equals(new Chamado(12, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10") ) ) ;
        
        
    }
    
    
    @Test
    public void Test_Contrutor_1() throws Exception{
        
      Chamado teste =   new Chamado(12, null, "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10");
        
    }
    
    @Test
    public void Test_Contrutor_2() throws Exception{
        
      Chamado teste =   new Chamado(12, "Teste", null, 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10");
        
    }
    
    @Test
    public void Test_Contrutor_3() throws Exception{
        
      Chamado teste =   new Chamado(-12, "Teste", "Objeto teste", -1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10");
        
    }
    
    @Test
    public void Test_Contrutor_4() throws Exception{
        
      Chamado teste =   new Chamado(12, "Teste", "Objeto teste", 1, null, 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10");
        
    }
    
    @Test
    public void Test_Contrutor_5() throws Exception{
        
      Chamado teste =   new Chamado(12, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                null
                , "WINDOWS", "10", "CaboModen", "192.168.0.10");
        
    }
    
    @Test
    public void Test_Contrutor_6() throws Exception{
        
      Chamado teste =   new Chamado(12, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , null, "10", "CaboModen", "192.168.0.10");
        
    }
    
    
    @Test
    public void Test_Contrutor_7() throws Exception{
        
      Chamado teste =   new Chamado(12, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", null, "CaboModen", "192.168.0.10");
        
    }
    
    @Test
    public void Test_Contrutor_8() throws Exception{
        
      Chamado teste =   new Chamado(12, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", null, "192.168.0.10");
        
    }
    
    @Test
    public void Test_Contrutor_9() throws Exception{
        
      Chamado teste =   new Chamado(12, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", null);
        
    }
    
    @Test
    public void Test_Contrutor_10() throws Exception{
        
      Chamado teste =  new Chamado(null,"Teste descricao",1,new Tecnico("TesteTecnico",123),new ClienteEmpresa(456,new Empresa
        (12345,"EmpresaTeste"),1234, "Renan",123),"Windows","7","Oracle");
        
    }
    
    @Test
    public void Test_Contrutor_11() throws Exception{
        
      Chamado teste =  new Chamado("Teste Titulo",null,1,new Tecnico("TesteTecnico",123),new ClienteEmpresa(456,new Empresa
        (12345,"EmpresaTeste"),1234, "Renan",123),"Windows","7","Oracle");
        
    }
    
    @Test
    public void Test_Contrutor_12() throws Exception{
        
      Chamado teste =  new Chamado("Teste Titulo","Teste descricao",-1,new Tecnico("TesteTecnico",123),new ClienteEmpresa(456,new Empresa
        (12345,"EmpresaTeste"),1234, "Renan",123),"Windows","7","Oracle");
        
    }
    
    @Test
    public void Test_Contrutor_13() throws Exception{
        
      Chamado teste =  new Chamado("Teste Titulo","Teste descricao",1,null,new ClienteEmpresa(456,new Empresa
        (12345,"EmpresaTeste"),1234, "Renan",123),"Windows","7","Oracle");
        
    }
    
    @Test
    public void Test_Contrutor_14() throws Exception{
        
      Chamado teste =  new Chamado("Teste Titulo","Teste descricao",1,new Tecnico("TesteTecnico",123),null,"Windows","7","Oracle");
        
    }
    
    
    @Test
    public void Test_Contrutor_15() throws Exception{
        
      Chamado teste =  new Chamado("Teste Titulo","Teste descricao",1,new Tecnico("TesteTecnico",123),new ClienteEmpresa(456,new Empresa
        (12345,"EmpresaTeste"),1234, "Renan",123),null,"7","Oracle");
        
    }
    
    
    @Test
    public void Test_Contrutor_16() throws Exception{
        
      Chamado teste =  new Chamado("Teste Titulo","Teste descricao",1,new Tecnico("TesteTecnico",123),new ClienteEmpresa(456,new Empresa
        (12345,"EmpresaTeste"),1234, "Renan",123),"Windows",null,"Oracle");
        
    }
    
    
    @Test
    public void Test_Contrutor_17() throws Exception{
        
      Chamado teste =  new Chamado("Teste Titulo","Teste descricao",1,new Tecnico("TesteTecnico",123),new ClienteEmpresa(456,new Empresa
        (12345,"EmpresaTeste"),1234, "Renan",123),"Windows","7",null);
        
    }
    
    @Test
    public void Test_Contrutor_18() throws Exception{
        
      Chamado teste =  new Chamado(null,"descricao teste",2,new Tecnico("teste",456), new ClienteEmpresa(456,new Empresa
(12345,"EmpresaTeste"),1234,"Gustavo",123), "LINUX","8","MYSQL", 12.01);
        
    }
    
    @Test
    public void Test_Contrutor_19() throws Exception{
        
      Chamado teste =  new Chamado("Teste titulo",null,2,new Tecnico("teste",456), new ClienteEmpresa(456,new Empresa
(12345,"EmpresaTeste"),1234,"Gustavo",123), "LINUX","8","MYSQL", 12.01);
        
    }
    
    @Test
    public void Test_Contrutor_20() throws Exception{
        
      Chamado teste =  new Chamado("Teste titulo","descricao teste",-2,new Tecnico("teste",456), new ClienteEmpresa(456,new Empresa
(12345,"EmpresaTeste"),1234,"Gustavo",123), "LINUX","8","MYSQL", 12.01);
        
    }
    
    
    @Test
    public void Test_Contrutor_21() throws Exception{
        
      Chamado teste =  new Chamado("Teste titulo","descricao teste",2,null, new ClienteEmpresa(456,new Empresa
(12345,"EmpresaTeste"),1234,"Gustavo",123), "LINUX","8","MYSQL", 12.01);
        
    }
    
    
    @Test
    public void Test_Contrutor_22() throws Exception{
        
      Chamado teste =  new Chamado("Teste titulo","descricao teste",2,new Tecnico("teste",456), null, "LINUX","8","MYSQL", 12.01);
        
    }
    
    
    @Test
    public void Test_Contrutor_23() throws Exception{
        
      Chamado teste =  new Chamado("Teste titulo","descricao teste",2,new Tecnico("teste",456), new ClienteEmpresa(456,new Empresa
(12345,"EmpresaTeste"),1234,"Gustavo",123), null,"8","MYSQL", 12.01);
        
    }
    
    @Test
    public void Test_Contrutor_24() throws Exception{
        
      Chamado teste =  new Chamado("Teste titulo","descricao teste",2,new Tecnico("teste",456), new ClienteEmpresa(456,new Empresa
(12345,"EmpresaTeste"),1234,"Gustavo",123), "LINUX",null,"MYSQL", 12.01);
        
    }
    
    @Test
    public void Test_Contrutor_25() throws Exception{
        
      Chamado teste =  new Chamado("Teste titulo","descricao teste",2,new Tecnico("teste",456), new ClienteEmpresa(456,new Empresa
(12345,"EmpresaTeste"),1234,"Gustavo",123), "LINUX","8",null, 12.01);
        
    }
    
    @Test
    public void Test_Contrutor_26() throws Exception{
        
      Chamado teste =  new Chamado("Teste titulo","descricao teste",2,new Tecnico("teste",456), new ClienteEmpresa(456,new Empresa
(12345,"EmpresaTeste"),1234,"Gustavo",123), "LINUX","8","MYSQL", -12.01);
        
    }
    
    
    
    
    
    
    
}
