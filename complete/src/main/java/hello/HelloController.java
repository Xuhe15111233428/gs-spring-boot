package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.HashMap;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/whoareyou")
    public Map<String,String> who(){

        Map<String,String> map = new HashMap<>();
        map.put("name","许鹤");
        map.put("sex","男");
        map.put("blog","xh_heyingweiwei");
        return map;
    }

}
