package com.Kh033Java.travelbook.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Kh033Java.travelbook.service.FileUploadService;

@RestController
public class PhotoUploadController {

    private final FileUploadService fileUploadService;

    public PhotoUploadController(FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile fileStream) throws IOException {
        fileUploadService.setFile(fileStream);
        return fileUploadService.saveFile();
    }
}
