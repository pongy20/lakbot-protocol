package dev.pongy.lakbot.protocol;

import java.time.Instant;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LiveLogPayload {
    private LogLevel level;
    private String message;
    private UUID gameAccountId;
    private Instant occurredAt;
}
