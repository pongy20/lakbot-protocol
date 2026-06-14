package dev.pongy.lakbot.protocol;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OutgoingBotMessage {
    private final BotMessageType type;
    private final String correlationId;
    private final Object payload;
}
