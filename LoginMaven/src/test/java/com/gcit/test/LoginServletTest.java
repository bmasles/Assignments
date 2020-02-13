package com.gcit.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.gcit.servlet.LoginServlet;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

class LoginServletTest {

	@Mock
	HttpServletRequest request;

	@Mock
	HttpServletResponse response;

	@BeforeEach
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testDoPostHttpServletRequestHttpServletResponse() {
		Gson gson = new Gson();
		JsonObject jOb = new JsonObject();
		jOb.add("username", new JsonPrimitive("burkemasles"));
		jOb.add("password", new JsonPrimitive("smoothstack"));
		Reader inputString = new StringReader(gson.toJson(jOb));
		BufferedReader reader = new BufferedReader(inputString);
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		try {
			when(request.getReader()).thenReturn(reader);
			when(response.getWriter()).thenReturn(pw);
		} catch (IOException e) {
			fail("IOException");
		}
		LoginServlet ls = new LoginServlet();
		try {
			ls.doPost(request, response);
		} catch (ServletException | IOException e) {
			fail("Could not send mocked request and response");
		}
		String result = sw.getBuffer().toString();
		assertTrue(result.contains("Username and Password Correct!!!"));
	}

}
