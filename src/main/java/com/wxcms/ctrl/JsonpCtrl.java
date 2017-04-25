/**
 * 
 */
package com.wxcms.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangsw
 *
 */
@Controller
@RequestMapping("/jsonp")
public class JsonpCtrl {

	@ResponseBody
	@RequestMapping("/reJson")
	public String jsonP(){
		return "{'id': 123, 'name' : 张三, 'age': 17}";
	}
}
