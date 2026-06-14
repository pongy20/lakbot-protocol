package dev.pongy.lakbot.protocol;

import java.util.UUID;

public record PasswordChangedPayload(UUID gameAccountId, String email, String password) {}
