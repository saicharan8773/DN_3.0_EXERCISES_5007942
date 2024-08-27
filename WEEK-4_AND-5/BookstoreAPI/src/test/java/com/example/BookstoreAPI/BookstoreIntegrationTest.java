package com.example.BookstoreAPI;

@SpringBootTest
public class BookstoreIntegrationTest {
    
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void testGetBooks() throws Exception {
        MvcResult result = mockMvc.perform(get("/books"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andReturn();
        
        // Verify the response content
        String responseBody = result.getModelAndView().getModel().toString();
        // ...
    }
}