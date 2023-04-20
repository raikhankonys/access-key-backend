package com.example.accesskeybackend.template.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.URL;

@Service
@AllArgsConstructor
@Log4j2
public class CheckIpService {

    public boolean checkIpv6Support(String siteUrl) throws IOException {
        InetAddress address = InetAddress.getByName(new URL(siteUrl).getHost());

        return address instanceof Inet6Address;
    }
}
