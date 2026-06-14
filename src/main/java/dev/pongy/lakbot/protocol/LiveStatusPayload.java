package dev.pongy.lakbot.protocol;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LiveStatusPayload {
    private List<AccountStatusEntry> accounts;
}
