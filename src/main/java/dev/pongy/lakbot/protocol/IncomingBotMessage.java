package dev.pongy.lakbot.protocol;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IncomingBotMessage {
    private BotMessageType type;
    private String correlationId;
    private JsonNode payload;
}
