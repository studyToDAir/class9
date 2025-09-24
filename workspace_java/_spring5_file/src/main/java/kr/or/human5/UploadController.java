package kr.or.human5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UploadController {

	@RequestMapping("/upload.view")
	public String view() {
		return "uploadForm";
	}
	
}
