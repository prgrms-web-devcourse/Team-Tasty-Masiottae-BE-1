package com.tasty.masiottae.menu.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public record TasteSaveRequest(
        @NotBlank(message = "공백 또는 널 값을 허용하지 않습니다.")
        String tasteName,
        @NotBlank(message = "공백 또는 널 값을 허용하지 않습니다.")
        @Pattern(regexp = "/^#(?:[0-9a-f]{3}){1,2}$/i", message = "올바른 색상 코드 형식이 아닙니다.")
        String tasteColor) {
}
