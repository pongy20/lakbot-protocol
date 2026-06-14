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
public class AccountStatusEntry {
    private UUID gameAccountId;
    private AccountLiveStatus status;
    private String message;
    private Instant nextRunAt;
}
