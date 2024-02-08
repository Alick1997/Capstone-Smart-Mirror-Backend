package com.capstonesmartmirror.controller;

import com.capstonesmartmirror.dto.SynchronizeReq;
import com.capstonesmartmirror.dto.SynchronizeResp;
import com.capstonesmartmirror.service.SynchronizeMirrorService;
import com.capstonesmartmirror.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("mirror")
public class mirrorController {

    private final SynchronizeMirrorService synchronizeMirrorService;
    private final UserService userService;

    @PostMapping("/synchronize")
    public SynchronizeResp synchronizeMirror(
            @RequestBody SynchronizeReq synchronizeReq
            ) {
    return synchronizeMirrorService.synchronizeData(
            synchronizeReq,
            userService.getUserById("Alick19")
    );
    }

}
