package com.kalixia.xbee.api.xbee;

import com.kalixia.xbee.utils.BitSetUtils;

import java.io.Serializable;
import java.util.BitSet;

public interface XBeeTransmit extends XBeeRequest {
    byte getFrameID();
    XBeeAddress getDestination();
    Options getOptions();

    /**
     * bit 0 = disable ack
     * bit 2 = PAN broadcast
     * other bits must be 0
     */
    public class Options implements Serializable {
        private final boolean disableAck;
        private final boolean panBroadcast;

        public Options(boolean disableAck, boolean panBroadcast) {
            this.disableAck = disableAck;
            this.panBroadcast = panBroadcast;
        }

        public byte getValue() {
            BitSet bs = new BitSet(8);
            bs.set(0, disableAck);
            bs.set(2, panBroadcast);
            return BitSetUtils.fromBitSet(bs)[0];
        }

        @Override
        public String toString() {
            return "Options{" +
                    "disableAck=" + disableAck +
                    ", panBroadcast=" + panBroadcast +
                    '}';
        }
    }
}
