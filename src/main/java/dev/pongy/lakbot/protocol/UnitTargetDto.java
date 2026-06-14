package dev.pongy.lakbot.protocol;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UnitTargetDto {

    @NotBlank
    private String unitType;

    @Min(0)
    private int targetCount;
}
