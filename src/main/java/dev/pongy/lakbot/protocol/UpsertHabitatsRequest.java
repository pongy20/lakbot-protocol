package dev.pongy.lakbot.protocol;

import jakarta.validation.constraints.NotNull;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpsertHabitatsRequest {

    @NotNull
    private UUID gameAccountId;

    private int worldId;

    @NotNull
    private List<HabitatEntryRequest> habitats;

    private Long points;
    private Integer ruby;
    private Integer rubyCapacity;
    private Integer sapphire;
    private Integer sapphireCapacity;
    private Integer emerald;
    private Integer emeraldCapacity;
    private Instant lastLoginDate;
}
