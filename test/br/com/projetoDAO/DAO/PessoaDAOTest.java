package br.com.projetoDAO.DAO;
import br.com.projetoDAO.model.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class PessoaDAOTest {

    Pessoa p1;
    Pessoa p2;
    Pessoa p3;

    public PessoaDAOTest() {

      // p1 = new Pessoa("maria", "professora");
      // p2 = new Pessoa("luana", "Aluna");
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
    @Ignore
    public void testConsulta() {
        System.out.println("consulta");
        PessoaDAO instance = new PessoaDAO();
        assertTrue(instance.consulta());
        
    }
   @Test
   @Ignore
    public void testinserir() {
        System.out.println("inserir");
        PessoaDAO instance = new PessoaDAO();
        Pessoa p1 = new Pessoa("ana paula", "Aluna");
        assertTrue(instance.inserir(p1));
        
    }
    @Test
    @Ignore
    public void testeditar() {
        System.out.println("Editar");
        PessoaDAO instance = new PessoaDAO();
        Pessoa p2 = new Pessoa(6, "Maria", "Professora");
        assertTrue(instance.editar(p2));
        
    }
    @Test
    @Ignore
    
    public void testexcluir() {
        System.out.println("excluir");
        PessoaDAO instance = new PessoaDAO();
        assertTrue(instance.excluir(3));
        
    }
    @Test
    @Ignore
    
    public void consultaID() {
        System.out.println("excluir");
        PessoaDAO cpid = new PessoaDAO();
        assertTrue(cpid.excluir(3));
        
    }
}
