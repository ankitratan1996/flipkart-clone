package com.apigateway.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryRequest {

    private Integer categoryId;
    private String categoryTitle;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Set<ProductRequest> product;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("Sub Category List")
    private Set<CategoryRequest>subCategoryRequest;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private CategoryRequest parentCategory;

}
