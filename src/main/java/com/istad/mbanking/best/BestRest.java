package com.istad.mbanking.best;

import lombok.Builder;

import javax.swing.text.StyledEditorKit;
import java.time.LocalDateTime;

@Builder
public record BestRest <T>(
        boolean status, Integer code, String message, LocalDateTime timeStamp, T data
) { }
