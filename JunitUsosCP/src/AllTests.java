import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CalculoTeste.class, ContaTest.class, DilemaPrisioneiroTeste.class, Exercicio2.class, MinMax2Test.class,
		MinMaxTest.class, ProdutoTest.class })
public class AllTests {

}
