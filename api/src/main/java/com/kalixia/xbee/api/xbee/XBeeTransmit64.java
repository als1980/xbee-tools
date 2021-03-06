package com.kalixia.xbee.api.xbee;

import io.netty.buffer.ByteBuf;

public class XBeeTransmit64 implements XBeeTransmit {
    private final byte frameID;
    private final XBeeAddress64 destination;
    private final Options options;
    private final byte[] data;

    public XBeeTransmit64(byte frameID, XBeeAddress64 destination, Options options, byte[] data) {
        this.frameID = frameID;
        this.destination = destination;
        this.options = options;
        this.data = data;
    }

    public byte getFrameID() {
        return frameID;
    }

    public XBeeAddress64 getDestination() {
        return destination;
    }

    public Options getOptions() {
        return options;
    }

    public byte[] getData() {
        return data;
    }

    @Override
    public ByteBuf serialize() {
        // TODO: write this!
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "XBeeTransmit64{" +
                "destination=" + destination +
                ", options=" + options +
                '}';
    }
}
