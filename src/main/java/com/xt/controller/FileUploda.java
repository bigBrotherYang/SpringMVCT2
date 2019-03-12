package com.xt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("file")
public class FileUploda {

    public String getFile(@RequestParam(value = "file")CommonsMultipartFile file) throws IOException {
        file.transferTo(new File("/User/"));
        return "success";
    }
}
