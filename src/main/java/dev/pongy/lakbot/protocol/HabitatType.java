package dev.pongy.lakbot.protocol;

public enum HabitatType {

    CASTLE(0),
    FUTURE_FORTRESS(1),
    FORTRESS(2),
    FUTURE_CITY(3),
    CITY(4),
    FUTURE_METROPOLE(5),
    METROPOLE(6);

    private final int code;

    HabitatType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public HabitatType toTemplateType() {
        return switch (this) {
            case CASTLE, FUTURE_FORTRESS -> CASTLE;
            case FORTRESS, FUTURE_CITY -> FORTRESS;
            case CITY, FUTURE_METROPOLE -> CITY;
            case METROPOLE -> METROPOLE;
        };
    }

    public boolean isTemplateType() {
        return this == CASTLE || this == FORTRESS || this == CITY || this == METROPOLE;
    }

    public static HabitatType fromCode(int code) {
        for (HabitatType type : values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown habitat type code: " + code);
    }
}
