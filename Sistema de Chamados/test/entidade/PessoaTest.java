/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import entidade.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31442412
 */
public class PessoaTest {
    
    private Pessoa pessoa;
    
    public PessoaTest() {
    }
    
   
    
    @Before
    public void setUp() {
        pessoa = new Pessoa("Lucas",32222488);
                
    }
    
    

    /**
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        System.out.println("\n" + "getNome");
        pessoa.getNome();
        assertEquals(pessoa.getNome(), "Lucas");
        System.out.println(pessoa.getNome());
    }
    
   

    @Test
    public void testSetNome() {
        System.out.println("\n" + "setNome");
        pessoa.setNome("Tiago");
        assertEquals(pessoa.getNome(),"Tiago");
        System.out.println(pessoa.getNome());
    }
    
   
    @Test
    public void testGetTelefone() {
        System.out.println("\n" + "getTelefone");
        pessoa.getTelefone();
        assertEquals(pessoa.getTelefone(),32222488);
        System.out.println(pessoa.getTelefone());
    }
    
    
    @Test
    public void testSetTelefone() {
        System.out.println("\n" + "setTelefone");
        pessoa.setTelefone(7);
        assertEquals(pessoa.getTelefone(),7);
        System.out.println(pessoa.getTelefone());
    }
   
    @Test
    public void TestConstrutor_NomePessoaCaractereDiferente() throws Exception{
        pessoa = new Tecnico("Luc@s",123);
               
    }
    
    @Test
    public void TestConstrutor_NomePessoaComNumero() throws Exception{
        pessoa = new Tecnico("Luc4s",123);
               
    }
    
    @Test
    public void TestConstrutor_NomePessoaVazio() throws Exception{
        pessoa = new Tecnico("",123);
               
    }
    @Test
    public void TestConstrutor_TelefoneNegativo() throws Exception{
        pessoa = new Tecnico("Luc4s",-123);
               
    }
    
    @After
    public void remove() {
        pessoa = null;
        
    }
    
}
