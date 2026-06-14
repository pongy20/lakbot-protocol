package dev.pongy.lakbot.protocol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HabitatEntryRequest {
    private int gameHabitatId;
    private HabitatType habitatType;
    private String name;
    private Long points;
}
