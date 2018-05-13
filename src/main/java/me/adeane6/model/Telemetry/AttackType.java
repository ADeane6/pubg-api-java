package me.adeane6.model.Telemetry;

public enum AttackType {
    RED_ZONE("RedZone"),
    WEAPON("Weapon");

    private final String type;

    AttackType(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}