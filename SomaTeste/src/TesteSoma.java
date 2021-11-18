import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import metodos.Somar;

class TesteSoma {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		
		Somar s = new Somar();
		
		int a = 1;
		int b = 1;
		int resultadoesp = 2;
		int result = s.somar(a, b);
		
		assertEquals(resultadoesp, result, 0);
		
		
//		fail("Not yet implemented");
	}

}
