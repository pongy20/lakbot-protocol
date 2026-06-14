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
public class BotAccountResponse {
    private UUID gameAccountId;
    private String email;
    private String password;
    private List<BotWorldSettingsResponse> worlds;
}
