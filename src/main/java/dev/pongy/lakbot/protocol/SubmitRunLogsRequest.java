package dev.pongy.lakbot.protocol;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubmitRunLogsRequest {

    @NotNull
    private UUID gameAccountId;

    @NotNull
    private Instant startedAt;

    @NotNull
    private Instant endedAt;

    @NotNull
    @NotEmpty
    @Valid
    private List<LogEntryRequest> entries;
}
