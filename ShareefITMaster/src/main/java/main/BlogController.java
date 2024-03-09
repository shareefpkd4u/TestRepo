package main;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/")
    public String index(Model model) {
        // Retrieve blog post data from a database or any other source
        // You can then pass the data to the view (index.html)
        // For simplicity, let's assume the blog posts are hard-coded here
        List<BlogPost> blogPosts = Arrays.asList(
                new BlogPost("First Post", "This is my first blog post."),
                new BlogPost("Second Post", "This is my second blog post.")
        );
        
        model.addAttribute("blogPosts", blogPosts);
        return "index";
    }
}

