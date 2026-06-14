# lakbot-protocol

Shared bot-to-platform contract for the lakbot platform. Contains the WebSocket message envelope,
the `BotMessageType` enum, all bot↔platform WebSocket payload DTOs, and the shared enums/DTOs they
reference (`LogLevel`, `AccountLiveStatus`, `BotWorldSettingsResponse`).

Both the platform backend (`lakbot_backend`) and the bot client (`lakbot_bot`) depend on this
artifact so the two never drift. Plain POJOs — only Jackson (runtime) and Lombok (compile-time).
No Spring, no JPA, no validation dependencies.

## Scope

- **Included (phase 1 – WebSocket contract):** envelope (`IncomingBotMessage`, `OutgoingBotMessage`),
  `BotMessageType`, all `*Payload` types, `WorldInfo`, `AccountStatusEntry`, `AccountLiveStatus`,
  `LogLevel`, and `BotWorldSettingsResponse` (referenced by `AccountAssignedPayload`).
- **Not included:** platform→browser SSE DTOs (`LiveLogEvent`, `LiveStatusEvent`) stay in the
  backend. Pure REST response DTOs (`BotAccountResponse`, `HabitatResponse`, `TemplateResponse`) are
  documented via the backend OpenAPI spec and are planned for a phase-2 addition here.

## Consume via JitPack

After the repo is pushed to `github.com/pongy20/lakbot-protocol` and a tag is created:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.pongy20</groupId>
    <artifactId>lakbot-protocol</artifactId>
    <version>0.1.1</version>
</dependency>
```

## Local development

Before the GitHub repo / tag exists, install to the local Maven repository so consumers resolve it
without JitPack:

```bash
mvn install
```

## Versioning

- Additive changes (new optional fields, new `BotMessageType` values) are backward compatible.
  Consumers must deserialize leniently (`FAIL_ON_UNKNOWN_PROPERTIES = false`) and ignore unknown
  message types.
- Breaking changes bump the major version and require a coordinated platform + bot release.
