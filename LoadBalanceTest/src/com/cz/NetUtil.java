package com.cz;

import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.Set;

public class NetUtil
{
    public static InetAddress getInetAddress()
    {
        try
        {
            return InetAddress.getLocalHost();
        }
        catch (UnknownHostException e)
        {
            System.out.println("Unknown host!");
        }
        return null;
    }

    public static String getHostIp(InetAddress netAddress)
    {
        if (netAddress == null) {
            return null;
        }
        String ip = netAddress.getHostAddress();
        return ip;
    }

    public static String getHostName(InetAddress netAddress)
    {
        if (netAddress == null) {
            return null;
        }
        String name = netAddress.getHostName();
        return name;
    }

    public static void main(String[] args)
    {
        InetAddress netAddress = getInetAddress();
        System.out.println("Host IP:" + getHostIp(netAddress));
        System.out.println("Host Name:" + getHostName(netAddress));
        System.out.println("");
        Properties properties = System.getProperties();
        Set<String> set = properties.stringPropertyNames();
        for (String name : set) {
            System.out.println(name + ":" + properties.getProperty(name));
        }
    }
}
