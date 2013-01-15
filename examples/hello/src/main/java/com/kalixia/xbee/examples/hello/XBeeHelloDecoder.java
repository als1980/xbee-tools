package com.kalixia.xbee.examples.hello;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundMessageHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XBeeHelloDecoder extends ChannelInboundMessageHandlerAdapter<String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(XBeeHelloDecoder.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        ctx.write("hello\n");
    }

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, String msg) throws Exception {
        if ("exit".equals(msg)) {
            ctx.close();
            return;
        }
        LOGGER.info("Received {}", msg);
    }
}
