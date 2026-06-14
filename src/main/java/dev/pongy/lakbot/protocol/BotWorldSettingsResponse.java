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
public class BotWorldSettingsResponse {
    private UUID worldSettingsId;
    private int worldId;
    private String worldName;
    private boolean botEnabled;
    private boolean missionsEnabled;
    private boolean buildingEnabled;
    private boolean researchEnabled;
    private boolean recruitingEnabled;
    private boolean silverTradingEnabled;
    private boolean copperTradingEnabled;
    private boolean resourceMarketTradingEnabled;
    private boolean resourceTradingEnabled;
    private boolean claimFreeGiftEnabled;
    private boolean allianceHelpEnabled;
    private double allianceHelpPercentage;
    private boolean habitatExpansionEnabled;
    private boolean autoGenerateHabitatExpansionPlans;
}
