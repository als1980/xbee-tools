package com.kalixia.xbee.api.xbee;

public class XBeeAddress64 implements XBeeAddress {
    private final long address;
    public static final XBeeAddress16 BROADCAST = new XBeeAddress16(0x0000FFFF);

    public XBeeAddress64(long address) {
        this.address = address;
    }

    public long getValue() {
        return address;
    }

    @Override
    public XBeeAddress broadcast() {
        return broadcast();
    }

    public int getLength() {
        return 8;
    }

    @Override
    public String toString() {
        return "0x" + Long.toHexString(address);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        XBeeAddress64 that = (XBeeAddress64) o;

        if (address != that.address) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) (address ^ (address >>> 32));
    }
}
