package ru.ronin52.skillboxtestapp.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class ContentDto {
    @NotNull
    @NotBlank
    @Size(min = 3, max = 10)
    private String content;
}
