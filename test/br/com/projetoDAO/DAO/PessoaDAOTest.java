package br.com.projetoDAO.DAO;
import br.com.projetoDAO.model.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PessoaDAOTest {

    Pessoa p1;
    Pessoa p2;
    Pessoa p3;
    
    
    

    public PessoaDAOTest() {

        p1 = new Pessoa("maria", "professora");
        p2 = new Pessoa("luana", "Aluna");
       
        
       
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Antes da classe");
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of consulta method, of class PessoaDAO.
     */
    @Test
    public void testConsulta() {
        System.out.println("consulta");
        PessoaDAO instance = new PessoaDAO();
        assertTrue(instance.consulta());
        
    }
   @Test
    public void testinserir() {
        System.out.println("inserir");
        PessoaDAO instance = new PessoaDAO();
        assertTrue(instance.inserir(p1));
        
    }
    @Test
    public void testeditar() {
        System.out.println("Editar");
        PessoaDAO instance = new PessoaDAO();
        assertTrue(instance.editar(p2));
        
    }
    @Test
    public void testexcluir() {
        System.out.println("excluir");
        PessoaDAO instance = new PessoaDAO();
        assertTrue(instance.excluir());
        
    }
}
