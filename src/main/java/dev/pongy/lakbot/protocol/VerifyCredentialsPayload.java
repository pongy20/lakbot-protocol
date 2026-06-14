package dev.pongy.lakbot.protocol;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VerifyCredentialsPayload {
    private String email;
    private String password;
}
