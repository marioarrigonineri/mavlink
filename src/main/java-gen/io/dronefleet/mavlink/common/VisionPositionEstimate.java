package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;

/**
 * Global position/attitude estimate from a vision source. 
 */
@MavlinkMessageInfo(
        id = 102,
        crc = 158,
        description = "Global position/attitude estimate from a vision source."
)
public final class VisionPositionEstimate {
    private final BigInteger usec;

    private final float x;

    private final float y;

    private final float z;

    private final float roll;

    private final float pitch;

    private final float yaw;

    private final List<Float> covariance;

    private VisionPositionEstimate(BigInteger usec, float x, float y, float z, float roll,
            float pitch, float yaw, List<Float> covariance) {
        this.usec = usec;
        this.x = x;
        this.y = y;
        this.z = z;
        this.roll = roll;
        this.pitch = pitch;
        this.yaw = yaw;
        this.covariance = covariance;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Timestamp (UNIX time or time since system boot) 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 8,
            description = "Timestamp (UNIX time or time since system boot)"
    )
    public final BigInteger usec() {
        return this.usec;
    }

    /**
     * Global X position 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4,
            description = "Global X position"
    )
    public final float x() {
        return this.x;
    }

    /**
     * Global Y position 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            description = "Global Y position"
    )
    public final float y() {
        return this.y;
    }

    /**
     * Global Z position 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            description = "Global Z position"
    )
    public final float z() {
        return this.z;
    }

    /**
     * Roll angle 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            description = "Roll angle"
    )
    public final float roll() {
        return this.roll;
    }

    /**
     * Pitch angle 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            description = "Pitch angle"
    )
    public final float pitch() {
        return this.pitch;
    }

    /**
     * Yaw angle 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4,
            description = "Yaw angle"
    )
    public final float yaw() {
        return this.yaw;
    }

    /**
     * Pose covariance matrix upper right triangular (first six entries are the first ROW, next five 
     * entries are the second ROW, etc.) 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4,
            arraySize = 21,
            extension = true,
            description = "Pose covariance matrix upper right triangular (first six entries are the first ROW, next five entries are the second ROW, etc.)"
    )
    public final List<Float> covariance() {
        return this.covariance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        VisionPositionEstimate other = (VisionPositionEstimate)o;
        if (!Objects.deepEquals(usec, other.usec)) return false;
        if (!Objects.deepEquals(x, other.x)) return false;
        if (!Objects.deepEquals(y, other.y)) return false;
        if (!Objects.deepEquals(z, other.z)) return false;
        if (!Objects.deepEquals(roll, other.roll)) return false;
        if (!Objects.deepEquals(pitch, other.pitch)) return false;
        if (!Objects.deepEquals(yaw, other.yaw)) return false;
        if (!Objects.deepEquals(covariance, other.covariance)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(usec);
        result = 31 * result + Objects.hashCode(x);
        result = 31 * result + Objects.hashCode(y);
        result = 31 * result + Objects.hashCode(z);
        result = 31 * result + Objects.hashCode(roll);
        result = 31 * result + Objects.hashCode(pitch);
        result = 31 * result + Objects.hashCode(yaw);
        result = 31 * result + Objects.hashCode(covariance);
        return result;
    }

    @Override
    public String toString() {
        return "VisionPositionEstimate{usec=" + usec
                 + ", x=" + x
                 + ", y=" + y
                 + ", z=" + z
                 + ", roll=" + roll
                 + ", pitch=" + pitch
                 + ", yaw=" + yaw
                 + ", covariance=" + covariance + "}";
    }

    public static final class Builder {
        private BigInteger usec;

        private float x;

        private float y;

        private float z;

        private float roll;

        private float pitch;

        private float yaw;

        private List<Float> covariance;

        /**
         * Timestamp (UNIX time or time since system boot) 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 8,
                description = "Timestamp (UNIX time or time since system boot)"
        )
        public final Builder usec(BigInteger usec) {
            this.usec = usec;
            return this;
        }

        /**
         * Global X position 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4,
                description = "Global X position"
        )
        public final Builder x(float x) {
            this.x = x;
            return this;
        }

        /**
         * Global Y position 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                description = "Global Y position"
        )
        public final Builder y(float y) {
            this.y = y;
            return this;
        }

        /**
         * Global Z position 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                description = "Global Z position"
        )
        public final Builder z(float z) {
            this.z = z;
            return this;
        }

        /**
         * Roll angle 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                description = "Roll angle"
        )
        public final Builder roll(float roll) {
            this.roll = roll;
            return this;
        }

        /**
         * Pitch angle 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                description = "Pitch angle"
        )
        public final Builder pitch(float pitch) {
            this.pitch = pitch;
            return this;
        }

        /**
         * Yaw angle 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4,
                description = "Yaw angle"
        )
        public final Builder yaw(float yaw) {
            this.yaw = yaw;
            return this;
        }

        /**
         * Pose covariance matrix upper right triangular (first six entries are the first ROW, next five 
         * entries are the second ROW, etc.) 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4,
                arraySize = 21,
                extension = true,
                description = "Pose covariance matrix upper right triangular (first six entries are the first ROW, next five entries are the second ROW, etc.)"
        )
        public final Builder covariance(List<Float> covariance) {
            this.covariance = covariance;
            return this;
        }

        public final VisionPositionEstimate build() {
            return new VisionPositionEstimate(usec, x, y, z, roll, pitch, yaw, covariance);
        }
    }
}
