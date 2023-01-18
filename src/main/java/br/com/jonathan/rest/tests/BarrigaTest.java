package br.com.jonathan.rest.tests;

import static io.restassured.RestAssured.given;

import org.junit.Test;

import br.com.jonathan.rest.core.BaseTest;

public class BarrigaTest extends BaseTest {

	@Test
	public void naoDeveAcessarAPISemToken() {
		given()
		.when()
			.get("/contas")
		.then()
			.statusCode(401);
	}
}
