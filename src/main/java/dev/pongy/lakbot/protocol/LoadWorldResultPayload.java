package dev.pongy.lakbot.protocol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Bot → platform reply to a {@code LOAD_WORLD} request, echoing the same {@code correlationId}. The
 * bot logs into the world and upserts its state (points, gemstones, habitats) via
 * {@code POST /api/bot/habitats/upsert} before sending this, so on {@code success} the platform can
 * read the freshly persisted world stats. On failure {@code errorMessage} describes the cause.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoadWorldResultPayload {
    private boolean success;
    private int worldId;
    private String errorMessage;
}
