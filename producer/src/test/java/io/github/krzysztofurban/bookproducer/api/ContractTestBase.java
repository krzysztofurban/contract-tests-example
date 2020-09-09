package io.github.krzysztofurban.bookproducer.api;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
abstract class ContractTestBase {
	@BeforeEach
	void setup() {
		BookController bookController = new BookController();
		RestAssuredMockMvc.standaloneSetup(bookController);
	}
}
