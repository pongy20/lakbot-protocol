package dev.pongy.lakbot.protocol;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LogEntryRequest {

    @NotNull
    private LogLevel level;

    @NotBlank
    private String message;

    @NotNull
    private Instant occurredAt;

    private Integer gameHabitatId;
}
