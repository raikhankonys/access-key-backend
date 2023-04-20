package com.example.accesskeybackend.template.controller;

import com.example.accesskeybackend.template.service.CheckIpService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/web")
@AllArgsConstructor
public class CheckIpv6SupportController {

    private final CheckIpService checkIpService;

    @GetMapping("/checkIpv6Support")
    public boolean checkIpv6Support(
            @RequestParam String siteUrl
    ) throws IOException {
        return checkIpService.checkIpv6Support(siteUrl);
    }

}
