package edu.miu.lab3.controller;

import edu.miu.lab3.dto.CategoryDto;
import edu.miu.lab3.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping()
    public List<CategoryDto> get() {
        return categoryService.get();
    }

    @GetMapping("/{id}")
    public CategoryDto get(@PathVariable int id) {
        return categoryService.get(id);
    }

    @PostMapping()
    public CategoryDto post(@RequestBody CategoryDto c) {
        return categoryService.add(c);
    }

    @PutMapping("/{id}")
    public boolean put(@PathVariable int id, @RequestBody CategoryDto c) {
        categoryService.update(id, c);
        return true;
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        categoryService.delete(id);
        return true;
    }

}