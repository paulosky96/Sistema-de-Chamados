/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
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
public class ControleChamadosTest {
    
    private ControleChamados controle_ch;
    
    public ControleChamadosTest() {
    }
    
    
    
    @Before
    public void setUp() {
        controle_ch = new ControleChamados();
    }
    
    @After
    public void tearDown() {
        controle_ch = null;
    }

    /**
     * Test of alterarChamado method, of class ControleChamados.
     */
    @Test
    public void testAlterarChamado_4args() {
        Chamado test;
        
       
        assertEquals("Resolvido", controle_ch.alterarChamado(test = new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10"), "Resolvido", "DNS", "DNS").getStatus());
        
        
        
        
    }

    
    @Test
    public void testInserirChamadoRede() {
        assertNotNull( controle_ch.InserirChamadoRede("Titulo", "Descricao", 1, new Tecnico("nome_Tecnico", 1),
                new ClienteEmpresa(1, new Empresa(0, "Empresa_Nome"), 1, "Cliente_NOme", 0), "Windows", "10", "CaboModen", "192.168.0.21") );
        
        
    }

    
    @Test
    public void testInserirChamadoBancoDeDados() {
        
        assertNotNull( controle_ch.InserirChamadoBancoDeDados("Titulo", "Descricao", 1, new Tecnico("Nome_Tecnico2", 51),
                new ClienteEmpresa(12, new Empresa(1, "Empresa nome"), 1, "Renan", 2), "Linux", "7.1", "Oracle"));
        
    }

    /**
     * Test of InserirChamadoDesempenho method, of class ControleChamados.
     */
    @Test
    public void testInserirChamadoDesempenho() {
        assertNotNull( controle_ch.InserirChamadoDesempenho("Titulo", "Descricao", 2, new Tecnico("Lucas", 2),
                new ClienteEmpresa(123, new Empresa(2, "Mack"), 90, "Alberto", 84), "Windows", "10","Http get ", 127) );
    }

    
    @Test
    public void testInserirRegistroChamado() {
        
        assertNotNull( controle_ch.inserirRegistroChamado("Problemas", new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10"), new Tecnico("ASD", 12345)  ));
        
        
    }

    
    @Test(timeout = 1)
    public void testCadastrarChamado() {
        controle_ch.cadastrarChamado();
    }

    
    @Test
    public void testFecharTela() {
        controle_ch.fecharTela();
    }

    @Test
    public void testVoltaChamadoCodigo() {
        Integer a = 12345;
        controle_ch.voltaChamadoCodigo(a);
    }

    
    @Test
    public void testSetChamadoAlterado() {
        controle_ch.setChamadoAlterado(new Chamado(12378, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10"));
        assertNotNull(controle_ch.getChamadoAlterado());
        
        
    }

    
    @Test
    public void testGetChamadoAlterado() {
        ControleChamados test = new ControleChamados();
         test.setChamadoAlterado(new Chamado(12378, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10"));
        
         assertNotNull(test.getChamadoAlterado()  );
    }

    
    @Test
    public void testEmitirRelatorios() {
        
        assertTrue(!controle_ch.emitirRelatorios(2).isEmpty() );
        
    }
    
    
    
    @Test
    public void testEmitirRelatorios_Invalido() {
        
        assertTrue(controle_ch.emitirRelatorios(123).isEmpty() );
        
    }

    
    @Test
    public void testBuscaPeloCodigo() {
        
        assertNull(controle_ch.buscaPeloCodigo(12345));
        
        
    }

    
    
    
    
    @Test
    public void testBuscaPeloCodigo_Invalido() {
        
        assertNull(controle_ch.buscaPeloCodigo(123049809));
        
        
    }

    
    
    
    
    
    @Test
    public void testRetornaDetalhesChamado() {
        Chamado c = new Chamado(12345, "Teste", "Objeto teste", 1, new Tecnico("ASD", 12345), 
                new ClienteEmpresa(456, new Empresa(123456, "EmpresaTest"), 1234567, "Roberto", 456)
                , "WINDOWS", "10", "CaboModen", "192.168.0.10");
        c.setBancoDeDados("Oracle");
        c.setCausaProblema("DNS");
        c.setSolucaoProblema("DNS");
        c.setOperacao("Http GET");
        c.setDuracaoOperacao(10.1);
        
        String teste = "\n" + "--------" + "\n" + "Data de abertura do chamado: "
                + c.getData() + "\n" + "Hororio de abertura do chamado: " + c.getHora() + "\n"
                + "Titulo do chamado: " + c.getTitulo() + "\n" + "Descricao do chamado: " + c.getDescricao() + "\n"
                + "Prioridade do chamado" + c.getPrioridade() + "\n" + "Status do chamado: " + c.getStatus() + "\n"
                + "Tipo de problema do chamado: " + c.getTipoProblema() + "\n" + "Tecnico responsovel pelo chamado: "
                + c.getTecnico() + "\n" + "Cliente requisitor do chamado: " + c.getCliente() + "\n";
        
             assertEquals(controle_ch.retornaDetalhesChamado(c),teste);
    }

    
    @Test(timeout = 1)
    public void testAlterarChamado_() {
        controle_ch.alterarChamado();
        controle_ch.fecharTela();
    }

    
    @Test(timeout=1)
    public void testAbrirRelatorio() {
        controle_ch.abrirRelatorio();
    }

    
    @Test(timeout=1)
    public void testFecharTelaAlteracao() {
        controle_ch.alterarChamado();
        controle_ch.fecharTela();
    }

    
    @Test
    public void testValidarQtdChamados_Invalido() {
        
        assertEquals(0,controle_ch.validarQtdChamados(new ClienteEmpresa(11239, new Empresa(0, "Empresa Teste"), 0, "Nome Cliente", 0)) );
        
    }
    
}
