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
        summary = "get all expressions",
        description = "returns list of expressions"
)
@ApiResponse(
        responseCode = "200",
        description = "list of expressions, will not contain items if there were no requests",
        content = {
                @Content(mediaType = "application/String", schema =
                @Schema(description = "expression list", example = "{\"expressions\": [ { \"expression\": \"2 + 2\", \"result\": 4 } ] }"))
        }
)
public @interface GetAllCalculations {

}
