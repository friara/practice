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
        summary = "subtracts parameters",
        description = "returns result of expressions"
)
@ApiResponse(
        responseCode = "200",
        description = "returns a result",
        content = {
                @Content(mediaType = "application/string", schema =
                @Schema(description = "expression", example = "{ \"expression\": \"8 - 3\", \"result\": 5 } "))
        }
)
public @interface MinusMetod {
}