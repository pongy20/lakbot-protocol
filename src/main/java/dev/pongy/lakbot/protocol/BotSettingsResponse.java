package dev.pongy.lakbot.protocol;

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
public class BotSettingsResponse {

    private UUID botId;
    private boolean enabled;

    private int runIntervalMinMinutes;
    private int runIntervalMaxMinutes;
    private int requestDelayMinSeconds;
    private int requestDelayMaxSeconds;
    private int scheduleOffsetMinutes;

    private double silverTradingThresholdPercent;
    private double copperTradingThresholdPercent;
    private double silverOvernightTradingThresholdPercent;
    private double copperOvernightTradingThresholdPercent;

    private double resourceMarketTradingBuyThresholdPercent;
    private double resourceMarketTradingSellThresholdPercent;

    private int maxPointsForReceivingResources;
    private double maxStoragePercentageToReceiveResources;

    private boolean defaultMissionsEnabled;
    private boolean defaultBuildingEnabled;
    private boolean defaultResearchEnabled;
    private boolean defaultRecruitingEnabled;
    private boolean defaultSilverTradingEnabled;
    private boolean defaultCopperTradingEnabled;
    private boolean defaultResourceMarketTradingEnabled;
    private boolean defaultResourceTradingEnabled;

    private boolean requestSilverForHabitatExpansion;

    private List<BotScheduleEntryResponse> schedule;
}
