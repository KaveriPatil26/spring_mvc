package AEPL_TEST.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import AEPL_TEST.dao.userDao;
import AEPL_TEST.dto.userDto;

@Controller
public class userController {

	@Autowired
	userDao UserDao;

	@RequestMapping("/insert")
	@ResponseBody
	public String insert(@ModelAttribute userDto userDto) {
		UserDao.insert(userDto);
		return "registration done successfully";
	}

}