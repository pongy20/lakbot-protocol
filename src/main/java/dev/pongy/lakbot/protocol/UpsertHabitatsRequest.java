package dev.pongy.lakbot.protocol;

import jakarta.validation.constraints.NotNull;
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
public class UpsertHabitatsRequest {

    @NotNull
    private UUID gameAccountId;

    private int worldId;

    @NotNull
    private List<HabitatEntryRequest> habitats;
}
