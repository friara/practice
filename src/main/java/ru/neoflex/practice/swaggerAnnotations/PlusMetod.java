package ru.neoflex.practice.swaggerAnnotations;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Operation(
        summary = "summarizes parameters",
        description = "returns result of expressions"
)
@ApiResponse(
        responseCode = "200",
        description = "returns a result",
        content = {
                @Content(mediaType = "application/String", schema =
                @Schema(description = "expression", example = "{ \"expression\": \"2 + 2\", \"result\": 4 } "))
        }
)
public @interface PlusMetod {
}
