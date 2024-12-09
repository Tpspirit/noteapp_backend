package fi.khoiphan.noteapp_backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NoteController {

    @ResponseBody
    @GetMapping("/")
    public String index(){
        return "Hello World!";
    }
}
