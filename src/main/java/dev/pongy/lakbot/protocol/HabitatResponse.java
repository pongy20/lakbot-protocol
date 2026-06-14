package dev.pongy.lakbot.protocol;

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
public class HabitatResponse {
    private UUID id;
    private int gameHabitatId;
    private HabitatType habitatType;
    private String name;
    private Long points;
    private boolean missionsEnabled;
    private boolean buildingEnabled;
    private boolean researchEnabled;
    private boolean recruitingEnabled;
    private boolean silverTradingEnabled;
    private boolean copperTradingEnabled;
    private boolean resourceMarketTradingEnabled;
    private boolean resourceTradingEnabled;
}
