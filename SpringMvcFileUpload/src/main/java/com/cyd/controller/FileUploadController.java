package com.cyd.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	// @RequestMapping内部没有限定请求方法的话，可以支持post、get、update、delete等任一类型请求
	@RequestMapping(value="/upload",method=RequestMethod.POST) 
	public String fileupload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest req) throws IOException {
		//获取文件名
//		file.getOriginalFilename();
		// 获取上传文件的路径
		String contextPath = req.getContextPath();//"/SpringMvcFileUpload"
        String servletPath = req.getServletPath();//"/upload"
        String scheme = req.getScheme();//"http"
		String path = req.getRealPath("/fileupload");//D:\Java\J2EE\WorkSpace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\SpringMvcFileUpload\fileupload
		// 将文件上传到工程所在目录文件fileupload中
//        String path ="D:\\Java\\Spring\\spring\\SpringMvcFileUpload\\src\\main\\webapp\\fileupload";
        InputStream is = file.getInputStream();
		OutputStream os = new FileOutputStream(new File(path, file.getOriginalFilename()));
		int len = 0;
		byte[] buffer = new byte[400];
		while((len=is.read(buffer)) != -1) {
			os.write(buffer, 0, len);
		}
		os.flush();
		os.close();
		is.close();
		return "index.jsp";
	}
	
}
