package dev.pongy.lakbot.protocol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WorldInfo {
    private int worldId;
    private String worldName;
    private Instant lastLoginDate;
}
