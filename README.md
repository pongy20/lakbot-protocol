# lakbot-protocol

Shared bot-to-platform contract for the lakbot platform. Contains the WebSocket message envelope,
the `BotMessageType` enum, all bot↔platform WebSocket payload DTOs, and the shared enums/DTOs they
reference (`LogLevel`, `AccountLiveStatus`, `BotWorldSettingsResponse`).

Both the platform backend (`lakbot_backend`) and the bot client (`lakbot_bot`) depend on this
artifact so the two never drift. Plain POJOs — only Jackson (runtime) and Lombok (compile-time).
No Spring, no JPA, no validation dependencies.

## Scope

- **WebSocket contract:** envelope (`IncomingBotMessage`, `OutgoingBotMessage`), `BotMessageType`,
  all `*Payload` types, `WorldInfo`, `AccountStatusEntry`, `AccountLiveStatus`, `LogLevel`.
- **Bot-facing REST DTOs:** `BotAccountResponse`, `BotWorldSettingsResponse`, `HabitatResponse`,
  `TemplateResponse` (+ `TemplateStepResponse`, `BuildingTargetDto`, `KnowledgeTargetDto`,
  `UnitTargetDto`), and the request DTOs `UpsertHabitatsRequest`, `HabitatEntryRequest`,
  `SubmitRunLogsRequest`, `LogEntryRequest`.
- **Shared domain enums:** `HabitatType` (with its code/template-type logic), `TemplateType`.
- **Not included:** platform→browser SSE DTOs (`LiveLogEvent`, `LiveStatusEvent`) stay in the
  backend — they are not part of the bot↔platform contract.

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
    <version>0.2.0</version>
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
