package net.vkits.platform.wxService;

import net.vkits.platform.config.WxConfig;
import net.vkits.platform.config.WxGzh1Config;
import net.vkits.platform.handler.*;
import net.vkits.platform.handler.gzh1.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gzh1WxService extends BaseWxService {
    @Autowired
    private WxGzh1Config wxConfig;

    @Autowired
    private Gzh1LocationHandler locationHandler;

    @Autowired
    private Gzh1MenuHandler menuHandler;

    @Autowired
    private Gzh1MsgHandler msgHandler;

    @Autowired
    private Gzh1UnSubscribeHandler unSubscribeHandler;

    @Autowired
    private Gzh1ScanHandler scanHandler;

    @Autowired
    private Gzh1SubscribeHandler subscribeHandler;

    @Override
    protected WxConfig getServerConfig() {
        return this.wxConfig;
    }

    @Override
    protected MenuHandler getMenuHandler() {
        return this.menuHandler;
    }

    @Override
    protected SubscribeHandler getSubscribeHandler() {
        return this.subscribeHandler;
    }

    @Override
    protected UnsubscribeHandler getUnsubscribeHandler() {
        return this.unSubscribeHandler;
    }

    @Override
    protected AbstractHandler getLocationHandler() {
        return this.locationHandler;
    }

    @Override
    protected MsgHandler getMsgHandler() {
        return this.msgHandler;
    }

    @Override
    protected AbstractHandler getScanHandler() {
        return this.scanHandler;
    }

}
