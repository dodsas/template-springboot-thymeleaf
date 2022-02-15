package ys.web.template

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class WebController {
    @GetMapping("/")

    fun main(model: Model): String {
        model.addAttribute("name", "홍길순")
        return "index_bkk"
    }
}