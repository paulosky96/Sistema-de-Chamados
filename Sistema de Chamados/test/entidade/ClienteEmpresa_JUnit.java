/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

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
public class ClienteEmpresa_JUnit {
    
    private ClienteEmpresa cliente_empresa;
    
    @Before
    public  void ClienteEmpresa_JUnit() {
         cliente_empresa = new ClienteEmpresa(1, new Empresa(0, "empresa_Test"), 0, "Test", 154238920);
    }
    
    
   
    @Test(expected = Exception.class)
    public void ClienteEmpresa_Constructor_Test1() throws Exception{
    
          ClienteEmpresa teste = new ClienteEmpresa(null, new Empresa(1, "TesteEmpresa"), 0, "Teste", 0);
    }   
    
    @Test(expected = Exception.class)
    public void ClienteEmpresa_Constructor_Test2()throws Exception{
    
          ClienteEmpresa teste = new ClienteEmpresa(-1, new Empresa(1, "TesteEmpresa"), 0, "Teste", 0);
    }  
    
    
    @Test(expected = Exception.class)
    public void ClienteEmpresa_Constructor_Test3() throws Exception{
    
          ClienteEmpresa teste = new ClienteEmpresa(1,  null, 0, "Teste", 0);
    }  
    
    
    @Test(expected = Exception.class)
    public void ClienteEmpresa_Constructor_Test4() throws Exception{ //CPF NEGATIVO
    
          ClienteEmpresa teste = new ClienteEmpresa(1, new Empresa(1, "TesteEmpresa"), -120, "Teste", 0);
    }  
    
    
    @Test(expected = Exception.class)
    public void ClienteEmpresa_Constructor_Test5() throws Exception{
    
          ClienteEmpresa teste = new ClienteEmpresa(1, new Empresa(1, "TesteEmpresa"), 0, null, 0);
    }  
    
    @Test(expected = Exception.class)
    public void ClienteEmpresa_Constructor_Test6() throws Exception{//TELEFONE INVALIDO NEGATIVO
    
          ClienteEmpresa teste = new ClienteEmpresa(1, new Empresa(1, "TesteEmpresa"), 0, "Teste", -1230);
    }  
    
    @Test
    public void TestGETCPF(){
        assertEquals(cliente_empresa.getCpf(), 154238920);
    }
    
    @Test
    public void TestSETCPF(){
        cliente_empresa.setCpf(1234);
        assertTrue(1234==cliente_empresa.getCpf());
    }
    
    @Test(expected = Exception.class)
    public void TestSetCpf_Negativo() throws Exception{
        cliente_empresa.setCpf(-123123);
    }
    
    
    @Test
    public void TestGetEmpresa(){
        assertTrue(cliente_empresa.getEmpresa()!=null);
    }
    
    @Test
    public void TestGetCodigo(){
        assertTrue(cliente_empresa.getCodigo()==1);
        
    }
    
    @Test
    public void TestSetCodigo(){
        cliente_empresa.setCodigo(12360);
        
            assertTrue(cliente_empresa.getCodigo() == 12360);
    }
    
    @Test(expected = Exception.class)
    public void TestSetCodigo_Null() throws Exception{
        
        cliente_empresa.setCodigo(null);
    }
    
    
    @Test(expected = Exception.class)
    public void TestSetCodigo_Negativo() throws Exception{
        
        cliente_empresa.setCodigo(-12355);
    }
    
    @Test
    public void TestGetNome(){
        assertEquals("Test", cliente_empresa.getNome());
        
    }
    
    @Test
    public void TestSetNome(){
        
        cliente_empresa.setNome("Nome_Test");
     
        assertEquals("Nome_Test", cliente_empresa.getNome());
    }
    
    @Test(expected =  Exception.class)
    public void TestSetNome_Numeros() throws Exception{ //criando um nome formado apenas de numeros
        cliente_empresa.setNome("123098120398123");
    }
    
    @Test(expected =  Exception.class)
    public void TestSetNome_Null() throws Exception{ //criando um nome vazio
        cliente_empresa.setNome(null);
    }
    
    
    @Test
    public void TestGetTelefone(){
        assertTrue(cliente_empresa.getTelefone()==154238920);
    }
    
    @Test
    public void TestSetTelefone(){
        cliente_empresa.setTelefone(999);
        
        assertTrue(cliente_empresa.getTelefone()==999);
        
        
    }
    
    @Test(expected = Exception.class)
    public void TestSetTelefone_Negativo(){
        
        cliente_empresa.setTelefone(-12312039);
    }
    
    
    @Test
    public void TestToString(){
        ClienteEmpresa test = new ClienteEmpresa(1, new Empresa(0, "empresa_Test"), 0, "Test", 154238920);

        assertEquals(test.toString(), "Contrato: 0 - Nome Empresa:empresa_Test - Cliente: 0 - Test" );
        
        
    }
    
    
    
    
    @After
    public void remove() {
        cliente_empresa=null;
    }

    
    
    
    
    
    
    
    
    
    
    
    
}
