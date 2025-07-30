/*
package com.malloc.regex.adapters.in.rest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;

import com.malloc.regex.application.port.in.MatchRegexUseCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(RegexController.class)
class MatchRegexControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockitoBean
  private MatchRegexUseCase matchRegexUseCase;

  @Test
  void shouldMatchRegex() throws Exception {
    when(matchRegexUseCase.match(any())).thenReturn(true);

    mockMvc.perform(post("/regex/match")
            .contentType(MediaType.APPLICATION_JSON)
            .content("""
            {
              "regex": "^[a-z]+$",
              "input": "hello"
            }
        """))
        .andExpect(status().isOk())
        .andExpect(content().string("true"));
  }
}
*/
