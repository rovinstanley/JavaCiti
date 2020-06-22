package citiCollege;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class BlogController {
    @Autowired
    BlogRepository blogRepository;
    @GetMapping("/blog")
    public List<Blog> index()
    {
        return blogRepository.findAll();
    }
    @GetMapping("/blog/{id}")
    public Optional<Blog> show(@PathVariable String id)
    {
        int someId = Integer.parseInt(id);
        return blogRepository.findById(someId);
    }
    @PostMapping("/blog")
    public Blog create (@RequestBody Map<String,String> body)
    {
        String title = body.get("title");
        String content = body.get("Content");
        return blogRepository.save(new Blog(title, content));
    }

    @PutMapping("/blog/{id}")
    public Blog update (@PathVariable String id, @RequestBody Map<String,String>body)
    {
        int blogId = Integer.parseInt(id);
        Optional<Blog>blog = blogRepository.findById(blogId);
        blog.get().setTitle(body.get("title"));
        blog.get().setContent(body.get("content"));

        return blogRepository.save(blog.get());
    }
    @DeleteMapping ("/blog/{id}")
    public boolean delete (@PathVariable String id)
    {
        int someId = Integer.parseInt(id);
        Optional<Blog>blog = blogRepository.findById(someId);
        blogRepository.delete(blog.get());
        return true;
    }
}
