package dev.pongy.lakbot.protocol;

import java.util.UUID;

public record LoadWorldPayload(UUID gameAccountId, int worldId) {}
