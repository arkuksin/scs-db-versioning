package de.kuksin.dbversioning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@ActiveProfiles("test")
@SpringBootTest
class PostResourceTest {

    @Autowired
    private MockMvc mvc;

    @Test
    void getUserByIdShouldReturnOk() throws Exception {
        mvc.perform(get("/posts/cbe4d04f-28ff-4e4f-8c6a-83345f77b24d"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("SCS")));
    }
}
