package com.twjitm.core.common.config.global;import org.jdom2.Element;/** * @author EGLS0807 - [Created on 2018-08-22 18:27] * @company http://www.g2us.com/ * @jdk java version "1.8.0_77" */public class NettyGameConfig {    private String serverName;    private String serverId;    private String serverHost;    private int serverPort;    public void init(Element element){        serverName = element.getChildTextTrim("name");        serverId = element.getChildTextTrim("serverId");        serverHost = element.getChildTextTrim("ip");        serverPort = Integer.parseInt(element.getChildTextTrim("port"));    }    public String getServerName() {        return serverName;    }    public String getServerId() {        return serverId;    }    public String getServerHost() {        return serverHost;    }    public int getServerPort() {        return serverPort;    }}