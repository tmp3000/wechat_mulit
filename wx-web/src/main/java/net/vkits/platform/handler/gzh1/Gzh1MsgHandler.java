package net.vkits.platform.handler.gzh1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.vkits.platform.config.WxConfig;
import net.vkits.platform.config.WxGzh1Config;
import net.vkits.platform.handler.MsgHandler;

@Component
public class Gzh1MsgHandler extends MsgHandler {
  @Autowired
  private  WxGzh1Config wxConfig;

  @Override
  protected WxConfig getWxConfig() {
    return this.wxConfig;
  }

}
