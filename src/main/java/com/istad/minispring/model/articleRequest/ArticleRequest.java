package com.istad.minispring.model.articleRequest;

import com.istad.minispring.model.Author;
import com.istad.minispring.model.Category;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleRequest {
    @NotEmpty(message = "title cannot be Empty")
    private String title;
    @NotEmpty(message = "description cannot be Empty")
    private String description;
    private MultipartFile file;

    private int authorID;

    private int categoryID;
}
