package dev.pongy.lakbot.protocol;

import java.time.DayOfWeek;
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
public class BotScheduleEntryResponse {
    private DayOfWeek dayOfWeek;
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;
}
