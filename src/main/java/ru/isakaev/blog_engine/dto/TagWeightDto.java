package ru.isakaev.blog_engine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TagWeightDto {

    private String tagName;
    private Double weight;
}
