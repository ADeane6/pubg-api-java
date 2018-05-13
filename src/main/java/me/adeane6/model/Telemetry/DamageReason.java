package me.adeane6.model.Telemetry;

public enum DamageReason {
    ARM_SHOT("ArmShot"),
    HEAD_SHOT("HeadShot"),
    LEG_SHOT("LegShot"),
    NONE("None"),
    NON_SPECIFIC("NonSpecific"),
    PELVIS_SHOT("PelvisShot"),
    TORSO_SHOT("TorsoShot");

    private final String reason;

    DamageReason(final String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return reason;
    }
}
